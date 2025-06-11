package pl.pp;

public class ZadanieProjektowe extends Zadanie implements KategoriaZadania {
    private int czlonkowieZespolu;
    private double budzet;
    private KategoriaZadaniaEnum kategoriaZadania;

    public ZadanieProjektowe(String nazwa, String opis, Status status, Priorytet priorytet, int czlonkowieZespolu, double budzet, KategoriaZadaniaEnum kategoriaZadania) {
        super(nazwa, opis, status, priorytet);
        this.czlonkowieZespolu = czlonkowieZespolu;
        this.budzet = budzet;
        this.kategoriaZadania = kategoriaZadania;
    }

    @Override
    public String getKategoria() {
        return kategoriaZadania.getKategoria();
    }

    public int getCzlonkowieZespolu() {
        return czlonkowieZespolu;
    }

    public double getBudzet() {
        return budzet;
    }
}
