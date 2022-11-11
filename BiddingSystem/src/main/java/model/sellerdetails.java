package model;

public class sellerdetails {
	
	private int id;
	private String sname;
	private String susername;
	private String spassword;
	public sellerdetails(int id, String sname, String susername, String spassword) {
		super();
		this.id = id;
		this.sname = sname;
		this.susername = susername;
		this.spassword = spassword;
	}
	public int getId() {
		return id;
	}
	
	public String getSname() {
		return sname;
	}
	
	public String getSusername() {
		return susername;
	}
	
	public String getSpassword() {
		return spassword;
	}
	

}
