package com.starry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.starry.dao.IUserDao;
import com.starry.entity.Administor;
import com.starry.entity.Feedback;
import com.starry.entity.Order;
import com.starry.entity.OrderInfo;
import com.starry.entity.User;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	 private IUserDao userDao;
	 
	public IUserDao getUserDao() {
		return userDao;
	}
	 @Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl"+userDao.selectAll());
		return userDao.selectAll();
	}
	
	public int deleteById(int id) {
		int result = userDao.deleteById(id);
		return result;
	}
	
	public int register(User user) {
		int result = userDao.register(user);
	//	System.out.println("RegisterServiceImpl"+result);
		return result;
	}
	
	public List<User> checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		User user=  new User();
		user.setUname(name);
		user.setPwd(pwd);
		List<User> result = userDao.userLogin(user);
		return result;
	}
	
	public int insertOrder(Order order) {
		return userDao.insertOrder(order);
	}
	
	public List<OrderInfo> getOrderById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getOrderById(id);
	}
	
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
	
	public int insertFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return userDao.insertFeedback(feedback);
	}
	
	public int deleteOrderById(Integer  oNumber) {
		// TODO Auto-generated method stub
		return userDao.deleteOrderById(oNumber);
	}

}
