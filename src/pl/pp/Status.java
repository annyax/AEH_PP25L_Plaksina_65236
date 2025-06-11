package pl.pp;

public enum Status {
    W_PROCESIE("W procesie"),
    ZAKONCZONE("Zakończone"),
    ODLOZONE("Odłożone");

    private final String nazwa;

    Status(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }
}
