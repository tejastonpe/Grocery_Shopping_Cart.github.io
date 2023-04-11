package com.model;

public class Customer {
	
	//custid | custname | custemail      | username | password
	
   private int custid;
   private String custname,custemail,username,password;
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getCustname() {
	return custname;
}
public void setCustname(String custname) {
	this.custname = custname;
}
public String getCustemail() {
	return custemail;
}
public void setCustemail(String custemail) {
	this.custemail = custemail;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Customer(int custid, String custname, String custemail, String username, String password) {
	super();
	this.custid = custid;
	this.custname = custname;
	this.custemail = custemail;
	this.username = username;
	this.password = password;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", custname=" + custname + ", custemail=" + custemail + ", username="
			+ username + ", password=" + password + "]";
}
   

}
