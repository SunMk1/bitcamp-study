package com.eomcs.mylist.domain;

public class Contact {
  int no;
  String name;
  String tel;
  String email;
  String company;

  @Override
  public String toString() {
    return "Contact [no=" + no + ", name=" + name + ", tel=" + tel + ", email=" + email
        + ", company=" + company + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}