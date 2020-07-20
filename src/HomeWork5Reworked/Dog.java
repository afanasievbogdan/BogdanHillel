package HomeWork5Reworked;

public class Dog extends Pet{
    public Dog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        System.out.println("Hello, my name is " + getName() + ". Woof");
    }
}
