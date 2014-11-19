package cn.spring.ssm.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.spring.ssm.dao.UserDao;
import cn.spring.ssm.entity.User;
import cn.spring.ssm.service.UserService;

public class UserTest {

	private UserService userService;
	private UserDao userDao;

	@Before
	public void before() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml",
						"classpath:conf/spring-mybatis.xml" });
		userService = (UserService) context.getBean("userServiceImpl");
		userDao = (UserDao) context.getBean("userDao");
	}

	@Test
	public void addUser() {
		User user = new User();
		user.setNickname("sb2");
		user.setState(0);
		System.out.println(userService.insertUser(user));
	}
	
	@Test
	public void batchInsertUser() {
		List<User> ls = new ArrayList<User>();
		for (int i = 0; i < 2; i++) {
			User user = new User();
			user.setState(i);
			user.setNickname("lvlvl"+i);
			ls.add(user);
		}
		userDao.batchInsertUser(ls);
	}
	
	@Test
	public void getAllList(){
		List<User> list = userDao.getAllList(1,10);
		int listsize = list.size();
		for (int i = 0; i < listsize; i++) {
			System.out.println("第"+(i+1)+"条记录： "+
						list.get(i).getState()+list.get(i).getNickname());
		}
	}
	
}
