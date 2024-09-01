package Klasy_2.Cwiczenie_10_03;

public class Prostokat {
    private double dlugosc;
    private double szerokosc;

    Prostokat(double dlugosc,double szerokosc){
        this.dlugosc=dlugosc;
        this.szerokosc=szerokosc;
    }

    void showPolePowierzhcni(){
        System.out.print("Pole powierzchni wynosi="+dlugosc*szerokosc);
    }

    double polePowierzchni(){
        return dlugosc*szerokosc;
    }
}
