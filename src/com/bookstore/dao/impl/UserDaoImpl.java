
package com.bookstore.dao.impl;

import java.util.List;

import javax.management.Query;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import com.bookstore.dao.UserDao;
import com.bookstore.entity.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	/*
	 * 登录操作
	 * @see com.bookstore.dao.UserDao#login(java.lang.String, java.lang.String)
	 */
	@Override
	public List<User> login(String username,String password,int permission) {
		String hql="from User AS user WHERE user.username=? AND user.password=? AND user.permission=?";
		List<User> users=(List<User>) this.getHibernateTemplate().find(hql,username,password,permission);
		if(users.size()==0){
			return null; 
		}
		return users;
	}
	@Override
	//判断用户是否存在
	public boolean isUserExist(String username) {
		// TODO 自动生成的方法存根
		boolean flag=false;
		String hql="from User AS user WHERE user.username=";
		List<User> userList=(List<User>) this.getHibernateTemplate().find(hql,username);
		if(userList.size()!=0){
			flag=true;
		}
		return flag;
	}
	//保存用户注册
	public void save(User user) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List<User> findUserById(int id ) {
		// TODO 自动生成的方法存根
		String hql="from User AS user WHERE user.id=?";
		List<User> users=(List<User>) this.getHibernateTemplate().find(hql,id);
		return users;
	}
	@Override
	public void updateUser(User user) {
		// TODO 自动生成的方法存根
		this.getHibernateTemplate().update(user);
	}

	
	
}