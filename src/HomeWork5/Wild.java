package HomeWork5;

public abstract class Wild extends Animal{
    boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void makeVoice() {
        super.makeVoice();
        System.out.print("i am a wild animal ");
        if(isPredator){
            System.out.println("and I am angry.");
        }
    }

}
