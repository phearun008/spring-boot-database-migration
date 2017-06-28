/*package com.phearun.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class LiquibaseConfiguration {
	
	
	@Autowired
	private DataSource dataSource;
	
	@Bean(name="liquibase")
	public SpringLiquibase springLiquibase(){
		SpringLiquibase springLiquibase = new SpringLiquibase();
		springLiquibase.setDataSource(dataSource);
		springLiquibase.setChangeLog("classpath:/db/changelog/db.changelog-master.xml");
		return springLiquibase;
	}
	
	@Autowired
	@Bean(name="liquibase")
	public SpringLiquibase springLiquibase(DataSource dataSource){
		SpringLiquibase springLiquibase = new SpringLiquibase();
		springLiquibase.setDataSource(dataSource);
		springLiquibase.setChangeLog("classpath:/db/changelog/db.changelog-master.xml");
		return springLiquibase;
	}
	
}
*/