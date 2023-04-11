package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.model.Customer;

import com.util.DbUtil;

public class CustomerDaoImpl implements CustomerDAO {

	private static Connection con;
	static 
	{
		con=DbUtil.getConnection();
		System.out.println("----con----");
	}
	
	@Override
	public Customer validateCustomer(String username, String pwd) {
		
		System.out.println("----inside validateCustomer-----"+username +"   "+pwd);
		try
		{
		PreparedStatement pstmt=con.prepareStatement("select * from  customer where username=? and password=?");
		pstmt.setString(1, username);
		pstmt.setString(2, pwd);
		ResultSet rset=pstmt.executeQuery();
		
		if(rset.next())
		{
			System.out.println("---valid customer----");
			return new Customer(rset.getInt("custid"),rset.getString("custname"),
					rset.getString("custemail"),rset.getString("username"),
					rset.getString("password"));
		}
		else
		{
			System.out.println("----invalid----");
			return null;
		}
		
		
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public int addCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return 0;
	}

}
