
package student;

import java.io.DataInput;
import java.sql.Date;

public class StudentProfile {

	private static final String Address = null;
	String name;
	String mobileNo;
	String Email;
	String DOB;
	String Gender;
	String Addrrss;
	String City;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB2) {
		DOB = dOB2;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddrrss() {
		return Addrrss;
	}
	public void setAddrrss(String addrrss) {
		Addrrss = addrrss;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public void display() {
		
		System.out.println("Name="+this.name);
		System.out.println("Mobile No="+this.mobileNo);
		System.out.println("Email="+this.Email);
		System.out.println("DOB="+this.DOB);
		System.out.println("Gender="+this.Gender);
		System.out.println("Address="+this.Address);
		System.out.println("City="+this.City);
	}
	
	public void setDefault()
	{
		this.name="kamal kishore";
		this.mobileNo="45633333";
		this.Email="abcxyz@gmail.com";
		this.DOB="7/04/2000";
		this.Gender= "M"; "F";
		this.Address="";
		this.City="";
	}
	
}
