import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class CustomLinkedListTest {

  @Test
  public void testInsertAtTail() {
    LinkedList linkedList = new CustomLinkedList();
    assertEquals(0, linkedList.findSize());
    linkedList.insertAtTail("first value");
    linkedList.printLinkedList();
    assertEquals(1, linkedList.findSize());
  }

  @Test
  public void testDeleteFirstOccurrenceOfAValue() {
    LinkedList linkedList = new CustomLinkedList();
    linkedList.insertAtTail("first value");
    linkedList.insertAtTail("second value");
    linkedList.insertAtTail("third value");
    linkedList.insertAtTail("fourth value");

    assertEquals(4, linkedList.findSize());
    assertTrue(linkedList.valueExist("third value"));

    linkedList.deleteFirstOccurrenceOfAValue("third value");

    assertEquals(3, linkedList.findSize());
    assertFalse(linkedList.valueExist("third value"));
  }

  @Test
  public void testFindMiddleElementForOddList() {
    LinkedList linkedList = new CustomLinkedList();
    linkedList.insertAtTail("first value");
    linkedList.insertAtTail("second value");
    linkedList.insertAtTail("third value");
    linkedList.insertAtTail("fourth value");
    linkedList.insertAtTail("fifth value");

    assertEquals(5, linkedList.findSize());
    assertEquals("third value", linkedList.findMiddleElement());
  }

  @Test
  public void testFindMiddleElementForEvenList() {
    LinkedList linkedList = new CustomLinkedList();
    linkedList.insertAtTail("first value");
    linkedList.insertAtTail("second value");
    linkedList.insertAtTail("third value");
    linkedList.insertAtTail("fourth value");

    assertEquals(4, linkedList.findSize());
    assertEquals("second value", linkedList.findMiddleElement());
  }

}