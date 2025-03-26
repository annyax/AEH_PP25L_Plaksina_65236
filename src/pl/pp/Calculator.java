package pl.pp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWybierz operację:");
            System.out.println("1 - Dodawanie (+)");
            System.out.println("2 - Odejmowanie (-)");
            System.out.println("3 - Mnożenie (*)");
            System.out.println("4 - Dzielenie (/)");
            System.out.println("0 - Wyjście");

            System.out.print("Twój wybór: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Zakończenie programu.");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Niepoprawna opcja, spróbuj ponownie.");
                continue;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            double num1 = scanner.nextDouble();
            System.out.print("Podaj drugą liczbę: ");
            double num2 = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Wynik: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Wynik: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Wynik: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Błąd! Dzielenie przez zero.");
                    } else {
                        System.out.println("Wynik: " + (num1 / num2));
                    }
                    break;
            }
        }

        scanner.close();
    }
}