package cn.spring.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.spring.ssm.entity.User;

@Repository
public interface UserDao {
	/**
	 * 添加新用户
	 * 
	 * @param user
	 * @return
	 */
	public int insertUser(User user);
	
	/**
	 * 
	 *  Description:批量插入
	 *  @author shaox  DateTime 2014年11月19日 下午3:22:04
	 */
	public void batchInsertUser(List<User> ls);
	
	/**
	 * 
	 *  Description:所有user数
	 *  @author shaox  DateTime 2014年11月19日 上午10:56:54
	 *  @return
	 */
	public int countAll();
	
	/**
	 * 
	 *  Description:获取所有User列表
	 *  @author shaox  DateTime 2014年11月19日 上午11:15:05
	 *  @param offset
	 *  @param rows
	 */
	public List<User> getAllList(@Param("offset") long offset,@Param("rows") long rows); 

}
