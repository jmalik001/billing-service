package com.dj.billingapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// @ConfigurationProperties("datasource")
// @SuppressWarnings("unused")
public class DBConfiguration {
	@Value("${datasource.driver-class-name}")
	private String diriverClassName;
	
	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.username}")
	private String username;
	@Value("${datasource.password}")
	private String password;

	@Profile("dev")
	@Bean
	public DataSource devDataSourceConfig() {
		System.out.println(diriverClassName);
		@SuppressWarnings("unchecked")
		DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(diriverClassName);
		dataSourceBuilder.url(url);
		dataSourceBuilder.username(username);
		dataSourceBuilder.password(password);

		return dataSourceBuilder.build();

	}
	
	@Profile("prod")
	@Bean
	public DataSource prodDataSourceConfig() {
		System.out.println(diriverClassName);
		@SuppressWarnings("unchecked")
		DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(diriverClassName);
		dataSourceBuilder.url(url);
		dataSourceBuilder.username(username);
		dataSourceBuilder.password(password);

		return dataSourceBuilder.build();

	}
	
	@Profile("test")
	@Bean
	public DataSource testDataSourceConfig() {
		System.out.println(diriverClassName);
		@SuppressWarnings("unchecked")
		DataSourceBuilder<DataSource> dataSourceBuilder = (DataSourceBuilder<DataSource>) DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(diriverClassName);
		dataSourceBuilder.url(url);
		dataSourceBuilder.username(username);
		dataSourceBuilder.password(password);

		return dataSourceBuilder.build();

	}
}
