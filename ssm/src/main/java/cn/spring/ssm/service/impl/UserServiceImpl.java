package cn.spring.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.spring.ssm.dao.UserDao;
import cn.spring.ssm.entity.User;
import cn.spring.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}

}
