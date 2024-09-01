package Klasy_2.Cwiczenie_10_04;

public class Spawacz extends Osoba{
    int stazpracy;

    Spawacz(String imie,int staz){
        super(imie);
        this.stazpracy=staz;
    }

    String wyswietl(){
        return super.wyswietl()+ ", staż pracy: "+this.stazpracy+" lat";
    }
}
