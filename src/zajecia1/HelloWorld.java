package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-04.
 */
public class HelloWorld {
    public static void main(String[] args) {
        //checkBigger();
        //arrayTest();
        //displayEvenNumbers();
        //greaterThan0();
        //listPositiveEven();
        //sumOfElements();
        //sumOfEven();
        //sumOfPositive();
        //avg();
        sumOf();
        //sumMultipliedBy();
        //Scanner scanner = new Scanner(System.in);
        //int number = scanner.nextInt();
        //System.out.println("your number is " + number);
    }


    public static void checkAge() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Age over 18");
        } else {
            System.out.println("age under 18");
        }
    }

    public static void isNumberEven() {
        int number = 13;
        int wynik = number % 2;
        if (wynik == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is not even");
        }
    }

    public static void checkBigger() {
        int number1 = 2;
        int number2 = 2;
        if (number1 > number2) {
            System.out.println("num1 is bigger than num2");
        } else if (number1 == number2) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("num1 isn't bigger than num2");
        }

    }

    public static void arrayTest() {
        int[] array = {3, 6, 98, 2, 5};
        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }

    public static void displayEvenNumbers() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                System.out.println(array1[i]);
            }
        }
    }

    public static void greaterThan0() {
        int[] array2 = {-1, 0, 5, -10, 6, -4, 11, 7};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > 0) {
                System.out.println(array2[i] + "is greater than 0");
            }
        }
    }

    public static void listPositiveEven() {
        int[] array2 = {-1, 0, 5, -10, 6, -4, 11, 7};
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 == 0 && array2[i] > 0) {
                System.out.println(array2[i] + "is greater than 0 and even");
            }
        }
    }

    public static void sumOfElements() {
        int[] array2 = {-1, 0, 5, -10, 6, -4, 11, 7};
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        System.out.println("Suma = " + sum);
    }

    public static void sumOfEven() {
        int[] array = {-1, 0, 5, -10, 6, -4, 11, 7};
        int wynik = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                wynik = wynik + array[i];
            }
        }
        System.out.println(wynik);
    }

    public static void sumOfPositive() {
        int[] array = {-1, 0, 5, -10, 6, -4, 11, 7};
        int wynik = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                wynik = wynik + array[i];
            }
        }
        System.out.println(wynik);
    }

    public static void avg() {
        int[] array = {2, 4, 7};
        int suma = 0;
        int srednia = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        //suma / (double)array.length;
        System.out.println(srednia);
    }

    public static void sumOf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Instert your number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void sumMultipliedBy() {
        int[] array = {1, 2, 2, 3};
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            sum+=array[i]*i;
        }
        System.out.println(sum / (double) array.length);

    }

}


