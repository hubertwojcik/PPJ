package Klasy_2.Cwiczenie_10_03;

public class Prostopadloscian extends Prostokat{
    private double wysokosc;

    Prostopadloscian(double dlugosc,double szerokosc,double wysokosc){
        super(dlugosc,szerokosc);
        this.wysokosc=wysokosc;
    }

    void objectosc(){
        double obj=this.wysokosc*super.polePowierzchni();
        System.out.println("Objętosć wynosi = "+obj);
    }
}
