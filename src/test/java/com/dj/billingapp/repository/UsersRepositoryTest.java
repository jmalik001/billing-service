package com.dj.billingapp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;

import com.dj.billingapp.entity.User;

@DataJpaTest
@ActiveProfiles("test")
@DisplayName("Check user interaction to DB")
class UsersRepositoryTest {
	
	@Autowired
	UsersRepository usersRepo;
	
	@BeforeEach
	void setup() {
		usersRepo.save(new User("Juser","admin","Jagababdhu Malik", "IN", 1212121221L, true));
	}
	
	@AfterEach
	void deleteRecordInserted() {
		usersRepo.deleteAll();
	}
	
	@DisplayName("When user save to DB")
	@Test
	void testFetchAllUsers() {

		
		List<User> users =  (ArrayList<User>) usersRepo.findAll();
		System.out.println(users.get(0).toString());
		assertThat(users.size()).isEqualTo(1);
	}

	@DisplayName("When fetch user , it should get all the fields")
	@Test
	void testIfItFetchAllThePropertiesOfUsers() {
		String expected = "[User [userName=Juser, password=admin, fullName=Jagababdhu Malik, countryCode=IN, phone=1212121221, isEnabled=true]]";
		List<User> users =  (ArrayList<User>) usersRepo.findAll();
		assertThat(users.toString()).hasToString(expected);
	}
	
	
}
