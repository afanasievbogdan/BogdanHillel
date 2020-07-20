package HomeWork5Reworked;

public class Lion extends Wild{
    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void makeVoice() {
        System.out.print("\nHello, i am a wild animal. And i am angry.\n");
    }

}
