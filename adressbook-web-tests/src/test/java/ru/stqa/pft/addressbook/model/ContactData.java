package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String fname;
  private final String lname;
  private final String city;
  private final String mob;
  private final String email;
  private final String year;

  public ContactData(String fname, String lname, String city, String mob, String email, String year) {
    this.fname = fname;
    this.lname = lname;
    this.city = city;
    this.mob = mob;
    this.email = email;
    this.year = year;
  }

  public String getFname() {
    return fname;
  }

  public String getLname() {
    return lname;
  }

  public String getCity() {
    return city;
  }

  public String getMob() {
    return mob;
  }

  public String getEmail() {
    return email;
  }

  public String getYear() {
    return year;
  }
}
