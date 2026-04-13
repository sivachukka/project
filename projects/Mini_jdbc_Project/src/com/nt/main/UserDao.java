package com.nt.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	public  void inserUser(int id,String uname,String uemail,int umobile) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="insert into user values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,id);
		ps.setString(2,uname);
		ps.setString(3, uemail);
		ps.setInt(4, umobile);
		int rows=ps.executeUpdate();
		con.close();
		System.out.println("no of rows inserted is:"+rows);
		System.out.println("data has been inserted successfully......");

	}
	public  void updateUser(int id,String uname,String uemail,int umobile) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="update user set uname=?,uemail=?,umobile=? where id=?";
		PreparedStatement ps=con.prepareStatement(query);

		ps.setString(1,uname);
		ps.setString(2, uemail);
		ps.setInt(3, umobile);
		ps.setInt(4,id);
		int rows=ps.executeUpdate();
		con.close();
		System.out.println("no of rows updated is:"+rows);
		System.out.println("data has been updated successfully......");

	}
	public  void deleteUser(int id) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="delete from user where id=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		int rows=ps.executeUpdate();
		con.close();
		System.out.println("no of rows deleted is:"+rows);
		System.out.println("data has been deleted successfully......");

	}
	public  void fetchUser() throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="select * from user";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		int count=0;
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("*******************************");
			count++;
		}

		if(count==0) {
			System.out.println("user not found");
		}else {
			System.out.println("no of rows fetched is:"+count);
			System.out.println("data has been fetched successfully......");
		}
		con.close();


	}
	public  void fetchsingleUser(int id) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="select * from user where id=?";
		PreparedStatement ps=con.prepareStatement(query);
		 ps.setInt(1, id); 
		ResultSet rs=ps.executeQuery();
		int count=0;
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("*******************************");
			count++;
		}

		if(count==0) {
			System.out.println("user not found");
		}else {
			System.out.println("no of rows fetched is:"+count);
			System.out.println("data has been fetched successfully......");
		}
		con.close();


	}
	public  void fetchUsername(String uname) throws ClassNotFoundException, SQLException {
		Connection con=DBUtil.getConnsection();
		String query="select * from user where uname=?";
		PreparedStatement ps=con.prepareStatement(query);
		 ps.setString(1, uname); 
		ResultSet rs=ps.executeQuery();
		int count=0;
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("*******************************");
			count++;
		}

		if(count==0) {
			System.out.println("user not found");
		}else {
			System.out.println("no of rows fetched is:"+count);
			System.out.println("data has been fetched successfully......");
		}
		con.close();


	}

}
