package com.zhiligeo.Login.dao;

import java.util.List;

import com.zhiligeo.Login.domain.User;

public interface UserMapper  {
public List<User> findByNameAndPassword(User user);
}
