package pl.pp;

public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz() {
        System.out.println("Pojazd " + nrRejestracyjny + " jedzie.");
        przebieg += 10;
        poziomPaliwa -= 5;
        if (poziomPaliwa < 0) poziomPaliwa = 0;
    }

    public void zatankuj(double ilosc) {
        poziomPaliwa += ilosc;
        System.out.println("Zatankowano " + ilosc + " litrów. Poziom: " + poziomPaliwa);
    }

    public double getPoziomPaliwa() {
        return poziomPaliwa;
    }

    public double getPrzebieg() {
        return przebieg;
    }
}