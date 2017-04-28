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
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.sys.Sysright;
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
			   for (Sysright rt : u.getRights()) {
				 System.out.println("   "+rt.getRtname());
			   }
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
	
}
