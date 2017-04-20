package com.jkoss.biz.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.Emps;

@Component
public class EmpsBiz implements IEmpsBiz {

	@Autowired
	private com.jkoss.dao.oa.EmpsMapper edao; 
	@Autowired
	private com.jkoss.dao.oa.DepartmentMapper ddao; 
	//登录
	public Emps login(Emps e){
		Emps tmp = edao.selectByLgnName(e.getLgnName());
		if(tmp!=null&&tmp.getPwdword().equals(e.getPwdword())){
			return tmp;
		}
		return null;
	}
	
	public List<Department> listAllDepts(){
		return ddao.selectByExample(null);
	}
	
}
