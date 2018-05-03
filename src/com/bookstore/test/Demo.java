package com.bookstore.test;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.junit.Test;


import com.bookstore.entity.Book;
import com.bookstore.entity.Order_items;
import com.bookstore.entity.User;


public class Demo {
	//hibernate配置测试
	@Test
	public void fun(){
		//加载配置文件
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		org.hibernate.Session session=sessionFactory.openSession();
		Transaction ts=session.beginTransaction();
		//卖家
		User u1=new User();
		u1.setUsername("qwerasd");
		u1.setPassword("qwer");
		//书籍
		Book b1=new Book();
		b1.setBook_name("活着");
		b1.setBook_author("余华");
		Book b2=new Book();
		b2.setBook_name("兄弟");
		b2.setBook_author("余华");
		Book b3=new Book();
		b3.setBook_name("第七天");
		b3.setBook_author("余华");
		//书籍加入卖家
		u1.getBooks().add(b1);//维护主键
		u1.getBooks().add(b2);
		u1.getBooks().add(b3);
		//买家
		User u2=new User();
		u2.setUsername("hy");
		u2.setPassword("1234");
		//订单
		Order_items o1=new Order_items();
		o1.setBook(b1);
		u2.getOrder_items().add(o1);//维护主键
		//订单
		Order_items o2=new Order_items();
		o2.setBook(b2);
		u2.getOrder_items().add(o2);
		
		//保存操作
		session.save(u1);
		session.save(u2);

		//提交事务
		ts.commit();
		//关闭资源
		session.close();
		sessionFactory.close();
	}
	
	
	
}
