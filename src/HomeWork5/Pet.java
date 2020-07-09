package HomeWork5;

public abstract class Pet extends Animal{
    String name;
    boolean isVaccinated;

    public Pet(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.println("my name is " + name);
    }
}
