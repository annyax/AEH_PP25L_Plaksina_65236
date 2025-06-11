package pl.pp;

public enum KategoriaZadaniaEnum implements KategoriaZadania {
    PRACA("Praca"),
    OSOBISTE("Osobiste"),
    PROJEKT("Projekt");

    private final String nazwa;

    KategoriaZadaniaEnum(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String getKategoria() {
        return nazwa;
    }
}
