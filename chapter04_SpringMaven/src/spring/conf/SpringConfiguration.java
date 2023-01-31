package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:spring/db.properties")
public class SpringConfiguration {
	
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	/*
	 * @Bean public BasicDataSource dataSource() { BasicDataSource basicDataSource =
	 * new BasicDataSource();
	 * basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 * basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	 * basicDataSource.setUsername("c##java"); basicDataSource.setPassword("bit");
	 * 
	 * application에 있는 내용과 동일하다. <bean id="dataSource"
	 * class="org.apache.commons.dbcp2.BasicDataSource"> <property
	 * name="driverClassName" value="oracle.jdbc.driver.OracleDriver" /> <property
	 * name="url" value="jdbc:oracle:thin:@localhost:1521:xe" /> <property
	 * name="username" value="c##java" /> <property name="password" value="bit" />
	 * </bean>
	 * 
	 * 
	 * return basicDataSource; }
	 */
	
	
	  @Bean public BasicDataSource dataSource() { 
		  BasicDataSource basicDataSource = new BasicDataSource();
		  basicDataSource.setDriverClassName(driver);
		  basicDataSource.setUrl(url);
		  basicDataSource.setUsername(username); 
		  basicDataSource.setPassword(password);
	  
		  return basicDataSource; 
	  }
	 
	
	

}
