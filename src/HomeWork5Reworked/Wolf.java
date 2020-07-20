package HomeWork5Reworked;

public class Wolf extends Wild{

    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void makeVoice() {
        System.out.print("\nHello, i am a wild animal. And i am angry.");
    }
}
