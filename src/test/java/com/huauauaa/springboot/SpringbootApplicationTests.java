package com.huauauaa.springboot;

import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huauauaa.springboot.mapper.UserMapper;
import com.huauauaa.springboot.service.UserServiceImpl;
import com.huauauaa.springboot.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserServiceImpl userService;

	@Test
	public void testSelect() {
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
	}

	@Test
	public void testAddField() {
		Page<User> pageParam = new Page<>(1, 3);
		Page<User> result = userService.getMixedUsers(pageParam);
		result.getRecords().forEach(System.out::println);
	}

	@Test
	void testInsert() {
		User user = new User();
		user.setFirstName("John");
		user.setLastName("Doe");
		user.setAge(10);

		int result = userMapper.insert(user);

		System.out.println(result);
		System.out.println(user);
	}

}
