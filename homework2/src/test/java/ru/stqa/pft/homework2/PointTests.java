package ru.stqa.pft.homework2;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Админ on 01.03.2017.
 */
public class PointTests {

  @Test
  public void testDistance () {
    Point p1;
    Point p2;
    p1 = new Point(3.0, 5.0);
    p2 = new Point(6.0, 9.0);
    Assert.assertEquals (Point.distance(p1, p2), 5.0);
  }
}
