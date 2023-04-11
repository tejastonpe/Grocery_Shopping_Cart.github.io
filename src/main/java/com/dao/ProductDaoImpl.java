package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.Product;
import com.util.DbUtil;

public class ProductDaoImpl implements ProductDAO {

	private static Connection con;
	static {
		con = DbUtil.getConnection();
		System.out.println("---connected---");
	}

	
	@Override
	public ArrayList<Product> getAllProducts() {
		ArrayList<Product> list = new ArrayList();

		try {
			Statement stmt = con.createStatement();

			ResultSet rset = stmt.executeQuery("select * from product");
			while (rset.next()) {
				list.add(new Product(rset.getInt("prdid"), rset.getString("pname"), rset.getDouble("price")));
			}
			return list;
			

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
		

	}

}
