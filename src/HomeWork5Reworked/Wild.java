package HomeWork5Reworked;

public abstract class Wild extends Animal implements MakeVoiceAnimal{
    boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

}
