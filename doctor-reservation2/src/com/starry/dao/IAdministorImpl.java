package com.starry.dao;


import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.starry.entity.Administor;
import com.starry.entity.Count;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.Feedback;
import com.starry.entity.New;
import com.starry.entity.OrderInfo;

@Repository("administorDao")
public class IAdministorImpl extends SqlSessionDaoSupport implements IAdministorDao {
	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
	public boolean login(Administor administor) {
		System.out.println("impl");
		List<Administor> list = this.getSqlSession().selectList("adlogin", administor);
		System.out.println("impl"+list);
		if(!list.isEmpty())
			return true;
		return false;
	}
	public int addDepart(Department department) {
		System.out.println("department"+department);
		return this.getSqlSession().insert("adDepart",department);
	}
	public int addDoctor(Doctor doctor) {
		return this.getSqlSession().insert("adDoctor",doctor);
	}
	public void updatePwd(Administor administor) {
		this.getSqlSession().update("updatePwd", administor);
		
	}
	public List<OrderInfo> getAll(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getOrder");
	}
	public List<Count> getCount(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getCount");
	}
	public List<Feedback> getFeedBack(int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getFeedBack");
	}
	public int addNew(New news) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("addNew", news);
	}
	public List<New> getAllNew(int pageNum,int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("selectNew");
	}
}
