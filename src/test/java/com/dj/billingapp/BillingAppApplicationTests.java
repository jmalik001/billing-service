package com.dj.billingapp;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = BillingAppApplication.class)
@ActiveProfiles("test")
class BillingAppApplicationTests {

	@Value("${datasource.url}")
	private String dbUrl;
	
	@Test
	void contextLoads() {
		assertEquals( "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", dbUrl);
	}

}
