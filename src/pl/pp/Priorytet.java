package pl.pp;

public enum Priorytet {
    NIZKI("Niski"),
    SREDNI("Średni"),
    WYSOKI("Wysoki");

    private final String nazwa;

    Priorytet(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
