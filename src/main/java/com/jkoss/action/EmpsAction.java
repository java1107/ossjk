package com.jkoss.action;

import java.io.File;
import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.Empfiles;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.pojo.oa.Salary;
import com.jkoss.tool.DbCommonMethod;
import com.jkoss.tool.Page;




@Controller
@RequestMapping("/oa")
public class EmpsAction implements Serializable {

	 @Autowired
     private IEmpsBiz  ebiz;
	 
	 
	 @RequestMapping("/lgn")
	 public String login(Emps ems,Model modl,HttpServletRequest req){
		 
		   Emps u =  ebiz.login(ems);
		   
		   if(u.getRights()!=null && u.getRights().size()>0){
			 /*  for (Sysright rt : u.getRights()) {
				 System.out.println("   "+rt.getRtname());
			   }*/
		   }
		   
			 //检查application中部门信息
			 if(req.getServletContext().getAttribute("dpts")==null){
				 req.getServletContext().setAttribute("dpts",ebiz.listDepts());
			 }
		   
		 //  System.out.println(u.getDetail().getEaddress());
		   if(u!=null){
			   
			   EmpJobs  job =  ebiz.findJobByID(u.getJobid());
			   u.setEjob(job);
			   
			   req.getSession().setAttribute("lgnUsr", u);
		   }else{
			   modl.addAttribute("msg", "登录失败");
			   return "/index.jsp";
		   }
		 
		 return "/main.jsp";
	 }
	
	 @RequestMapping("/lgout")
	 public String logout(HttpServletRequest req){
		 req.getSession().invalidate();
		 return "/index.jsp";
	 }
	 
