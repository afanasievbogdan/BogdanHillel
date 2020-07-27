package HomeWork10;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите параметр 'a': ");
        int a = scanner.nextInt();
        while (a == 0) {
            System.out.println("a ≠ 0");
            a = scanner.nextInt();
        }
        System.out.println("Введите параметр 'b': ");
        int b = scanner.nextInt();
        System.out.println("Введите параметр 'c': ");
        int c = scanner.nextInt();

        int D = (int) (Math.pow(b, 2)-(4*a*c));
        System.out.println("Дискриминант = " + D);

        if (D<0)
            System.out.println("Корней нет");
        else if (D == 0) {
            System.out.println("Есть один корень");
            double x1 = (-b+Math.sqrt(D))/(2*a);
            System.out.printf("%.2f", x1);
        }
        else {
            System.out.println("Есть два корня");
            double x1 = (-b+Math.sqrt(D))/(2*a);
            double x2 = (-b-Math.sqrt(D))/(2*a);
            System.out.printf("%.2f и %.2f", x1, x2);
        }
    }

}
