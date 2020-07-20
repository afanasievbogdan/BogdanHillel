package HomeWork5Reworked;

public class Giraffe extends Wild{
    public Giraffe(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void makeVoice() {
        System.out.print("\nHello, i am a wild animal ");
    }

}
