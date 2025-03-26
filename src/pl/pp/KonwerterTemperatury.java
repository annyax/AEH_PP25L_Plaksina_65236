package pl.pp;

import java.util.Scanner;

public class KonwerterTemperatury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj temperaturę w stopniach Fahrenheit (wpisz -1, aby zakończyć): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit == -1) {
                System.out.println("Zakończenie programu...");
                break;
            }

            double celsius = (fahrenheit - 32) / 1.8;
            double kelvin = celsius + 273.16;

            System.out.printf("Fahrenheit: %.2f°F, Celsjusz: %.2f°C, Kelwin: %.2fK%n", fahrenheit, celsius, kelvin);
        }

        scanner.close();
    }
}
