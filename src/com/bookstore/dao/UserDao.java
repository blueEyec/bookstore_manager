
package com.bookstore.dao;

import com.bookstore.entity.User;
import java.util.List;

public interface UserDao {
	/*
	 * 用户登陆
	 */
	public List<User> login(String username,String password,int permission);
	/*
	 * 判断用户是否存在
	 */
	public boolean isUserExist(String username);
	/*
	 * 添加用户
	 */
	public  void save(User user); 
	/*
	 * 通过id查找用户
	 */
	public List<User> findUserById(int id);
	/*
	 * 更新数据
	 */
	public void updateUser(User user);
	

	
	
	
}