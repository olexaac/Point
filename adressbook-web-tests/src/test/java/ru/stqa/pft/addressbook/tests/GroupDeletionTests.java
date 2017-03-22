package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by Админ on 22.03.2017.
 */
public class GroupDeletionTests extends TestBase {

  @Test
    public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}
