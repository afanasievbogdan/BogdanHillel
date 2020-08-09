package HomeWork9;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    public static void printList(MyLinkedList linkedList){
        System.out.println("\n==================");
        Node currentNode = linkedList.getHead();
        if (currentNode == null)
            return;
        do {
            System.out.println(currentNode.getElement());
            currentNode = currentNode.getNext();
        }while (currentNode != null);
        System.out.println("==================\n");
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

        linkedList.add("Hi1");
        linkedList.add("Hi2");
        linkedList.add("Hi3");

        String[] strings = new String[]{"1", "2", "3"};

        linkedList.addAll(strings);

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");

        linkedList.addAll(arrayList);

        linkedList.delete(0);
        linkedList.delete(5);
        System.out.println(linkedList.delete(7));

        linkedList.delete("1");
        System.out.println(linkedList.delete("=)"));

        printList(linkedList);

        System.out.println(linkedList.get(5));

        System.out.println("size = " + linkedList.size());

        System.out.println(linkedList.contains("Hello"));
        System.out.println(linkedList.contains("Hello3"));

        List<String> compareList = new ArrayList<>();
        compareList.add("Hi2");
        compareList.add("Hi3");
        compareList.add("2");
        compareList.add("3");
        compareList.add("Hello2");
        compareList.add("Hello3");

        System.out.println(linkedList.compare(compareList));

        linkedList.clear();

        printList(linkedList);

        linkedList.add("9");
        linkedList.add(null);
        linkedList.add("7");

        printList(linkedList);

        linkedList.trim();

        printList(linkedList);

        System.out.println(linkedList.trim());

    }

}
