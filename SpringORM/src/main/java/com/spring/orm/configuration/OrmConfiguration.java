package com.spring.orm.configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entity.Student;

@Configuration
@EnableTransactionManagement
public class OrmConfiguration {

	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDao();
		studentDao.setHibernateTemplate(getHibernateTemplate());
		return studentDao;
	}
	
	@Bean(name = "hibernateTemplate")
	public HibernateTemplate getHibernateTemplate() {
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(getSessionFactory().getObject());		
		return hibernateTemplate;
	}
	
	@Bean(name = "localSessionFactory")
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		
		Properties hibernateroperties = new Properties();
		hibernateroperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hibernateroperties.setProperty("hibernate.show_sql", "true");
		hibernateroperties.setProperty("hibernate.hbm2ddl.auto", "update");
		factoryBean.setHibernateProperties(hibernateroperties);
		
		
		factoryBean.setAnnotatedClasses(Student.class);
		
		return factoryBean;
	}
	
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/spring_orm");
		ds.setUsername("root");
		ds.setPassword("root");		
		return ds;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}
}
