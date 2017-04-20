package com.jkoss.biz;

import java.util.List;

import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.Emps;

public interface IEmpsBiz {

	  Emps login(Emps e);
	
	  List<Department> listAllDepts();
	  
}
