package pl.pp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String sciezkaWejsciowa = "";
        String sciezkaWyjsciowa = "";
        boolean poprawnyPlikWejsciowy = false;

        while (!poprawnyPlikWejsciowy) {
            System.out.println("Podaj ścieżkę do pliku wejściowego:");
            sciezkaWejsciowa = skaner.nextLine();
            if (Files.exists(Paths.get(sciezkaWejsciowa))) {
                poprawnyPlikWejsciowy = true;
            } else {
                System.out.println("Plik wejściowy nie istnieje. Podaj inną ścieżkę.");
            }
        }

        System.out.println("Podaj ścieżkę do pliku wyjściowego:");
        sciezkaWyjsciowa = skaner.nextLine();

        try {
            int liczbaLinii = 0;
            try (BufferedReader czytelnik = new BufferedReader(new FileReader(sciezkaWejsciowa))) {
                while (czytelnik.readLine() != null) {
                    liczbaLinii++;
                }
            } catch (IOException e) {
                System.out.println("Błąd podczas odczytu pliku wejściowego: " + e.getMessage());
                return;
            }

            System.out.println("Liczba linii w pliku " + sciezkaWejsciowa + ": " + liczbaLinii);

            try (FileWriter pisarz = new FileWriter(sciezkaWyjsciowa)) {
                pisarz.write("Nazwa pliku: " + sciezkaWejsciowa + "\n");
                pisarz.write("Liczba linii: " + liczbaLinii + "\n");
            } catch (IOException e) {
                System.out.println("Błąd podczas zapisu do pliku wyjściowego: " + e.getMessage());
                return;
            }

        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            skaner.close();
        }
    }
}
