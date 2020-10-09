package com.jilin.zhangym.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.jilin.zhangym.bo.User;

@Mapper
public interface UserMapper {
	
	@Select("Select * from user")
	public List<User> selectAll();
	
	@Select("Select * from user where user_id=#{user_id}")
	public User selectByPrimaryKey(User user);
	
	@Select("update user set user_name=#{user_name} ")
	public Integer updateByPrimaryKeySelective(User user);
	
}