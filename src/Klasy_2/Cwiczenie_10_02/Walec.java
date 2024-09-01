package Klasy_2.Cwiczenie_10_02;

public class Walec {
    private double promien;
    private double wysokosc;
    final double PI=3.14;
    Walec(double promien,double wysokosc){
        this.promien=promien;
        this.wysokosc=wysokosc;
    }

    void show(){
        double podstawa = this.promien*this.promien*PI;
        System.out.println("Pole powierzchni podsatwy wynosi = "+podstawa);
        System.out.println("Objętość walca wynosi = "+podstawa*this.wysokosc);
    }
}
