package com.starry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starry.dao.IDepartmentDao;
import com.starry.entity.Department;
@Service("departService")
public class IDepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentDao departmentDao;
	
	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public IDepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	
	public List<Department> getAll(int pageNum,int pageSize) {

		return departmentDao.getAll(pageNum,pageSize);
	}

	
	public int delById(String id) {
		return departmentDao.DeleteById(id);
	}

	
	public List<Department> findName(String info,int pageNum,int pageSiz) {
		return departmentDao.findName(info,pageNum,pageSiz);
	}

	
	public List<Department> findId(String info,int pageNum,int pageSize) {
		return departmentDao.findId(info,pageNum,pageSize);
	}

	
	public void update(Department department) {
		departmentDao.updateDepart(department);
		
	}

	
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		return departmentDao.getAll();
	}

	
	public List<Department> findId(String info) {
		// TODO Auto-generated method stub
		return departmentDao.findId(info);
	}

}
