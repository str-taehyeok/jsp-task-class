package com.app.task.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TaskConfig {
	private static SqlSessionFactory sqlSesseionFactory;
	
	static {
		String resource = "com/app/task/config/config.xml";
		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSesseionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSesseionFactory;
		
	}
	
	
	
	
}
