package com.jkoss.biz.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jkoss.biz.IEmpsBiz;
import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.EmpJobsExample;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.tool.Page;

@Component
public class EmpsBiz implements IEmpsBiz {

	@Autowired
	private com.jkoss.dao.oa.EmpsMapper edao; 
	@Autowired
	private com.jkoss.dao.oa.DepartmentMapper ddao; 
	@Autowired
	private com.jkoss.dao.oa.EmpJobsMapper jbdao; 
	
	//登录
	public Emps login(Emps e){
		Emps tmp = edao.selectByLgnName(e.getLgnName());
		if(tmp!=null&&tmp.getPwdword().equals(e.getPwdword())){
			return tmp;
		}
		return null;
	}
	
	public List<Department> listPageDepts(Page<Department> page){
		return ddao.selectAtPage(page);
	}

	@Override
    @Transactional
	public String addDept(Department dept) {
		// TODO Auto-generated method stub
		return ddao.insert(dept)>0?"添加成功":"添加失败";
	}

	@Override
	public Department findDeptByID(int did) {
		// TODO Auto-generated method stub
		return ddao.selectByPrimaryKey(did);
	}

	@Override
    @Transactional
	public String updtDept(Department dept) {
		return ddao.updateByPrimaryKey(dept)>0?"更新成功":"更新失败";
	}
	
	@Override
    @Transactional
	public String deleteDept(int depID) {
		return ddao.deleteByPrimaryKey(depID)>0?"删除成功":"删除失败";
	}

	@Override
	public List<Department> listDepts() {
		// TODO Auto-generated method stub
		return ddao.selectByExample(null);
	}

	@Override
	public List<EmpJobs> findJobsByDid(int did) {
		// TODO Auto-generated method stub
		EmpJobsExample ejb = 	new EmpJobsExample();
		ejb.createCriteria().andDepIDEqualTo(did);
		return jbdao.selectByExample(ejb);
	}

	@Override
	public String addJob(EmpJobs jb) {
		// TODO Auto-generated method stub
		return jbdao.insert(jb)>0?"添加成功":"添加失败";
	}
	
	
	
	
	
	
	
}
