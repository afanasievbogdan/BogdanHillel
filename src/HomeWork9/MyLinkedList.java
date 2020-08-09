package HomeWork9;

import java.util.Collection;

public class MyLinkedList implements CustomCollectionInterface{

    private Node head;
    private Node tail;
    private int counter;

    private boolean isThisFirstAdd(Node currentNode) {
        if (head == null && tail == null) {
            head = currentNode;
            tail = currentNode;
            return true;
        }
        return false;
    }

    private void addAlgorithm(String element){
        Node currentNode = new Node(element);
        counter++;

        if(isThisFirstAdd(currentNode)){
            return;
        }

        currentNode.setPrev(tail);
        tail.setNext(currentNode);

        tail = currentNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    @Override
    public boolean add(String element) {
        addAlgorithm(element);
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (String element : strArr) {
            addAlgorithm(element);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<String> strColl) {
        for (String element : strColl) {
            addAlgorithm(element);
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (head == tail){
            head = null;
            tail = null;
            return true;
        }else if (index < 0 || index >= counter){
            return false;
        } else if (index == 0) {
            Node currentNode = head.getNext();
            currentNode.setPrev(null);
            head = currentNode;
            
        } else if (index == counter-1){
            Node currentNode = tail.getPrev();
            currentNode.setNext(null);
            tail = currentNode;

        }else{
            int currentIndex = 0;
            Node currentNode = head;
            while (currentNode != null && currentIndex < index){
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            if (currentNode != null){
                Node prevNode = currentNode.getPrev();
                Node nextNode = currentNode.getNext();
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
            } else return false;
        }
        counter--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        if (head == tail) {
            head = null;
            tail = null;
            return true;
        }else if (str.equals(getHead().getElement()))
        {
            Node currentNode = head.getNext();
            currentNode.setPrev(null);
            head = currentNode;
        } else if (str.equals(getTail().getElement())){
            Node currentNode = tail.getPrev();
            currentNode.setNext(null);
            tail = currentNode;
        } else {
            Node currentNode = head;
            while (currentNode != null && !str.equals(currentNode.getElement())){
                currentNode = currentNode.getNext();
            }
            if (currentNode != null){
                Node prevNode = currentNode.getPrev();
                Node nextNode = currentNode.getNext();
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
            } else return false;
        }
        counter--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= counter){
            return null;
        }
        int currentIndex = 0;
        Node currentNode = head;
        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        if (currentNode == null)
            return null;
        return currentNode.getElement();
    }

    @Override
    public boolean contains(String str) {
        Node currentNode = head;
        for (int i = 0; i < counter; i++) {
            if (currentNode != null && str.equals(currentNode.getElement()))
                return true;
            if (currentNode != null)
                currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public boolean clear() {

        Node currentNode = head;
        while (currentNode != null){
            Node nextNode = currentNode.getNext();
            currentNode.setPrev(null);
            currentNode.setNext(null);
            currentNode = nextNode;
        }

        tail = null;
        head = null;
        counter = 0;
        return true;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public boolean trim() {
        Node currentNode = head;
        int delCounter = 0;
        for (int i = 0; i < counter; i++) {
            if (currentNode.getElement() == null){
                Node prevNode = currentNode.getPrev();
                Node nextNode = currentNode.getNext();
                prevNode.setNext(nextNode);
                nextNode.setPrev(prevNode);
                delCounter++;
            }
            currentNode = currentNode.getNext();
        }
        counter -= delCounter;
        return delCounter > 0;
    }

    @Override
    public boolean compare(Collection<String> coll) {

        if (coll.size() != counter)
            return false;

        Node currentNode = head;
        for (String element : coll) {
            if (!element.equals(currentNode.getElement()))
                return false;
            currentNode = currentNode.getNext();
        }
        return true;
    }
}
