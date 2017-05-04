package com.jkoss.action;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.tool.Page;

@Controller
@RequestMapping("/emp")
public class OASendMailAction implements Serializable{

	@Autowired
	JavaMailSender mailSender;
	@Autowired
	private VelocityEngine ve;
	
	@Autowired
    private IEmpsBiz  ebiz;
	
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
       req.setAttribute("jobs", ebiz.findJobsByDid(depID));
	
		return "/oa/listEmps.jsp";
	 }
	 
	
	@RequestMapping("/addEmp")
	public String addNewEmp(Emps emp,HttpServletRequest req){
		
		emp.setHireDate(new Date());
		emp.setPwdword("oss"+new Random().nextInt(1000));
		String msg = ebiz.addEmp(emp);
        if("添加成功".equals(msg)){
        	msg = sendRzMail(emp, msg);
         }
		req.setAttribute("msg", msg);
       
		return listEmps(  req,null, ebiz.findJobByID(emp.getJobid()).getDepID());
	}

 
	@RequestMapping(value="/sendRzMail",produces="text/html;charset=UTF-8")
    @ResponseBody
	public String sendRzMail(int eid){
		Emps emp = ebiz.findEmpByID(eid);
		return sendRzMail(emp,emp.getEname()); 
	}
	

	
	 @RequestMapping("/delEmp")
	 public String deletejobs(int  eid,int  dpid,  HttpServletRequest req){
		 req.setAttribute("msg",  ebiz.deleteEmps(eid));
		 return listEmps(req,null,dpid);
	 }
	
	 @RequestMapping(value="/oneEmps")
	 public String oneJobs(int  eid,  HttpServletRequest req){	
		 Emps j = ebiz.findEmpByID(eid);
		 req.setAttribute("emp", j );
		 return "/oa/shEmp.jsp";
	 }
	
	 @RequestMapping(value="/toBUEmp")
	 public String oneEmp(int  eid,int  dpid,   HttpServletRequest req){	 
		 Emps e = ebiz.findEmpByID(eid);
		 req.setAttribute("emp", e );
		 
		 req.setAttribute("jobs",  ebiz.findJobsByDid(dpid));
	 
		 return "/oa/edtEmp.jsp";
	 }
	 
	 @RequestMapping(value="/upEmp")
	 public String updEmp(Emps  e,   HttpServletRequest req){	 
		 Emps etmp = ebiz.findEmpByID(e.getEid());
		 etmp.setEphone(e.getEphone());
		 etmp.setLgnName(e.getLgnName());
		 etmp.setJobid(e.getJobid());
		 //etmp.setHireDate(e.getHireDate());
		 etmp.setQqe(e.getQqe());
		
		 req.setAttribute("msg",  ebiz.updtEmp(etmp));
	 
		 return listEmps(req,null,ebiz.findJobByID(e.getJobid()).getDepID());
	 }
	 
	 
		private String sendRzMail(Emps emp, String msg) {
			MimeMessage message = mailSender.createMimeMessage();

			// 交给代理助手类 //true:支持多媒体 编码
			try {
				MimeMessageHelper helper = new MimeMessageHelper(message, true, "GBK");
				helper.setFrom("rick9k@sohu.com");
				helper.setTo(emp.getLgnName());
				helper.setCc("952063095@qq.com");
				helper.setSubject("靖凯开源软件大家庭热烈欢迎您的加入");
				
				//封装数据
				Map<String,Object>  data = new HashMap();
				data.put("emp", emp);
				
				//合并数据到模板-------->
				helper.setText(VelocityEngineUtils.mergeTemplateIntoString(ve, "mails/mail.vm","GBK", data),true);
				
				mailSender.send(message);
				msg+=",入职邮件发送成功！";
				System.out.println(msg);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return msg;
		}
	 
	 
	 
	 
	 
	 
	 
	 
}
