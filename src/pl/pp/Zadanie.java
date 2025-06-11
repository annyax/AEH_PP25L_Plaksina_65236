package pl.pp;

public abstract class Zadanie {
    protected String nazwa;
    protected String opis;
    protected Status status;
    protected Priorytet priorytet;

    public Zadanie(String nazwa, String opis, Status status, Priorytet priorytet) {
        this.nazwa = nazwa;
        this.opis = opis;
        this.status = status;
        this.priorytet = priorytet;
    }

    public void zacznij() {
        if (status != Status.ZAKONCZONE) {
            status = Status.W_PROCESIE;
            System.out.println("Zadanie " + nazwa + " rozpoczęte.");
        } else {
            System.out.println("Zadanie " + nazwa + " jest już zakończone.");
        }
    }

    public void zakoncz() {
        if (status != Status.ZAKONCZONE) {
            status = Status.ZAKONCZONE;
            System.out.println("Zadanie " + nazwa + " zakończone.");
        } else {
            System.out.println("Zadanie " + nazwa + " już zakończone.");
        }
    }

    public Status getStatus() {
        return status;
    }

    public Priorytet getPriorytet() {
        return priorytet;
    }
}