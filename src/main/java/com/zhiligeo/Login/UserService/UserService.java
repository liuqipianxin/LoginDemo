package com.zhiligeo.Login.UserService;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.inject.Inject;
import com.zhiligeo.Login.dao.UserMapper;
import com.zhiligeo.Login.domain.User;
import com.zhiligeo.Login.util.SqlSessionHelper;

@Service
public class UserService {
	@Inject
	private UserMapper userMapper;

	public boolean verifyUser(User user) {
	    SqlSession sqlSession = SqlSessionHelper.getSessionFactory().openSession();
		 userMapper = sqlSession.getMapper(UserMapper.class);
		List<User> users = userMapper.findByNameAndPassword(user);
		if (users.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

}