import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;

import java.util.List;

public class LinkedListTests {
	
  @Test
  public void testFirst() {
    LinkedList ll = new LinkedList();
    ll.append(5);
    ll.append(6);
    ll.append(7);
    ll.append(8);
    assertEquals(5, ll.first());
  }

  @Test
  public void test2First() {
    LinkedList ll = new LinkedList();
    ll.append(1);
    assertEquals(1, ll.first());
  }

}