	 @RequestMapping("/lsD")
	 public String listDept(HttpServletRequest req,Page<Department> page){
		 
		 if(page==null){
			 page = new Page<Department>();
		 }
		 
			page.setResults( ebiz.listPageDepts(page));
			 
			req.setAttribute("page", page);
			
		 return "/oa/listdept.jsp";
	 }
	 
	 
	 /////////////-------------部门-》
	 @RequestMapping("/addD")
	 public String addDept(Department  dpt,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.addDept(dpt));
		 return listDept(req,null);
	 }
	 
	 @RequestMapping(value="/ajOneDpt",produces="text/html;charset=UTF-8")
     @ResponseBody
	 public String toUpdateDept(int  dptID){	 
		 return JSONObject.toJSONString(ebiz.findDeptByID(dptID)).toString();
	 }
	 
	 @RequestMapping(value="/oneDpt")
	 public String oneDept(int  dptID,  HttpServletRequest req){	 
		 req.setAttribute("dpt",  ebiz.findDeptByID(dptID));
		 return "/oa/shDpt.jsp";
	 }
	 
	 @RequestMapping("/updD")
	 public String updtDept(Department  dpt,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.updtDept(dpt));
		 return listDept(req,null);
	 }
	 
	 @RequestMapping("/delD")
	 public String deleteDept(int  dptID,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.deleteDept(dptID));
		 return listDept(req,null);
	 }
	
	 /////////////-------------    部门   《--  
	 
	 ////////////////////    岗位部门-》
	 @RequestMapping("/lsJb")
	 public String listJobs(HttpServletRequest req,Page<EmpJobs> page,Integer depID){
		 
		 if(page==null){
			 page = new Page<EmpJobs>();
		 }
		 
		 //检查application中部门信息
		 if(req.getServletContext().getAttribute("dpts")==null){
			 req.getServletContext().setAttribute("dpts",ebiz.listDepts());
		 }
		 
		if(depID==null){
			Emps emp =(Emps) req.getSession().getAttribute("lgnUsr");
			depID = emp.getEjob().getDepID();
		}
		
		page.setResults(ebiz.findJobsByDid(depID));
		 
	    req.setAttribute("page", page);
			
		 return "/oa/listjobs.jsp";
	 }
	 
	 @RequestMapping("/addJB")
	 public String addJob(EmpJobs  jobs,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.addJob(jobs) );
		 return listJobs(req,null,null);
	 }
	 
	 @RequestMapping(value="/oneJobs")
	 public String oneJobs(int  jobid,  HttpServletRequest req){	
		 EmpJobs j = ebiz.findJobByID(jobid);
         j.setDpt(ebiz.findDeptByID(j.getDepID()));
		 req.setAttribute("job", j );
		 return "/oa/shJob.jsp";
	 }
	 
	 @RequestMapping(value="/upJob1")
	 public String upJobs1(int  jobid,  HttpServletRequest req){	
		 oneJobs(jobid, req);
		 return "/oa/upJob.jsp";
	 }
	 
	 @RequestMapping(value="/uptJob")
	 public String upJobs1(EmpJobs  job,  HttpServletRequest req){	
		 EmpJobs j = ebiz.findJobByID(job.getJobid());
		// j.setDepID(depID);
		 j.setJobdesc(job.getJobdesc());
		 j.setJobname(job.getJobname());
		 j.setJobsal(job.getJobsal());
		 j.setThrsal(job.getThrsal());
		 j.setJxsal(job.getJxsal());
		 
		 req.setAttribute("msg", ebiz.updtJobs(j) );
		  
		 return listJobs(  req,null,j.getDepID());
	 }
	 
	 
	 @RequestMapping("/delJb")
	 public String deletejobs(int  jobid,  HttpServletRequest req){
		 EmpJobs j = ebiz.findJobByID(jobid);
		 req.setAttribute("msg",  ebiz.deleteJobs(jobid));
		 return listJobs(req,null,j.getDepID());
	 }
	

	 @RequestMapping("/addFj")
	 public String addAttachment(Empfiles  atta,int dpid, MultipartFile actPic1, HttpServletRequest req){
		 
		 //文件名称 
		 Emps emp = this.ebiz.findEmpByID(atta.getEid());
		 
		 atta.setFjname(atta.getFjname()+actPic1.getOriginalFilename().substring(actPic1.getOriginalFilename().lastIndexOf(".")));
		 atta.setFjuploaddate(new Date());
		 File f =  new File("E:/oss附件/",emp.getEname());
		 if(!f.exists()){
			 f.mkdir();
		 }
		 try {
			 actPic1.transferTo(new File(f,emp.getEname()+"_"+atta.getFjname()));
			 req.setAttribute("msg",  ebiz.addEmpfiles(atta));
		} catch (Exception e) {
			 req.setAttribute("msg",  "添加失败");
			e.printStackTrace();
		
		}
	
		 return "toBUEmp.do?eid="+emp.getEid()+"&dpid="+dpid;
	 }
	 
	 
	 @RequestMapping(value="/valFjname",produces="text/html;charset=UTF-8")
     @ResponseBody
	 public String  valFjname(int  eid,String fn){
		 List list = ebiz.listEmpfilesByEmp(eid, fn+"%");
		 if(list==null || list.size()>0){
			 return "err";
		 } 
		 return "ok";
	 }
	 
	 @RequestMapping(value="/delAtta",produces="text/html;charset=UTF-8")
     @ResponseBody
	 public String  delAttachment(int  fjid){
		 Empfiles f = ebiz.findEmpfilesByID(fjid);
		 Emps e = ebiz.findEmpByID(f.getEid());
		 if( "删除成功".equals( ebiz.deleteEmpfiles(fjid))){
			 
			 File froot =   new File(new File("E:/oss附件/",e.getEname()),e.getEname()+"_"+f.getFjname());
			 froot.delete();
			 
			 return "ok";
		 } 
		 return "err";
	 }
	 
	 //////////////////////////////////////////企业qq管理
	 @RequestMapping("/lsEqq")
	 public String listOssqq(HttpServletRequest req,Page<Ossqq> page,Integer depID){
		 
		 if(page==null){
			 page = new Page<Ossqq>();
		 }
		 
		 //加载数据
		page.setResults( ebiz.listPageOssqqs(page));
		 
	    req.setAttribute("page", page);
			
		 return "/oa/listEqq.jsp";
	 }
	 
	 
	 ///
	 @RequestMapping("/addEqq")
	 public String addEmpQQ(Ossqq  eqq,  HttpServletRequest req){
		 
		 //谁录入谁就是所有人
		 Emps emp =(Emps) req.getSession().getAttribute("lgnUsr");
		 eqq.setEid(emp.getEid());
		 
		 req.setAttribute("msg",  ebiz.addOssqq(eqq) );
		 return listOssqq(req,null,null);
	 }
	 
	 @RequestMapping("/deleQQ")
	 public String deleteOssqq(int  eqid,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.deleteOssqq(eqid));
		 return listOssqq(req,null,null);
	 }
	
	 //updEqq.do
	 @RequestMapping(value="/toUpdtEqq")
	 public String oneOssqq(int  qqeid,  HttpServletRequest req){	
		 Ossqq j = ebiz.findOssqqByID(qqeid);
		 if(j.getEid()!=null)
			   j.setOwner(ebiz.findEmpByID(j.getEid()));
		 if(j.getT_e_eid()!=null)
			   j.setUseEmp(ebiz.findEmpByID(j.getT_e_eid()));
         j.setQqelastupp(new Date());
		 req.setAttribute("eqq", j );
		 
		 //检查application中部门信息
		 if(req.getServletContext().getAttribute("dpts")==null){
			 req.getServletContext().setAttribute("dpts",ebiz.listDepts());
		 }
		 
		 //一个部门的所有员工
		 if(j.getUseEmp()!=null &&j.getUseEmp().getEjob()!=null){
			 req.setAttribute("dptEmps", ebiz.listDptEmps(j.getUseEmp().getEjob().getDepID()) ); 
		 }else{
			 req.setAttribute("dptEmps", ebiz.listDptEmps(1)); //默认部门
		 }
		
		 
		 return "/oa/upEqq.jsp";
	 }
	 
	   //更换企业qq使用人
	 @RequestMapping(value="/chgEqqUsr",produces="text/html;charset=UTF-8")
     @ResponseBody
	 public String  changeEqqUser(int  qqeid,int eid){
		return ebiz.changeEqqUser(qqeid, eid);
	 }
	 
	 
	 @RequestMapping(value="/uptEqq")
	 public String updateEqq(Ossqq  eqq,  HttpServletRequest req){	
 
		 Ossqq tmp =  ebiz.findOssqqByID(eqq.getQqeid());
		// tmp.setLastfp(new Date());  //更新的时间戳
		 tmp.setQqesex(eqq.getQqesex());
		 tmp.setQqenote(eqq.getQqenote());
		 tmp.setQqepwd(eqq.getQqepwd());
		 tmp.setQqeuse(eqq.getQqeuse());
		 
		 req.setAttribute("msg", ebiz.updtOssqq(tmp) );
		  
		 return listOssqq(  req,null,null);
	 }
	 

	   //更换企业qq使用人
	 @RequestMapping(value="/valEqq",produces="text/html;charset=UTF-8")
     @ResponseBody
	 public String  validateEqq(String  qqename){
		 if(ebiz.findOssqqByName(qqename)==null){
			 return  "ok";
		 }
		 return  "err";
	 }
	 
	 @RequestMapping(value="/oneEqq")
	 public String    showOneOssqq(int  qqeid,  HttpServletRequest req){	
		 Ossqq j = ebiz.findOssqqByID(qqeid);
		 
		 if(j.getEid()!=null)
		   j.setOwner(ebiz.findEmpByID(j.getEid()));
		 if(j.getT_e_eid()!=null)
		   j.setUseEmp(ebiz.findEmpByID(j.getT_e_eid()));

		 req.setAttribute("eqq", j );
 
		 return "/oa/showEqq.jsp";
	 }
	 
	 
	 //////////工资管理
	 @RequestMapping("/lsSal")
	 public String listSalary(HttpServletRequest req,Page<Salary> page){
		 
		 if(page==null){
			 page = new Page<Salary>();
		 }
		 
		 //自己
		 Emps emp =(Emps) req.getSession().getAttribute("lgnUsr");
		// System.out.println("DepID="+emp.getEjob().getDepID());
			
		 page.setResults( ebiz.listPageSalaries(page,  emp.getEjob().getDepID()));
		 req.setAttribute("page", page);
		 
		 //部门的所有员工
		 req.setAttribute("empsFrDept", ebiz.listDptEmps(emp.getEjob().getDepID()));
		 
		 //本月+往后推2个月
		 Calendar cal = Calendar.getInstance();
		 cal.set(Calendar.DAY_OF_MONTH, 1);
		 String[] mthds = new  String[3];
		 mthds[0]= DbCommonMethod.isoFormatMth.format(cal.getTime());
		 cal.add(Calendar.MONTH, -1);
		 mthds[1]= DbCommonMethod.isoFormatMth.format(cal.getTime());
		 cal.add(Calendar.MONTH, -1);
		 mthds[2]= DbCommonMethod.isoFormatMth.format(cal.getTime());
		 req.setAttribute("mthds", mthds);
		 
		 return "/oa/listSalary.jsp";
	 }
	 
	 @RequestMapping("/addSal")
	 public String addSalary(Salary  sal,String mthd,  HttpServletRequest req){
		 
		 //谁录入谁就是所有人
		 Emps emp =(Emps) req.getSession().getAttribute("lgnUsr");
		 sal.setT_e_eid(emp.getEmpdid()); //做工资的人
		 sal.setSalstate(0);    //新录入待审批是0 ，已审批是1，已发是2
		 try {
			sal.setSalmth(DbCommonMethod.isoFormatMth.parse(mthd));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 req.setAttribute("msg",  ebiz.addSalary(sal));
		 return listSalary(req,null);
	 }
	 
	 
	 @RequestMapping(value="/oneSal")
	 public String    showOneSalary(int  salid,  HttpServletRequest req){	
		 req.setAttribute("sal", ebiz.findSalaryByID(salid) );
		 return "/oa/shSalary.jsp";
	 }
	 
	 @RequestMapping("/delSal")
	 public String deleteSalary(int  sid,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.deleteSalary(sid));
		 return listSalary(req,null);
	 }
	 
	 @RequestMapping(value="/toUpdtSal")
	 public String oneSalary(int  sid,  HttpServletRequest req){	
		 req.setAttribute("sal", ebiz.findSalaryByID(sid) );
		 return "/oa/updtSalary.jsp";
	 }
	 
	 @RequestMapping(value="/uptSal")
	 public String updateSalary(Salary  salForm,  HttpServletRequest req){	
 
		 Salary tmp =  ebiz.findSalaryByID(salForm.getSalid());
		// tmp.setLastfp(new Date());  //更新的时间戳
		 tmp.setAddsal(salForm.getAddsal());
		 tmp.setBasicsalary(salForm.getBasicsalary());
		 tmp.setMeritsal(salForm.getMeritsal());
		 tmp.setAddmeritsal(salForm.getAddmeritsal());
		 tmp.setIsbuysb(salForm.getIsbuysb());
		 tmp.setSaldesc(salForm.getSaldesc());
	 
		 req.setAttribute("msg", ebiz.updtSalary(tmp) );
		  
		 return listSalary(req,null);
	 }
	 
	 
	 
	 
}
