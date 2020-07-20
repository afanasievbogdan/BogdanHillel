package HomeWork5Reworked;

public class Guided_dog extends Dog{
    boolean isTrained;

    public Guided_dog(int id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    public void takeHome(){
        if(isTrained)
            System.out.println("The owner has taken home");
    }

    @Override
    public void makeVoice() {
        System.out.println("\nHello, my name is " + getName() + ". Woof");
        if(isTrained)
            System.out.println("I can take you home!");
    }
}