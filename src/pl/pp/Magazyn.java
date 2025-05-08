package pl.pp;

public class Magazyn {
    private int warehouseNumber;
    private double availableSpace;
    private double occupiedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    public Magazyn() {
        this.warehouseNumber = 0;
        this.availableSpace = 5000.0;
        this.occupiedSpace = 0.0;
        this.ownerName = "Default Owner";
        this.ownerEmail = "default@magazyn.pl";
        this.ownerPhone = "+48 000 000 000";
    }

    public Magazyn(int warehouseNumber, double availableSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.occupiedSpace = 0.0;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
    }

    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public double getAvailableSpace() {
        return availableSpace - occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public void setAvailableSpace(double availableSpace) {
        this.availableSpace = availableSpace;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public void dodajTowar(double units) {
        if (units <= 0) {
            System.out.println("Ilość towaru musi być większa od zera.");
            return;
        }
        if (units > (availableSpace - occupiedSpace)) {
            System.out.println("Za mało miejsca w magazynie. Pozostała przestrzeń magazynowa: " + (availableSpace - occupiedSpace) + " jednostek.");
        } else {
            occupiedSpace += units;
            System.out.println("Dodano " + units + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (availableSpace - occupiedSpace) + " jednostek.");
        }
    }

    public void usunTowar(double units) {
        if (units <= 0) {
            System.out.println("Ilość towaru do usunięcia musi być większa od zera.");
            return;
        }
        if (units > occupiedSpace) {
            System.out.println("Nie można usunąć więcej towaru, niż jest w magazynie. Dostępna ilość towaru: " + occupiedSpace + " jednostek.");
        } else {
            occupiedSpace -= units;
            System.out.println("Usunięto " + units + " jednostek towaru. Pozostała przestrzeń magazynowa: " + (availableSpace - occupiedSpace) + " jednostek.");
        }
    }

    public void sprawdzZajetosc() {
        System.out.println("Zajęta przestrzeń magazynowa: " + occupiedSpace + " jednostek.");
        System.out.println("Dostępna przestrzeń magazynowa: " + (availableSpace - occupiedSpace) + " jednostek.");
    }

    public void aktualizujKontakt(String newEmail, String newPhone) {
        this.ownerEmail = newEmail;
        this.ownerPhone = newPhone;
        System.out.println("Zaktualizowano dane kontaktowe właściciela.");
        System.out.println("Nowy email: " + ownerEmail);
        System.out.println("Nowy numer telefonu: " + ownerPhone);
    }
}