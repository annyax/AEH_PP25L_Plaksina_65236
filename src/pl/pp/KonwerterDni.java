package pl.pp;
import java.util.Scanner;
public class KonwerterDni {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj liczbę dni (wpisz liczbę ≤ 0, aby zakończyć): ");
            int dni = scanner.nextInt();

            if (dni <= 0) {
                System.out.println("Zakończenie programu...");
                break;
            }

            int tygodnie = dni / 7;
            int pozostaleDni = dni % 7;

            System.out.println(dni + " dni to " + tygodnie + " tygodnie i " + pozostaleDni + " dni.");
        }

        scanner.close();
    }

}
