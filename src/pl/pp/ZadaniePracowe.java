package pl.pp;

public class ZadaniePracowe extends Zadanie implements KategoriaZadania {
    private String projekt;
    private KategoriaZadaniaEnum kategoriaZadania;

    public ZadaniePracowe(String nazwa, String opis, Status status, Priorytet priorytet, String projekt, KategoriaZadaniaEnum kategoriaZadania) {
        super(nazwa, opis, status, priorytet);
        this.projekt = projekt;
        this.kategoriaZadania = kategoriaZadania;
    }

    @Override
    public String getKategoria() {
        return kategoriaZadania.getKategoria();
    }

    public String getProjekt() {
        return projekt;
    }
}
