package HomeWork5Reworked;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 2, 4,"black","Onix",true);

        Dog dog = new Dog(2, 5, 7,"Red", "Sharik", true);

        Fish fish = new Fish(3,1,0,"Gold", "Nemo", false);

        Crocodile crocodile = new Crocodile(4, 13,50,"Green", true);

        Giraffe giraffe = new Giraffe(5, 9,310,"Yellow", false);

        Hamster hamster = new Hamster(6,1,1,"Grey", "Alice", true);

        Lion lion = new Lion(7, 8,190, "Yellow", true);

        Wolf wolf = new Wolf(8, 6,90, "Grey", true);

        Guided_dog guided_dog = new Guided_dog(2, 5, 7,"Red", "Joy", true, true);

        System.out.println();
        cat.makeVoice();
        dog.makeVoice();
        fish.makeVoice();
        crocodile.makeVoice();
        giraffe.makeVoice();
        System.out.println();
        hamster.makeVoice();
        lion.makeVoice();
        wolf.makeVoice();
        guided_dog.makeVoice();

    }

}
