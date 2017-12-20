package com.zhiligeo.Login.test;

import java.util.List;


import org.apache.ibatis.session.SqlSession;


import com.zhiligeo.Login.dao.UserMapper;
import com.zhiligeo.Login.domain.User;
import com.zhiligeo.Login.util.SqlSessionHelper;

//数据库功能的测试
public class MybatisTests {

	public static void main(String[] args) {
//		SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<User> users = userMapper.findByNameAndPassword(new User("laoliu", "123456"));
//	    if (users.isEmpty()) {
//	    	System.out.print("没查询到");
//		} else {
//			System.out.print("已查询到");
//		}

}
}