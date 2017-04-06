package zajecia1;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-05.
 */
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("1. dodawanie");
        System.out.println("2. odejmowanie");
        System.out.println("3. mnozenie");
        System.out.println("4. dzielenie");
        System.out.println("5. wartosc bezwzgledna");
        System.out.println("6. silnia dodawalna");
        System.out.println("7. srednia");
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        System.out.println("ïnsert first number");
        int a = scanner.nextInt();
        System.out.println("insert second number");
        int b = scanner.nextInt();

        if (selected == 1) {
            add(a, b);
        } else if (selected == 2) {
            minus(a, b);
        } else if (selected == 3) {
            multiply(a, b);
        } else if (selected == 4) {
            divide(a, b);
        } else if (selected == 5) {
            int roznica = a - b;
            if (roznica < 0) {
                int abs = roznica * (-1);
                System.out.println("Wartosc bezwzgledna = " + abs);
            } else {
                System.out.println("Wartosc bezwzgledna = " + roznica);
            }
        } else if (selected == 6) {
            sumLessThan(a);
        }
    }

    public static void add(int num1, int num2) {
        int wynik = num1 + num2;
        System.out.println("wynik dodawania " + wynik);
    }

    public static void minus(int num1, int num2) {
        int wynik = num1 - num2;
        System.out.println("wynik odejmowania " + wynik);
    }

    public static void multiply(int num1, int num2) {
        int wynik = num1 * num2;
        System.out.println("wynik mnozenia " + wynik);
    }

    public static void divide(int num1, int num2) {
        int wynik = num1 / num2;
        System.out.println("wynik dzielenia " + wynik);
    }

    public static void sumLessThan(int num) {
        int wynik = 0;
        for (int i = 1; i < num; i++) {
            wynik += i;
        }
        System.out.println("Wynik to " + wynik);
    }

    public static void avg(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        double avg=sum/((double)array.length);
        System.out.println("Wynik to "+avg);
    }

}

