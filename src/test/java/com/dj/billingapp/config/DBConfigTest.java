package com.dj.billingapp.config;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.zaxxer.hikari.HikariDataSource;


@SpringBootTest(classes = DBConfiguration.class)
@ActiveProfiles("test")
@DisplayName("Check Datasource configuration is appropreate to profile")
class DBConfigTest   {
	
	@Autowired
	private HikariDataSource testDataSourceConfig;
	
	@DisplayName("when Data source created")
	@Test
	void testDataSourceCreated() {
		assertThat(testDataSourceConfig).isNotNull();
	}
	
	@DisplayName("when Data source created with correct JDBC Url")
	@Test
	void testDataSourceCreatedWithCorrectJDBCUrl() {
		assertThat(testDataSourceConfig.getJdbcUrl()).isEqualTo("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
	}
	

	
	
}
