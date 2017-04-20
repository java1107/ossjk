package com.jkoss.action;

import java.io.Serializable;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.sys.Sysright;

 
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
	 public String listDept(HttpServletRequest req){
	      
		 req.setAttribute("allDepts", ebiz.listAllDepts());
		 
		 return "/oa/listdept.jsp";
	 }
	 
	 
	 
	
}
