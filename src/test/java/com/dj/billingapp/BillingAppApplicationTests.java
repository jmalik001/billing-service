package com.dj.billingapp;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.dj.billingapp.controller.UserController;

@SpringBootTest(classes = BillingAppApplication.class)
@ActiveProfiles("test")
@DisplayName("Check property or Object initialization")
class BillingAppApplicationTests {

	@Value("${datasource.url}")
	private String dbUrl;
	@Autowired
	private UserController userController;
	
	@Test
	@DisplayName("When spring context loads")
	void contextLoads() {
		assertThat(userController).isNotNull();
	}
	@Test
	@DisplayName("When property got injected")
	void testShouldPropertyInjectedCorrectly() {		
		assertThat(dbUrl).isEqualTo("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
	}
}
