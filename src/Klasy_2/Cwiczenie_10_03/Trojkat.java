package Klasy_2.Cwiczenie_10_03;

public class Trojkat {
        private double bok;

        Trojkat(double bok){
            this.bok=bok;
        }

        double polePowierzchni(){
            return (Math.sqrt(3)/4)*bok*bok;
        }

        double getBok(){
            return  this.bok;
        }

     void wyswietlPole() {
        System.out.println("Pole powierzchni trójkąta: " + polePowierzchni());
    }
}
