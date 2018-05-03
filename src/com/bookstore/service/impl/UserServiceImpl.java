
package com.bookstore.service.impl;

import com.bookstore.dao.UserDao;
import com.bookstore.entity.User;
import com.bookstore.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	//注册
	public void register(User user) {
		// TODO 自动生成的方法存根
		userDao.save(user);
	}
	//判断是否存在用户
	public boolean isUserExist(String username){
		if(userDao.isUserExist(username)){
			return true;
		}
		return false;
	}
	@Override
	public User login(String username, String password,int permission) {
		// TODO 自动生成的方法存根
		if(userDao.login(username, password,permission)==null){
			return null;
		}
		List<User> users= userDao.login(username, password,permission);
		User user=users.get(0);
		return user;
	}
	@Override
	public User findUserById(int id) {
		// TODO 自动生成的方法存根
		List<User> users=userDao.findUserById(id);
		User user=users.get(0);
		return user;
	}
	@Override
	public void addIntegral(int id,int integral) {
		// TODO 自动生成的方法存根
		User user=userDao.findUserById(id).get(0);
		user.setIntegral(integral+user.getIntegral());
		userDao.updateUser(user);
	}
	@Override
	public void delIntegral(int id, int integral) {
		// TODO 自动生成的方法存根
		User user=userDao.findUserById(id).get(0);
		user.setIntegral(user.getIntegral()-integral);
		userDao.updateUser(user);
		
	}
	@Override
	public void update(User user) {
		// TODO 自动生成的方法存根
		userDao.updateUser(user);
	}
	
}