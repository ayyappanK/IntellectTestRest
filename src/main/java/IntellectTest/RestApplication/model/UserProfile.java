package IntellectTest.RestApplication.model;

import java.sql.Date;

public class UserProfile {
	private String empNo;
	private String empName;
	private String position;
	private String emailID;
	private long pincode;
	private boolean isActive;
	private Date dob;

	    // This default constructor is required if there are other constructors.
public UserProfile() {
	
}

public UserProfile(String empNo, String empName, String position,String emailId,long pincode,Date dob,boolean isActive) {
	this.empNo = empNo;
	        this.empName = empName;
	
	        this.position = position;
	    }
	 
	    public String getEmpNo() {
	        return empNo;
	    }
	 
	    public void setEmpNo(String empNo) {
	        this.empNo = empNo;
	    }
	 
	    public String getEmpName() {
	        return empName;
	    }
	 
	    public void setEmpName(String empName) {
	this.empName = empName;
	    }

public String getPosition() {
	return position;
	    }
	 
	    public void setPosition(String position) {
	        this.position = position;
	    }

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	 
	}

