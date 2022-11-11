package utill;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import model.admin;
import model.admindetail;
import model.bidderdetails;
import model.feedbackdetails;
import model.listproduct;
import model.sellerdetails;






public class adminDbutill {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	//admin login validate
	public static boolean validate(String ausername,String apassword) {
		
		try {
			
			con = DBConnect.getConnection();//connecting data base
			stmt = con.createStatement();
			String sql="select * from admin where AdminUsername='"+ausername+"' and AdminPassword='"+apassword+"'";
			rs= stmt.executeQuery(sql);
		
			
			if(rs.next()) {
				
				isSuccess = true;
				
			}
			else
			{
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("adminDbutill connection error!!!");
		}
		
		
		return isSuccess;
	}
	
	public static List<admin> getadmin(String auserName){
		ArrayList<admin> adm=new ArrayList<>();
		
		try {
			con = DBConnect.getConnection(); 
			stmt = con.createStatement();
			String sql="select * from admin where AdminUsername='"+auserName+"'";
			rs= stmt.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String NIC=rs.getString(4);
				String username=rs.getString(5);
				String password=rs.getString(6);
				
				admin cus = new admin(id,name,phone,NIC,username,password);
				adm.add(cus);
			}
			
		}
		catch(Exception e) {
			
		}
		
		
		
		
		return adm;
		
	}
	
	
	// display item details
	
	 public static List<listproduct> getproductDetails() {
	    	
	    
	    	
	    	ArrayList<listproduct> cus = new ArrayList<listproduct>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from products  ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String pname = rs.getString(2);
	    			String pdescription = rs.getString(3);
	    			Double pprice = rs.getDouble(4);
	    			int psellerid = rs.getInt(5);
	    			int pbidderid = rs.getInt(6);
	    			
	    			listproduct c = new listproduct (id,pname,pdescription,pprice,psellerid,pbidderid);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill display item connection error!!");
	    	}	
	    	return cus;	
	    }
	
	//display bidder details
	 public static List<bidderdetails> getbidderDetails() {
	    	
		    
	    	
	    	ArrayList<bidderdetails> cus = new ArrayList<bidderdetails>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from bidder  ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String bname = rs.getString(2);
	    			String busername = rs.getString(3);
	    			String bpassword = rs.getString(4);
	    			
	    			
	    			bidderdetails c = new bidderdetails (id,bname,busername,bpassword);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill display bidder connection error!!");
	    	}	
	    	return cus;	
	    }
	 
	//display seller details
	 public static List<sellerdetails> getsellerDetails() {
	    	
		    
	    	
	    	ArrayList<sellerdetails> cus = new ArrayList<sellerdetails>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from seller  ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String sname = rs.getString(2);
	    			String susername = rs.getString(3);
	    			String spassword = rs.getString(4);
	    			
	    			
	    			sellerdetails c = new sellerdetails (id,sname,susername,spassword);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill display seller connection error!!");
	    	}	
	    	return cus;	
	    }
	
	 //display feedback details
	 public static List<feedbackdetails> getfeedbackDetails() {
	    	
		    
	    	
	    	ArrayList<feedbackdetails> cus = new ArrayList<feedbackdetails>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from feedback  ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String feedbackdescription = rs.getString(2);
	    			int sellerid = rs.getInt(3);
	    			int bidderid = rs.getInt(4);
	    			
	    			
	    			feedbackdetails c = new feedbackdetails (id,feedbackdescription,sellerid,bidderid);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill display feedback connection error!!");
	    	}	
	    	return cus;	
	    }
	 
	 //update admin details
	 
	 public static boolean updateitem(String id, String name, String description, String price, String sellerid, String bidderid) {
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update products set ProductName='"+name+"',Productdescription='"+description+"',BidPrice='"+price+"',Sellerid='"+sellerid+"',Bidderid='"+bidderid+"'"
	    				+ "where ProductID='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill update connection error!!");
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 //insert admin details
	 
	 public static boolean insertadmin(String name, String phone, String NIC, String username, String password) {
		 
		 boolean isSuccess = false;
		 
		 try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "insert into admin values(0,'"+name+"','"+phone+"','"+NIC+"','"+username+"','"+password+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill insert connection error!!");
	    	}	
 		
		 
		 
		 
		 return isSuccess;
		 
		 
	 }
	 
	 //delete product
	 
	 public static boolean deleteproduct(String id) {
		 int convId = Integer.parseInt(id);
		 
		 try {

	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from products where ProductID='"+convId+"'";
	    		int r = stmt.executeUpdate(sql);
			 
	    		if(r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
		 }
		 catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill delete connection error!!");
	    	}	
		 
		 
		 return isSuccess;
	 }
	 //view admin details
	 public static List<admindetail> getadminDetails() {
	    	
		    
	    	
	    	ArrayList<admindetail> cus = new ArrayList<admindetail>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from admin  ";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String aname = rs.getString(2);
	    			String atelephone = rs.getString(3);
	    			String aNIC = rs.getString(4);
	    			String ausername = rs.getString(5);
	    			String apassword = rs.getString(6);
	    			
	    			admindetail c = new admindetail (id,aname,atelephone,aNIC,ausername,apassword);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill display item connection error!!");
	    	}	
	    	return cus;	
	    }
	 //update admin details
	
	 public static boolean updateadmindetail(String id, String aname, String atelephone, String aNIC, String ausername, String apassword) {
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update admin set Adminname='"+aname+"',AdminTelephone='"+atelephone+"',AdminNIC='"+aNIC+"',AdminUsername='"+ausername+"',AdminPassword='"+apassword+"'"
	    				+ "where AdminID='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill update admin connection error!!");
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 // admin account delete
	 public static boolean deleteadminaccount(String aNIC) {
		 
		 
		 try {

	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from admin where AdminNIC='"+aNIC+"'";
	    		int r = stmt.executeUpdate(sql);
			 
	    		if(r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
		 }
		 catch(Exception e) {
	    		e.printStackTrace();
	    		System.out.println("dbutill delete admin account connection error!!");
	    	}	
		 
		 
		 return isSuccess;
	 }
	 
}


