package model;

public class bidderdetails {
	
	private int id;
	private String bname;
	private String busername;
	private String bpassword;
	public bidderdetails(int id, String bname, String busername, String bpassword) {
		super();
		this.id = id;
		this.bname = bname;
		this.busername = busername;
		this.bpassword = bpassword;
	}
	public int getId() {
		return id;
	}
	
	public String getBname() {
		return bname;
	}
	
	public String getBusername() {
		return busername;
	}
	
	public String getBpassword() {
		return bpassword;
	}
	

}
