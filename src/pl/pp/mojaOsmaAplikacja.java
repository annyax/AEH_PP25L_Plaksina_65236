package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person("Test", "Testowy", 25);
        person1.hiToAll();
        person1.growOld(10);
        person1.hiToAll();
        person1.setForename("ZmienionyTest");
        person1.hiToAll();
        String personName = person1.getForename();
        int personAge = person1.getAge();
        System.out.println("Imię: " + personName + ", wiek: " + personAge);

        Circle circle1 = new Circle(1.2);
        circle1.increaseRadius(1.4);
        circle1.getInfo();

        System.out.println("\nTestowanie klasy Konto:");
        konto account = new konto("9876543210", 2000.0, "Anna Nowak", "anna@example.com", "987654321");
        account.withdraw(500.0);
        account.deposit(300.0);
        account.withdraw(100.0);
        account.withdraw(600.0);
        account.deposit(200.0);
    }
}