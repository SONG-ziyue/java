package com.starry.dao;

import java.util.List;









import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.starry.entity.Administor;
import com.starry.entity.Feedback;
import com.starry.entity.Order;
import com.starry.entity.OrderInfo;
import com.starry.entity.User;

@Repository("userDao")
public class IUserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    @Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
    
    
    public List<User> selectAll() {
        // TODO Auto-generated method stub
    	System.out.println("IUserDaoImpl");
        List<User> users = this.getSqlSession().selectList("getUser");
        System.out.println("IUserDaoImpl"+users);
        return users;
    }


	
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		int result = this.getSqlSession().delete("deleteById", id);
		return result;
	}


	
	public int register(User users) {
		// TODO Auto-generated method stub
		   int result =this.getSqlSession().insert("register",users);
			return result;
	}


	
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}



	public List<User> userLogin(User user) {
		List<User> list = this.getSqlSession().selectList("getUser", user);
		System.out.println("impl"+list);
		return list;
	}



	public int insertOrder(Order order) {
		  int result =this.getSqlSession().insert("insertOrder",order);
			return result;
	}



	public List<OrderInfo> getOrderById(Integer id) {
		return this.getSqlSession().selectList("getOrderByUserId",id);
	}



	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("updateUser", user);
	}



	public int insertFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("insertfeedback", feedback);
	}


	
	public int deleteOrderById(Integer  oNumber) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete("deleteOrderByid", oNumber);
	}


}
