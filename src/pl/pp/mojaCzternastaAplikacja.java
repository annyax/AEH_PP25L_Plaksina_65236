package pl.pp;

public class mojaCzternastaAplikacja {
    public static void main(String[] args) {
        Osobowe osobowe = new Osobowe("ABC123", "VIN123", "Czerwony", 50000, 6.5, 50, 10000, 4, Paliwa.BENZYNA);
        Ciezarowka ciezarowka = new Ciezarowka("XYZ789", "VIN456", "Niebieski", 120000, 12.0, 100, 50000, 5000, Paliwa.DIESEL);

        System.out.println("--- Osobowe ---");
        System.out.println("Typ paliwa: " + osobowe.getPaliwa());
        osobowe.prowadz();
        System.out.println("Przebieg: " + osobowe.getPrzebieg() + ", Poziom paliwa: " + osobowe.getPoziomPaliwa());
        osobowe.zatankuj(20);

        System.out.println("\n--- Ciezarowka ---");
        System.out.println("Typ paliwa: " + ciezarowka.getPaliwa());
        ciezarowka.prowadz();
        System.out.println("Przebieg: " + ciezarowka.getPrzebieg() + ", Poziom paliwa: " + ciezarowka.getPoziomPaliwa());
        ciezarowka.zatankuj(50);
    }
}