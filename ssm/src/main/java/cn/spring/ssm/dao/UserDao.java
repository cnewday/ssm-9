package cn.spring.ssm.dao;

import cn.spring.ssm.entity.User;

public interface UserDao {
	/**
	 * 添加新用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

}
