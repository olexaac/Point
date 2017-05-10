package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
      List<ContactData> before = app.getContactHelper().getContactList();
      app.getContactHelper().createContact(new ContactData("Василий", "Пупкин", "Москва", "1111", "dfdsdf@gdfg.cv", "1980", "test1"), true);
      List<ContactData> after = app.getContactHelper().getContactList();
      Assert.assertEquals(after.size(), before.size() + 1);
    }

}
