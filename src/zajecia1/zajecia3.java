package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-06.
 */
public class zajecia3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj fahr");
        int fahr = scanner.nextInt();

        fahrrenheiToCelsius(fahr);
        celsiusToFahrrenheit(25);

        System.out.println("podaj a");
        int num1 = scanner.nextInt();
        System.out.println("podaj b");
        int num2 = scanner.nextInt();
        System.out.println("podaj c");
        int num3 = scanner.nextInt();
        
        minMax(num1, num2, num3);
    }

    public static void fahrrenheiToCelsius(int fahr) {
        double cel = (fahr - 32) / 1.8;
        System.out.println(fahr + " F = " + cel + " st C");
    }

    public static void celsiusToFahrrenheit(int cel) {
        double fahr = 1.8 * cel + 32;
        System.out.println(cel + " C = " + fahr + " F");
    }

    public static void minMax(int a, int b, int c) {
        int min, max;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

}
