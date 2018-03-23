package com.starry.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.starry.entity.Department;
@Repository("departmentDao")
public class IDepartmentImpl extends SqlSessionDaoSupport implements IDepartmentDao {

	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }

	public List<Department> getAll(int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return getSqlSession().selectList("getcla");
	}

	public int DeleteById(String id) {
		int result = this.getSqlSession().delete("delById", id);
		return result;
	}

	public List<Department> findName(String info,int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getByName", info);
	}
	
	public List<Department> findId(String info,int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getById", info);
	}
	
	public void updateDepart(Department department) {
		this.getSqlSession().update("updateById",department );
		
	}
	
	public List<Department> getAll() {
		// TODO Auto-generated method stub
		 return getSqlSession().selectList("getcla");
	}
	
	public List<Department> findId(String info) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("getById", info);
	}

}
