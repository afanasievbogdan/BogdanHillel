package HomeWork7;

public class StringCollection {

    private String[] strings;
    private int currentID;

    public StringCollection(int numOfStrings){
        strings = new String[numOfStrings];
    }

    public void print(){
        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public void addElement(String s){
//        if (strings[currentID] != null){
//            System.out.println("This element is not empty. You must remove it first");
//            return;
//        }
        if (currentID >= strings.length){
            String[] buffer = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                buffer[i] = strings[i];
            }
            strings = new String[strings.length * 2];
            for (int i = 0; i < buffer.length; i++) {
                strings[i] = buffer[i];
            }
        }

        strings[currentID] = s;
        currentID++;
    }

    public void addElementByID(String s, int id){
        if (id >= strings.length){
            String[] buffer = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                buffer[i] = strings[i];
            }
            while (strings.length < id) {
                strings = new String[strings.length * 2];
            }
            for (int i = 0; i < buffer.length; i++) {
                strings[i] = buffer[i];
            }
        }
        strings[id] = s;
    }

    public void deleteElement(){
        strings[currentID-1] = null;
    }

    public void deleteElementByID(int id){
        strings[id] = null;
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
        stringCollection.addElement("q");
        stringCollection.addElement("q");
        stringCollection.addElementByID("q", 7);
        stringCollection.addElementByID("q", 8);
        stringCollection.deleteElement();
        stringCollection.deleteElementByID(7);
        stringCollection.print();
        stringCollection.get(2);
        stringCollection.get(3);
        stringCollection.get(23);

    }
}
