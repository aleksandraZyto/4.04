package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class skaner {
    public static void main(String[] args) {
        //max();
        //isEven();
        //sumOddElements();
        //countEvenElements();
        //incrementElements();
        //addPreviousElements();
        //multiplyBy2();
        //fillArray();
        //fillArrayWithUnknownSize();
        addElementsMultipliedBy();
    }

    public static void max() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert first number: ");
        int number = scanner.nextInt();
        System.out.println("insert second number ");
        int number2 = scanner.nextInt();

        if (number > number2) {
            System.out.println("first num is bigger than num2");
        } else if (number == number2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("first num is not bigger than num2");
        }

    }

    public static void incrementElements() {
        int[] array = {0, 1, 4, 3, 7, 9, 8, 4, -5, -8, -3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] += 1;
                System.out.println(array[i]);
            }
        }
    }

    public static void addPreviousElements() {
        int[] array = {0, 1, 4, 3, 7, 9, 8, 4, -5, -8, -3};
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
            System.out.println(array[i]);
        }
    }

    public static void isEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert 1st num");
        int num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("num1 is even");
        } else {
            System.out.println("num1 is not even");
        }
    }

    public static void multiplyBy2() {
        int[] array = {0, 1, 4, 3, 7, 9, 8, 4};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 3 == 0) {
                array[i] *= 2;
                System.out.println(array[i]);
            }
        }
    }

    public static void fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert size ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj" + i + "element");
            array[i] = scanner.nextInt();
        }
    }

    public static void fillArrayWithUnknownSize() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int element = 1;
        int i = 0;
        while (element != 0) {
            System.out.println("ïnsert next num. press 0 to break");
            element = scanner.nextInt();
            array[i] = element;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(array[j]);
        }
    }


    public static void sumOddElements() {
        int[] array = {0, 1, 4, 3, 7, 9, 8, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void countEvenElements() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 9};
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }

    public static void addElementsMultipliedBy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of array?");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Podaj " + i + " numer");
            if (i == 0) {
                array[i] = scanner.nextInt();
            } else {
                array[i] = scanner.nextInt() * array[i - 1];
            }
        }
        for(int i =0; i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
