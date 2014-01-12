package cn.ssm.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.sample.dao.UserMapper;
import cn.ssm.sample.dto.User;

@Service
public class IndexSvr {
	
	@Autowired
	UserMapper userMapper;
	
	public User getUser(int id) {
		return userMapper.getUser(id);
	}
}
