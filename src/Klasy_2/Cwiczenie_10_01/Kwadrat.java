package Klasy_2.Cwiczenie_10_01;

public class Kwadrat {
    private double bok;
    Kwadrat(double bok){
        this.bok=bok;
    }

    void show(){
        System.out.println("Pole powierzchni kwadratu wynosi = "+this.bok*this.bok);
        System.out.println("Objętość sześcianu wynosi = "+this.bok*this.bok*this.bok);
    }
}
