package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Админ on 22.03.2017.
 */
public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().gotoContactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().deleteSelectedContacts();
  }
}
