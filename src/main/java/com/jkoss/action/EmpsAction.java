package com.jkoss.action;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.tool.Page;

 
@Controller
@RequestMapping("/emp")
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
		   
		   System.out.println(u.getDetail().getEaddress());
		   if(u!=null){
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
	
	 ////////////////员工
	 @RequestMapping("/lsEmp")
	 public String listEmps(HttpServletRequest req,Page<Emps> page,Integer depID){
		 
		 if(page==null){
			 page = new Page<Emps>();
		 }
		 
		 //检查application中部门信息
		 if(req.getServletContext().getAttribute("dpts")==null){
			 req.getServletContext().setAttribute("dpts",ebiz.listDepts());
		 }
		 
		if(depID==null){
			Emps emp =(Emps) req.getSession().getAttribute("lgnUsr");
			depID = emp.getEjob().getDepID();
		}
		
		page.getParams().put("empdid", depID);
		
		page.setResults(ebiz.listPageEmps(page));
		 
	    req.setAttribute("page", page);
			
		 return "/oa/listEmps.jsp";
	 }
	 
	 
	 
	 
	 
	 
}
