package pl.pp;
import java.util.Scanner;
public class zad22obliczenieWiekuwSekundy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swój wiek w latach:");

        int wiek = scanner.nextInt();

        long wiekWSekundach = (long) wiek * 365 * 24 * 60 * 60;

        System.out.println("Twój wiek w sekundach to: " + wiekWSekundach);

        scanner.close();
    }
}
