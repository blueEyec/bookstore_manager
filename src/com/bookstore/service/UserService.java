
package com.bookstore.service;

import com.bookstore.entity.User;

import java.util.List;

public interface UserService {
	/*
	 * 注册
	 */
	public void register(User user);
	
	
	/*
	 * 判断是否存在用户
	 */
	
	public boolean isUserExist(String username);
	
	/*
	 * 登陆
	 */
	public User login(String username,String password,int permission);
	/*
	 * 通过id查找用户
	 */
	public User findUserById(int id);
	/*
	 * 加分操作
	 */
	public void addIntegral(int id,int integral );
	/*
	 * 扣分操作
	 */
	public void delIntegral(int id ,int integral);
	/*
	 * 更新用户信息
	 */
	public void update(User user);
}