package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by Админ on 23.03.2017.
 */
public class ContactDeletionTests extends TestBase {

 @Test
 public void testContactDeletion() {
   int before = app.getContactHelper().getContactCount();
   app.getNavigationHelper().gotoContactPage();
   if (! app.getContactHelper().isThereAContact()) {
     app.getContactHelper().createContact(new ContactData("Василий", "Пупкин", "Москва", "1111", "dfdsdf@gdfg.cv", "1980", "test1"), true);
   }
   app.getContactHelper().selectContact();
   app.getContactHelper().initContactModification();
   app.getContactHelper().deleteSelectedContacts();
   int after = app.getContactHelper().getContactCount();
   Assert.assertEquals(after, before - 1);
 }
}

