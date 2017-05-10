package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

/**
 * Created by Админ on 23.03.2017.
 */
public class ContactDeletionTests extends TestBase {

 @Test
 public void testContactDeletion() {
   app.getNavigationHelper().gotoContactPage();
   if (! app.getContactHelper().isThereAContact()) {
     app.getContactHelper().createContact(new ContactData("Василий", "Пупкин", "Москва", "1111", "dfdsdf@gdfg.cv", "1980", "test1"), true);
   }
   List<ContactData> before = app.getContactHelper().getContactList();
   app.getContactHelper().selectContact(before.size() - 1);
   app.getContactHelper().initContactModification();
   app.getContactHelper().deleteSelectedContacts();
   List<ContactData> after = app.getContactHelper().getContactList();
   Assert.assertEquals(after.size(), before.size() - 1);
 }
}

