package pl.pp;

import java.util.Scanner;

public class mojaSzostaAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą N (0 ≤ N ≤ 20): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Niepoprawna wartość. Wprowadź liczbę z przedziału 0–20 (long może ulec przepełnieniu powyżej 20!).");
            return;
        }

        long startIterative = System.nanoTime();
        long wynikIteracyjny = obliczSilnieIteracyjnie(n);
        long endIterative = System.nanoTime();

        long startRekurencyjnie = System.nanoTime();
        long wynikRekurencyjny = obliczSilnieRekurencyjnie(n);
        long endRekurencyjnie = System.nanoTime();

        System.out.println("\n== WYNIKI ==");
        System.out.println("Silnia (iteracyjnie) z " + n + " = " + wynikIteracyjny);
        System.out.println("Czas wykonania (iteracyjnie): " + (endIterative - startIterative) + " ns");

        System.out.println("Silnia (rekurencyjnie) z " + n + " = " + wynikRekurencyjny);
        System.out.println("Czas wykonania (rekurencyjnie): " + (endRekurencyjnie - startRekurencyjnie) + " ns");
    }

    public static long obliczSilnieIteracyjnie(int n) {
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static long obliczSilnieRekurencyjnie(int n) {
        if (n <= 1)
            return 1;
        return n * obliczSilnieRekurencyjnie(n - 1);
    }
}
