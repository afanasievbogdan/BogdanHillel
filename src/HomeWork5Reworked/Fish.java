package HomeWork5Reworked;

public class Fish extends Pet{
    public Fish(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void makeVoice() {
        System.out.println("\n....");
    }
}
