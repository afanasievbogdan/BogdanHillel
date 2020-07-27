package HomeWork10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class NoDuplicatesCollection {

    public static Collection<Integer> deleteDuplicatesFromCollection(Collection<Integer> collection) {
        return new HashSet<>(collection);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(5);
            arrayList.add(6);
        }
        arrayList.add(7);

        System.out.println(arrayList);

        System.out.println(deleteDuplicatesFromCollection(arrayList));


    }

}
