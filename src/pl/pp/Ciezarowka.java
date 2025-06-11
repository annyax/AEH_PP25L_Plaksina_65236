package pl.pp;

public class Ciezarowka extends Pojazd implements typPaliwa {
    private double ladownosc;
    private Paliwa typPaliwa;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double ladownosc, Paliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getPaliwa() {
        return typPaliwa.getPaliwa();
    }
}