package JsonPlaceHolder;

public class User {
	
	private int uid;
	private String uname;
	private String contact;
	
	public User() {
		super();
		
	}
	public User(int uid, String uname, String contact) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.contact = contact;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	

}
