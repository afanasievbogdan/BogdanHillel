package HomeWork2;

public class Average {
    private int firstNumber;
    private int secondNumber;

    public static int avg(int firstNumber, int secondNumber){
        return (firstNumber+secondNumber)/2;
    }

    public static void main(String[] args) {
        int avg = avg(20,15);
        System.out.println(avg);
    }
}
