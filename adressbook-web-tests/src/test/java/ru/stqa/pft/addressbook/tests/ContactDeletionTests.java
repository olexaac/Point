package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

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
   app.getContactHelper().selectContact();
   app.getContactHelper().initContactModification();
   app.getContactHelper().deleteSelectedContacts();
 }
}

