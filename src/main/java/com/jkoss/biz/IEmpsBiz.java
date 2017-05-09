package com.jkoss.biz;

import java.util.List;

import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.Empfiles;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.tool.Page;

public interface IEmpsBiz {

	  //   部门
	  Emps login(Emps e);
	  List<Department> listPageDepts(Page<Department> page);
	  String addDept(Department dept);
	  Department findDeptByID(int did);
	  String updtDept(Department dept);
	  String deleteDept(int depID);
	  List<Department> listDepts();
	  
	  
	  ///	岗位 
	  List<EmpJobs> findJobsByDid(int did);
	  String addJob(EmpJobs jb);
	  EmpJobs findJobByID(int jbid);
	  String updtJobs(EmpJobs job);
	  String deleteJobs(int jbid);
	  
	  ///	员工 
	  String addEmp(Emps emp);
	  Emps findEmpByID(int eid);
	  List<Emps> listPageEmps(Page<Emps> page);
	  String updtEmp(Emps emp);
	  String deleteEmps(int eid);
	  List<Emps> listDptEmps(int did);
	  
	  //员工附件word、excel和图片
	  String addEmpfiles(Empfiles file);
	  Empfiles findEmpfilesByID(int efid);
	  List<Empfiles> listEmpfilesByEmp(int eid,String fn);
	  String deleteEmpfiles(int fjid);
	  
	  //企业QQ
	  List<Ossqq> listPageOssqqs(Page<Ossqq> page);
	  String addOssqq(Ossqq jb); 
	  Ossqq findOssqqByID(int qqeid);
	  Ossqq findOssqqByName(String qqname);
	  String deleteOssqq(int qqeid);
	  String updtOssqq(Ossqq eqq);
	  
	  
	  
	  
}
