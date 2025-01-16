package vo;

import java.util.*;

public class MemberVO {

  private String id, nickname, pw, name, gender, email, address1, address2, phone, is_admin, last_login, msg;
  private Date reg_date, birth;

  public String getId() {
	return id;
  }

  public void setId(String id) {
	this.id = id;
  }

  public String getNickname() {
	return nickname;
  }

  public void setNickname(String nickname) {
	this.nickname = nickname;
  }

  public String getPw() {
	return pw;
  }

  public void setPw(String pw) {
	this.pw = pw;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getGender() {
	return gender;
  }

  public void setGender(String gender) {
	this.gender = gender;
  }

  public String getEmail() {
	return email;
  }

  public void setEmail(String email) {
	this.email = email;
  }

  public String getAddress1() {
	return address1;
  }

  public void setAddress1(String address1) {
	this.address1 = address1;
  }

  public String getAddress2() {
	return address2;
  }

  public void setAddress2(String address2) {
	this.address2 = address2;
  }

  public String getPhone() {
	return phone;
  }

  public void setPhone(String phone) {
	this.phone = phone;
  }

  public String getIs_admin() {
	return is_admin;
  }

  public void setIs_admin(String is_admin) {
	this.is_admin = is_admin;
  }

  public String getLast_login() {
	return last_login;
  }

  public void setLast_login(String last_login) {
	this.last_login = last_login;
  }

  public String getMsg() {
	return msg;
  }

  public void setMsg(String msg) {
	this.msg = msg;
  }

  public Date getReg_date() {
	return reg_date;
  }

  public void setReg_date(Date reg_date) {
	this.reg_date = reg_date;
  }

  public Date getBirth() {
	return birth;
  }

  public void setBirth(Date birth) {
	this.birth = birth;
  }
}
