
package com.bookstore.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bookstore.service.OrderService;
import com.bookstore.service.UserService;
import com.bookstore.entity.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestDemo {
	@Autowired
	private UserService userService;
	private OrderService orderService;
	HibernateTemplate hibernateTemplate;
	@Test
	public void fun(){
		User user=new User();
		user.setUsername("kk");
		user.setPassword("1234");
		user.setGender(1);
		userService.register(user);
		
	}
	
//	@Test
//	public void fun1(){
//		Book book=new Book();
//		BookService bookService=new BookServiceImpl();
//		List<Book> books=bookService.findBookByCategory("文学");
//		System.out.println(book.getCategory());
//		for(Book attr:books){
//			System.out.println(attr);
//		}
//	}
	@Test
	public void fun1(){
		
	}
}