
package pl.pp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mojaTrzynastaAplikacja {
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
            int liczbaSlow = 0;
            Map<String, Integer> czestoscSlow = new HashMap<>();

            // Czytanie pliku i liczenie słów
            try (BufferedReader reader = new BufferedReader(new FileReader(sciezkaWejsciowa))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.replaceAll("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ]", " ").toLowerCase().split("\\s+");
                    for (String word : words) {
                        if (!word.isBlank()) {
                            liczbaSlow++;
                            czestoscSlow.put(word, czestoscSlow.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Błąd podczas odczytu pliku wejściowego: " + e.getMessage());
                return;
            }

            System.out.println("Liczba słów w pliku " + sciezkaWejsciowa + ": " + liczbaSlow);
            System.out.println("Częstość wystąpień słów:");
            for (Map.Entry<String, Integer> wpis : czestoscSlow.entrySet()) {
                System.out.println(wpis.getKey() + ": " + wpis.getValue());
            }

            // Zapis do pliku wyjściowego
            try (FileWriter pisarz = new FileWriter(sciezkaWyjsciowa)) {
                pisarz.write("Nazwa pliku: " + sciezkaWejsciowa + "\n");
                pisarz.write("Liczba słów: " + liczbaSlow + "\n");
                pisarz.write("Częstość wystąpień słów:\n");
                for (Map.Entry<String, Integer> wpis : czestoscSlow.entrySet()) {
                    pisarz.write(wpis.getKey() + ": " + wpis.getValue() + "\n");
                }
            } catch (IOException e) {
                System.out.println("Błąd podczas zapisu do pliku wyjściowego: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Wystąpił nieoczekiwany błąd: " + e.getMessage());
        } finally {
            skaner.close();
        }
    }
}
