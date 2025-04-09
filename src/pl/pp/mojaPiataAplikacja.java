package pl.pp;
public class mojaPiataAplikacja {

    public static void main(String[] args) {
        rysujZnak('*', 5, 3);
    }

    public static void rysujZnak(char znak, int szerokosc, int wysokosc) {
        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}