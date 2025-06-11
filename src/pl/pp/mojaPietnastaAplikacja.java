package pl.pp;

public class mojaPietnastaAplikacja {
    public static void main(String[] args) {
        ZarzadzanieZadaniami zarzadzanie = new ZarzadzanieZadaniami();

        ZadaniePracowe zadaniePracowe = new ZadaniePracowe("Raport", "Przygotuj raport miesięczny", Status.W_PROCESIE, Priorytet.SREDNI, "Projekt X", KategoriaZadaniaEnum.PRACA);
        ZadanieOsobiste zadanieOsobiste = new ZadanieOsobiste("Zakupy", "Kupić produkty na weekend", Status.ODLOZONE, Priorytet.NIZKI, "2025-06-15", KategoriaZadaniaEnum.OSOBISTE);
        ZadanieProjektowe zadanieProjektowe = new ZadanieProjektowe("Aplikacja", "Zbuduj system to-do", Status.W_PROCESIE, Priorytet.WYSOKI, 5, 10000, KategoriaZadaniaEnum.PROJEKT);

        zarzadzanie.dodajZadanie(zadaniePracowe);
        zarzadzanie.dodajZadanie(zadanieOsobiste);
        zarzadzanie.dodajZadanie(zadanieProjektowe);

        zarzadzanie.wyswietlZadania();

        zadaniePracowe.zacznij();
        zadanieOsobiste.zakoncz();
        zadanieProjektowe.zakoncz();

        zarzadzanie.wyswietlZadania();

        zarzadzanie.usunZadanie(zadanieOsobiste);
        zarzadzanie.wyswietlZadania();
    }
}