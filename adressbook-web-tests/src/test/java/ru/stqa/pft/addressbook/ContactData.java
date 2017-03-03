package ru.stqa.pft.addressbook;

public class ContactData {
  private final String name;
  private final String last;
  private final String mob;
  private final String mail;
  private final String day;
  private final String month;
  private final String year;

  public ContactData(String name, String last, String mob, String mail, String day, String month, String year) {
    this.name = name;
    this.last = last;
    this.mob = mob;
    this.mail = mail;
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public String getLast() {
    return last;
  }

  public String getMob() {
    return mob;
  }

  public String getMail() {
    return mail;
  }

  public String getDay() {
    return day;
  }

  public String getMonth() {
    return month;
  }

  public String getYear() {
    return year;
  }
}
