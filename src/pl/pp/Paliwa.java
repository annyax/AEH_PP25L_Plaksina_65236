package pl.pp;

public enum Paliwa implements typPaliwa {
    DIESEL("Diesel"),
    BENZYNA("Benzyna"),
    ELEKTRYK("Elektryczny");

    private final String nazwa;

    Paliwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String getPaliwa() {
        return nazwa;
    }
}
