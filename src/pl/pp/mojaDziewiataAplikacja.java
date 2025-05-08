package pl.pp;

public class mojaDziewiataAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person("Pola", "Ufan", 25);
        person1.hiToAll();
        person1.growOld(10);
        person1.hiToAll();
        person1.setForename("Lasaka");
        person1.hiToAll();
        String personName = person1.getForename();
        int personAge = person1.getAge();
        System.out.println("Pobrane imię to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2);
        circle1.getInfo();
        circle1.setRadius(2.6);
        circle1.getInfo();

        System.out.println("\n=== Test Magazyn ===");
        Magazyn magazyn = new Magazyn(1, 5000.0, "Jan Kowalski", "jan@magazyn.pl", "+48 987 654 321");
        magazyn.dodajTowar(3000);
        magazyn.usunTowar(1000);
        magazyn.dodajTowar(2500);
        magazyn.sprawdzZajetosc();
        magazyn.aktualizujKontakt("owner@magazyn.pl", "+48 123 456 789");
        magazyn.dodajTowar(1000);
    }
}