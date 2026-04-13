package com.nt.main;

import java.sql.SQLException;

public class UserDriver {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDao d1=new UserDao();
	//d1.inserUser(101, "siva", "chasivakumar21@gmail.com", 790225389);
//		d1.inserUser(111, "rakesh", "ckkasivakumar221@gmail.com", 780225389);
//		d1.inserUser(112, "verresa", "ukkasivakumar1001@gmail.com", 770225389);
//		d1.inserUser(113, "kkad", "kkasivakuar201@gmail.com", 780255389);
//		d1.inserUser(114, "kadhar", "chuakumar212@gmail.com", 780225289);
//		d1.inserUser(115, "sradr", "chsivakumar2121@gmail.com", 780235389);
//		d1.inserUser(116, "ssfaumar", "kkasikumar2111@gmail.com", 780245389);
		//d1.updateUser(101, "raj", "csivakumar21@gmail.com",99084242);
		d1.deleteUser(101);
		//d1.fetchUser();
		d1.fetchUsername("siva");
	}

}
