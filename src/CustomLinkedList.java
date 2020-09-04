public class CustomLinkedList implements LinkedList {

  Node head;

  @Override
  public void insertAtTail(String value) {
    Node newNode = new Node(value);

    if (head == null) {
      head = newNode;
    } else {
      Node lastNode = head;

      while (lastNode.getNext() != null) {
        lastNode = lastNode.getNext();
      }

      lastNode.setNext(newNode);
    }
  }

  @Override
  public void printLinkedList() {
    Node currentNode = head;
    System.out.println("Printing content of list");
    System.out.println("------------------------");

    while (currentNode != null) {
      System.out.println(currentNode.getValue());
      System.out.println("------------------------");
      currentNode = currentNode.getNext();
    }
  }

  @Override
  public void deleteFirstOccurrenceOfAValue(String value) {
    Node currentNode = head, previousNode = null;

    // If value is found on the first node which is head
    if (currentNode != null && currentNode.getValue().equals(value)) {
      head = head.getNext();
    }

    // If value is not on the first node
    while (currentNode != null && !currentNode.getValue().equals(value)) {
      previousNode = currentNode;
      currentNode = currentNode.getNext();
    }

    if (currentNode != null) {
      previousNode.setNext(currentNode.getNext());
    }
  }

  @Override
  public String findMiddleElement() {
    Node fastPointer = head, slowPointer = head;

    if (head == null) {
      System.out.println("Linked list is empty");
      return null;
    } else {
      while (fastPointer.getNext() != null && fastPointer.getNext().getNext() != null) {
        fastPointer = fastPointer.getNext().getNext();
        slowPointer = slowPointer.getNext();
      }
      System.out.println("Middle element is: " + slowPointer.getValue());
      return slowPointer.getValue();
    }
  }

  @Override
  public boolean valueExist(String value) {
    if (head != null) {
      Node currentNode = head;
      while (currentNode != null) {
        if (currentNode.getValue().equals(value)) {
          return true;
        }
        currentNode = currentNode.getNext();
      }
    }
    return false;
  }

  @Override
  public int findSize() {
    Node currentNode = head;
    int length = 0;

    while (currentNode != null) {
      length++;
      currentNode = currentNode.getNext();
    }

    return length;
  }
}