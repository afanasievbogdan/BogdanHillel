package HomeWork3;

public class Operations {
    public static void main(String[] args) {
        System.out.println("\nOdd numbers from 1 to 99 using 'for': ");
        oddNumUsingFor();
        System.out.println("Factorial using 'for': ");
        factorialUsingFor(5);
        System.out.println("Odd numbers from 1 to 99 using 'while': ");
        oddNumUsingWhile();
        System.out.println("Factorial using 'while': ");
        factorialUsingWhile(5);
        System.out.println("Odd numbers from 1 to 99 using 'do while': ");
        oddNumUsingDoWhile();
        System.out.println("Factorial using 'do while': ");
        factorialUsingDoWhile(5);
        System.out.println("Raising to a power: ");
        raisingToAPower(2, 10);
        System.out.println("Regularity '0, -5, -10' etc.: ");
        regularity();
        System.out.println("Multiplication Table: ");
        multiplicationTable(5);
        System.out.println("Array with first 10 odd numbers: ");
        firstTenOddArray();

        System.out.println("Array filled by a random numbers: ");
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            if(i != arr.length-1) {
                System.out.print(arr[i] + ", ");
            }
            else {
                System.out.print(arr[i]);
            }
        }
        System.out.println("\n");

        findMinInArray(arr);
        findMaxInArray(arr);
        System.out.println(" ");
        switchMinAndMax(arr);
        System.out.println(" ");
        averageValueInArray(arr);

        System.out.println("\nChess board:\n");
        chessBoard();
    }

    public static void oddNumUsingFor() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void factorialUsingFor(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(factorial + "\n");
    }

    public static void oddNumUsingWhile() {
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println("\n");
    }

    public static void factorialUsingWhile(int number) {
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial + "\n");
    }

    public static void oddNumUsingDoWhile() {
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i < 100);
        System.out.println("\n");
    }

    public static void factorialUsingDoWhile(int number) {
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        System.out.println(factorial + "\n");
    }

    public static void raisingToAPower(int number, int power) {
        int result = number;
        for (int i = 1; i < power; i++) {
            result *= number;
        }
        System.out.println(number + " ^ " + power + " = " +result + "\n");
    }

    public static void regularity() {
        int count = 1;
        for (int i = 0; ; i--) {
            if (count == 10 && i % 5 == 0) {
                System.out.print(i);
                break;}
            if (i % 5 == 0) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println("\n");
    }

    public static void multiplicationTable(int number) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
        System.out.println(" ");
    }

    public static void firstTenOddArray() {
        int[] oddArr = new int[10];
        for (int i = 0; i < oddArr.length; i++) {
            oddArr[i] = i * 2 + 1;
            if(i != oddArr.length-1) {
                System.out.print(oddArr[i] + ", ");
            }
            else {
                System.out.print(oddArr[i]);
            }
        }
        System.out.println("\n");
    }

    public static void findMinInArray(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Min element = " + min);
    }

    public static void findMaxInArray(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Max element = " + max);
    }

    public static int minElement(int[] arr) {
        int minId = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minId = i;
            }
        }
        return minId;
    }

    public static int maxElement(int[] arr) {
        int maxId = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxId = i;
            }
        }
        return maxId;
    }

    public static void switchMinAndMax(int[] arr) {
        int maxId = maxElement(arr);
        int minId = minElement(arr);
        int max = arr[maxId];
        int min = arr[minId];
        arr[maxId] = min;
        arr[minId] = max;
        System.out.println(
                        "Now min element = " + arr[minId] +
                        "\nNow max element = " + arr[maxId]);
    }


    public static void averageValueInArray(int[] a) {
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        int avg = sum / a.length;
        System.out.println("Average value is " + avg);

    }

    public static void chessBoard(){
        String[][] matrix = new String[8][8];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i %2 == 0 && j%2 != 0)
                    matrix[i][j] = "◻";
                else if(i % 2 == 0)
                    matrix[i][j] = "◼";
                else if(j % 2 != 0)
                    matrix[i][j] = "◼";
                else matrix[i][j] = "◻";
            }
        }
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println(" ");
        }
    }
}