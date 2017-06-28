package com.qyspeed.utils;
import java.sql.*;
/*
 * Class.forname()
 * DriverManage
 * Statement/PreparedStatement
 * Result
 * executeQuery/executeUpdate
 */
public class JDBCService {
    public Connection conn;
	public Statement stmt;
	static final String DBURL="jdbc:mysql://120.76.145.98:3306/dengjiajun";
	static final String USER="root";
    static final String PASSWORD="jiajun";
	public void JDBCStart() throws SQLException
	{
	try {
		
		//ע���������
		Class.forName("com.mysql.jdbc.Driver");
		//�����ӣ������������ݿ�
	    System.out.println("�����������ݿ�...");
	    conn=DriverManager.getConnection(DBURL,USER,PASSWORD);//Connection���� =��������.��ȡ����(��ַ,�û�,����)
	    
	    //����Statement ������ִ�� sql���
	    //executeQuery()-��ѯ
	    //executeUpdate()-����insert����ɾ(delete)����(update)
	    System.out.println("ʵ����Statementִ��sql���");
	    stmt=conn.createStatement();
	    String sql;
	    sql="select username from admin";
	    ResultSet rs=stmt.executeQuery(sql);//���� ��ѯ����ķ��ؼ�
	    //�����ؽ����
	    while(rs.next())
	    {
	    	String test1=rs.getString("username");
	    	System.out.println("�û�����"+test1);
	    	
	    }
	    //�����ر�JDBC����
	    rs.close();
	    stmt.close();
	    conn.close();
	    
	} catch (SQLException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}catch (Exception e)
	{
		e.printStackTrace();
	}finally
	{
		try
		{
			if(stmt!=null) {stmt.close();}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		try
		{
			if(conn!=null){conn.close();}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println("goodbye");
	}
	}
	
}
