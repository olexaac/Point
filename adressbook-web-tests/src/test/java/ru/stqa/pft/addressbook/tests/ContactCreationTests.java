package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Василий", "Пупкин", "Москва", "1111", "dfdsdf@gdfg.cv", "1980", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToContactPage();
    }

}
