package com.dj.billingapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.dj.billingapp.BillingAppApplication;
import com.dj.billingapp.config.ApplicationTestConfig;

@SpringBootTest(classes = BillingAppApplication.class)
@ExtendWith(SpringExtension.class)
class BillingAppServiceApplicationTests extends ApplicationTestConfig {

	@Test
	void contextLoads() {
	}

}
