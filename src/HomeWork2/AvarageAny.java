package HomeWork2;

import java.util.Scanner;

public class AvarageAny {

    public static void main(String[] args) {
        System.out.println("Введите числа через пробел");
        int avg = avarageAnyInteger();
        System.out.println("Среднее арифметическое " + avg);
    }

    public static int avarageAnyInteger() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] stringArr = input.split(" ");
        int[] intArr = new int[stringArr.length];
        int result = 0;
        int count = 0;
        for (int i = 0; i < stringArr.length; i++) {
            intArr[i] = Integer.parseInt(stringArr[i]);
            result +=intArr[i];
            count++;
        }
        return result/count;
    }
}
