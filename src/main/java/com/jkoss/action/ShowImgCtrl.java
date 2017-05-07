package com.jkoss.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Empfiles;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.tool.OSSConstants;

@Controller
public class ShowImgCtrl {
	
	 @Autowired
     private IEmpsBiz  ebiz;
	 
	 @RequestMapping(value="/oa/shEmpimgs",produces="image/jpeg;charset=UTF-8")
     @ResponseBody
	 public String empsAttasImgsShow(int fjid,HttpServletRequest request,HttpServletResponse response){
		 try
	        {
	            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
	            
	            Empfiles f =   ebiz.findEmpfilesByID(fjid);
	            Emps owner =   ebiz.findEmpByID(f.getEid());
	            
	            File file = new File(OSSConstants.EMPIMGSPATH+owner.getEname()+"/"+owner.getEname()+"_"+f.getFjname());
	            BufferedImage imge = ImageIO.read(file);
	            ImageIO.write(imge, "JPEG", response.getOutputStream());
	        }
	        catch (IOException e)
	        {
	           e.printStackTrace();
	        }
		 return "";
	 }
	 
	
	
}
