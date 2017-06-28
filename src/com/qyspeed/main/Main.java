package com.qyspeed.main;
import com.qyspeed.test.TestRunnian;
import com.qyspeed.utils.JDBCService;

import java.sql.Date;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.qyspeed.domain.Admin;
import com.qyspeed.test.TestGrade;
public class Main {

	public static void main(String[] args) throws SQLException
	{/*
		TestRunnian r=new TestRunnian();
		r.runnian();
		
		TestGrade point=new TestGrade();
		point.Grade(90.6);
		*/
	
	 JDBCService jdbctest= new JDBCService();
	 jdbctest.JDBCStart();
	}

}