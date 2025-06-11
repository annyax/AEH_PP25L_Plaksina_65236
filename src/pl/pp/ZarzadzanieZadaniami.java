package pl.pp;

import java.util.ArrayList;
import java.util.List;

public class ZarzadzanieZadaniami {
    private List<Zadanie> listaZadan;

    public ZarzadzanieZadaniami() {
        this.listaZadan = new ArrayList<>();
    }

    public void dodajZadanie(Zadanie zadanie) {
        listaZadan.add(zadanie);
        System.out.println("Dodano zadanie: " + zadanie.nazwa);
    }

    public void usunZadanie(Zadanie zadanie) {
        if (listaZadan.remove(zadanie)) {
            System.out.println("Usunięto zadanie: " + zadanie.nazwa);
        } else {
            System.out.println("Zadanie " + zadanie.nazwa + " nie znaleziono.");
        }
    }

    public void wyswietlZadania() {
        System.out.println("Lista zadań:");
        for (Zadanie z : listaZadan) {
            System.out.println("Nazwa: " + z.nazwa + ", Status: " + z.getStatus().getNazwa() + ", Priorytet: " + z.getPriorytet().getNazwa());
        }
    }
}
