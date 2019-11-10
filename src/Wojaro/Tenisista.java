package Wojaro;


public class Tenisista implements Comparable<Tenisista> {

    private int pozycja;
    private String kraj;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int pkt;
    private int matches;


    public Tenisista(int pozycja, String kraj, String imie, String nazwisko, int wiek, int pkt, int matches) {
        this.pozycja = pozycja;
        this.kraj = kraj;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pkt = pkt;
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Tenisista{" +
                "pozycja=" + pozycja +
                ", kraj='" + kraj + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", pkt=" + pkt +
                ", matches=" + matches +
                '}';
    }

    public void setPozycja(int pozycja) {
        this.pozycja = pozycja;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setPkt(int pkt) {
        this.pkt = pkt;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getPozycja() {
        return pozycja;
    }

    public String getKraj() {
        return kraj;
    }


    public int getWiek() {
        return wiek;
    }

    public int getPkt() {
        return pkt;
    }

    public int getMatches() {
        return matches;
    }

    @Override
    public int compareTo(Tenisista o) {

        return Double.compare(wiek, o.wiek);
    }
}
