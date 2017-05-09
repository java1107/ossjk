package com.jkoss.biz.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jkoss.biz.IEmpsBiz;
import com.jkoss.dao.oa.EmpfilesMapper;
import com.jkoss.dao.oa.OssqqMapper;
import com.jkoss.pojo.oa.Department;
import com.jkoss.pojo.oa.EmpJobs;
import com.jkoss.pojo.oa.EmpJobsExample;
import com.jkoss.pojo.oa.Empfiles;
import com.jkoss.pojo.oa.EmpfilesExample;
import com.jkoss.pojo.oa.Emps;
import com.jkoss.pojo.oa.Ossqq;
import com.jkoss.tool.Page;

@Component
public class EmpsBiz implements IEmpsBiz {

	@Autowired
	private com.jkoss.dao.oa.EmpsMapper edao; 
	@Autowired
	private com.jkoss.dao.oa.DepartmentMapper ddao; 
	@Autowired
	private com.jkoss.dao.oa.EmpJobsMapper jbdao; 
	@Autowired
	private  EmpfilesMapper   efdao;
	@Autowired
	private OssqqMapper      eqqDao;
	
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
		EmpJobsExample ejb=null;
		if(did>0){
			ejb = 	new EmpJobsExample();
			ejb.createCriteria().andDepIDEqualTo(did);
		}
		return jbdao.selectByExample(ejb);
	}

	@Override
	@Transactional
	public String addJob(EmpJobs jb) {
		// TODO Auto-generated method stub
		return jbdao.insert(jb)>0?"添加成功":"添加失败";
	}
	
	@Override
	public EmpJobs findJobByID(int jbid) {
		// TODO Auto-generated method stub
		return jbdao.selectByPrimaryKey(jbid);
	}

	@Override
	@Transactional
	public String updtJobs(EmpJobs job) {
		// TODO Auto-generated method stub
		return jbdao.updateByPrimaryKey(job)>0?"更新成功":"更新失败";
	}

	@Override
	@Transactional
	public String deleteJobs(int jbid) {
		// TODO Auto-generated method stub
		return jbdao.deleteByPrimaryKey(jbid)>0?"删除成功":"删除失败";
	}

	 
	
	@Override
	@Transactional
	public String addEmp(Emps emp) {
		// TODO Auto-generated method stub
		return edao.insert(emp)>0?"添加成功":"添加失败";
	}

	@Override
	public Emps findEmpByID(int eid) {
		// TODO Auto-generated method stub
		return edao.selectByPrimaryKey(eid);
	}

	@Override
	public List<Emps> listPageEmps(Page<Emps> page) {
		// TODO Auto-generated method stub
		return edao.selectAtPage(page);
	}

	@Override
	@Transactional
	public String updtEmp(Emps emp) {
		// TODO Auto-generated method stub
		return edao.updateByPrimaryKey(emp)>0?"更新成功":"更新失败";
	}

	@Override
	@Transactional
	public String deleteEmps(int eid) {
		return edao.deleteByPrimaryKey(eid)>0?"删除成功":"删除失败";
	}
	
	@Override
	public List<Emps> listDptEmps(int did) {
		// TODO Auto-generated method stub
		return edao.selectEmpsByDpt(did);
	}

	@Override
	@Transactional
	public String addEmpfiles(Empfiles file) {
		// TODO Auto-generated method stub
		return efdao.insert(file)>0?"添加成功":"添加失败";
	}

	@Override
	public Empfiles findEmpfilesByID(int efid) {
		// TODO Auto-generated method stub
		return efdao.selectByPrimaryKey(efid);
	}

 
	
	@Override
	public List<Empfiles> listEmpfilesByEmp(int eid,String fn) {
		// TODO Auto-generated method stub
		EmpfilesExample e = new EmpfilesExample();
		
		if(fn!=null){
			e.createCriteria().andT_e_eidEqualTo(eid).andFjnameLike(fn);
		}else{
			e.createCriteria().andT_e_eidEqualTo(eid);
		}
		return efdao.selectByExample(e);
	}

	@Override
	@Transactional
	public String deleteEmpfiles(int fjid) {
		// TODO Auto-generated method stub
		return efdao.deleteByPrimaryKey(fjid)>0?"删除成功":"删除失败";
	}

//////////////////////// 企业qq管理
	@Override
	public List<Ossqq> listPageOssqqs(Page<Ossqq> page) {
		// TODO Auto-generated method stub
		List<Ossqq> datas =  eqqDao.selectAtPage(page);
		if(datas!=null){
			for (Ossqq ossqq : datas) {
				ossqq.setOwner(findEmpByID(ossqq.getEid()));
				ossqq.setUseEmp(findEmpByID(ossqq.getT_e_eid()));
			}
		}
		return datas;
	}

	@Override
	@Transactional
	public String addOssqq(Ossqq jb) {
		// TODO Auto-generated method stub
		return eqqDao.insert(jb)>0?"添加成功":"添加失败";
	}

	@Override
	public Ossqq findOssqqByID(int qqeid) {
		// TODO Auto-generated method stub
		return eqqDao.selectByPrimaryKey(qqeid);
	}

	@Override
	@Transactional
	public String deleteOssqq(int qqeid) {
		// TODO Auto-generated method stub
		return eqqDao.deleteByPrimaryKey(qqeid)>0?"删除成功":"删除失败";
	}

	@Override
	@Transactional
	public String updtOssqq(Ossqq eqq) {
		// TODO Auto-generated method stub
		return eqqDao.updateByPrimaryKey(eqq)>0?"更新成功":"更新失败";
	}



////////////////////////企业qq管理 end
 
	
	
	
	
	
}
