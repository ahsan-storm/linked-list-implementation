public interface LinkedList {

  /**
   * Insert value at the end of the list
   * @param value
   */
  void insertAtTail(String value);

  /**
   * Print all the content of list
   */
  void printLinkedList();

  /**
   * Deletes the first value from the list which matches the given value
   * @param value
   */
  void deleteFirstOccurrenceOfAValue(String value);

  /**
   * Find and return the middle element of list
   * @return - middle element
   */
  String findMiddleElement();

  /**
   * Checks if a certain value exist in a list or not
   * @param value
   * @return
   */
  boolean valueExist(String value);

  /**
   * Calculate and returns the size of a list
   * @return
   */
  int findSize();
}
