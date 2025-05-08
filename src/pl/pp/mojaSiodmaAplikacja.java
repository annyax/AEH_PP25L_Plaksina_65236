package pl.pp;
public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person("Mateusz", "Karmazyn", 24, "Warszawa", 2000);
        person1.hiToAll();
        Person person2 = new Person("Dariusz", "Walendziak", 42);
        person2.hiToAll();

        person1.growOld(10);
        person1.hiToAll();

        person2.growOld(3);
        person2.hiToAll();

        person1.beYounger();
        person1.hiToAll();
    }
}