package HomeWork2;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        System.out.println("Введите сумму денежного вклада");
        Scanner scanner1 = new Scanner(System.in);
        double sum = scanner1.nextDouble();
        System.out.println("Введите процент годовых");
        Scanner scanner2 = new Scanner(System.in);
        int percent = scanner2.nextInt();
        System.out.println("Введите длительность вклада (лет)");
        Scanner scanner3 = new Scanner(System.in);
        int years = scanner3.nextInt();

        for (int i = 1; i <= years; i++) {
            double profit = sum/100*percent;
            sum = sum + profit;
            if (i%10 == 1 && i != 11)
                System.out.printf("Накопленная сумма за " + i + " год: %.2f" + ", начисленно : %.2f" + "\n", sum, profit);
            else if (i%10 == 2 && i != 12 || i%10 == 3 && i != 13 || i%10 == 4 && i != 14)
                System.out.printf("Накопленная сумма за " + i + " года: %.2f" + ", начисленно : %.2f" + "\n", sum, profit);
            else
                System.out.printf("Накопленная сумма за " + i + " лет: %.2f" + ", начисленно : %.2f" + "\n", sum, profit);
        }
    }
}
