package com.jkoss.tool;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

 
public  class OSSConstants {

	public static  String EMPIMGSPATH;
	
	static{
		 Properties props = new Properties();
		 try {
			props.load(OSSConstants.class.getClassLoader().getResourceAsStream("db.properties"));
			EMPIMGSPATH  =props.getProperty("EMPIMGSPATH");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
