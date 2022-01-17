package com.huauauaa.springboot;

import java.util.List;

import com.huauauaa.springboot.entity.User;
import com.huauauaa.springboot.mapper.UserMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired

	private UserMapper userMapper;

	@Test
	public void testSelect() {
		List<User> userList = userMapper.selectList(null);
		userList.forEach(System.out::println);
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
