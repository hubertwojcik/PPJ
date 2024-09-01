package Klasy_2.Cwiczenie_10_05;

public class PojazdKolowy extends Pojazd{
    private int iloscOsi;

    PojazdKolowy(String color,int iloscOsi){
        super(color);
        this.iloscOsi=iloscOsi;
    }

    int getIloscOsi(){
        return this.iloscOsi;
    }
}
