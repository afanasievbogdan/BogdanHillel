package HomeWork7;

public class StringCollection {

    private String[] strings;
    private int current;

    public StringCollection(int numOfStrings){
        strings = new String[numOfStrings];
    }

    private void collectionCopy(){
        String[] buffer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            buffer[i] = strings[i];
        }
        strings = new String[strings.length + 1];
        for (int i = 0; i < buffer.length; i++) {
            strings[i] = buffer[i];
        }
    }

    public void print(){
        System.out.println();
        for (String string : strings) {
            if(string != null)
            System.out.println(string);
        }
    }

    public void addElement(String s){
        if (current >= strings.length){
            collectionCopy();
        }

        strings[current] = s;
        current++;
    }

    public void addElementByID(String s, int id){
        while (id >= strings.length){
            collectionCopy();
        }
        strings[id] = s;
    }

    public void deleteElementByValue(String value){
        String[] buffer = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            if (value.equals(strings[i])) {
                strings[i] = null;
                System.arraycopy(strings, 0, buffer, 0, strings.length);
                System.arraycopy(buffer, 0, strings, 0, i);
                if (strings.length - 1 - i >= 0) System.arraycopy(buffer, i + 1, strings, i, strings.length - 1 - i);
                current--;
            }
        }

    }

    public void deleteElementByID(int id){
        String[] buffer = new String[strings.length];
        strings[id] = null;
        System.arraycopy(strings, 0, buffer, 0, strings.length);
        System.arraycopy(buffer, 0, strings, 0, id);
        if (strings.length - 1 - id >= 0) System.arraycopy(buffer, id + 1, strings, id, strings.length - 1 - id);
        current--;
    }

    public void get(int index){
        if(index < strings.length && index > 0){
            if (strings[index] == null)
                System.out.println("by index '" + index + "' was found empty element");
            else
                System.out.println("by index '" + index + "' was found String '" + strings[index] + "'");
        }else
            System.out.println("index '" + index + "' is out of array ");
    }

    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection(3);
        stringCollection.addElement("q");
        stringCollection.addElement("q");
        stringCollection.addElement("w");
        stringCollection.addElement("q");
        stringCollection.deleteElementByValue("w");

        stringCollection.addElementByID("q", 7);
        stringCollection.addElementByID("q", 8);

        stringCollection.deleteElementByID(7);
        stringCollection.print();
        stringCollection.get(2);
        stringCollection.get(3);
        stringCollection.get(23);

    }
}
