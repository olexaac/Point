package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Админ on 23.03.2017.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Василий", "Пупкин", "Москва", "1111", "dfdsdf@gdfg.cv", "1980", null), false);
    app.getContactHelper().updateContactModification();
    app.getContactHelper().returnToContactPage();
  }
}