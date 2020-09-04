public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new CustomLinkedList();

        for (int i=1; i<=10; i++) {
            linkedList.insertAtTail(String.valueOf(i ));
        }
        linkedList.printLinkedList();
        linkedList.findMiddleElement();

        System.out.println("\n********************\n");
        linkedList.deleteFirstOccurrenceOfAValue("4");
        linkedList.printLinkedList();
        linkedList.findMiddleElement();
    }
}
