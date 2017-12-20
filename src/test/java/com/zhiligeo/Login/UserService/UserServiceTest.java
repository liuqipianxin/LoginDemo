package com.zhiligeo.Login.UserService;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mysql.cj.api.Session;
import com.zhiligeo.Login.dao.UserMapper;
import com.zhiligeo.Login.domain.User;
import com.zhiligeo.Login.util.SqlSessionHelper;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {
	
	SqlSession session =SqlSessionHelper.getSessionFactory().openSession();
	UserMapper mapper=session.getMapper(UserMapper.class);

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testUserService() {
//		User user=new User("laoliu", "123456");
//		SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();
//		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//		List<User> users = userMapper.findByNameAndPassword(user);
//	    if (users.isEmpty()) {
//	    	System.out.print("没查询到");
//		} else {
//			System.out.print("已查询到");
//		}
//		System.err.println(UserService.verifyUser(user));
	}
}
