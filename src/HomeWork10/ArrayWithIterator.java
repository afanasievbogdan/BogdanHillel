package HomeWork10;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayWithIterator implements Iterator{

    Integer[] integers;

    public ArrayWithIterator(int arraySize) {
        integers = new Integer[arraySize];
    }

    private int current = 0;

    @Override
    public boolean hasNext() {
        return current < integers.length && integers[current] != null;
    }

    @Override
    public Object next() {
        System.out.println(integers[current]);
        return integers[current++];
    }

    @Override
    public void remove() {
        integers[current] = null;
        System.out.println(integers[current]);
    }

    public void full(){
        Arrays.fill(integers, 5);
    }

    public static void main(String[] args) {
        ArrayWithIterator arrayWithIterator = new ArrayWithIterator(5);
        arrayWithIterator.full();

        while (arrayWithIterator.hasNext())
            arrayWithIterator.next();

    }

}






