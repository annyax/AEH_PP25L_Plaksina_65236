package pl.pp;

public class Osobowe extends Pojazd implements typPaliwa {
    private int liczbaDrzwi;
    private Paliwa typPaliwa;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, int liczbaDrzwi, Paliwa typPaliwa) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typPaliwa = typPaliwa;
    }

    @Override
    public String getPaliwa() {
        return typPaliwa.getPaliwa();
    }
}