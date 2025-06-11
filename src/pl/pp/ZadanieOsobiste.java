package pl.pp;

public class ZadanieOsobiste extends Zadanie implements KategoriaZadania {
    private String termin;
    private KategoriaZadaniaEnum kategoriaZadania;

    public ZadanieOsobiste(String nazwa, String opis, Status status, Priorytet priorytet, String termin, KategoriaZadaniaEnum kategoriaZadania) {
        super(nazwa, opis, status, priorytet);
        this.termin = termin;
        this.kategoriaZadania = kategoriaZadania;
    }

    @Override
    public String getKategoria() {
        return kategoriaZadania.getKategoria();
    }

    public String getTermin() {
        return termin;
    }
}