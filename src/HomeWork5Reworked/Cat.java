package HomeWork5Reworked;

public class Cat extends Pet{

    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        System.out.println("Hello, my name is " + getName() + ". Meow");
    }
}
