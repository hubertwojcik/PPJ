package Klasy.Cwiczenia_09_05;


class Cplx{
    private double rzeczywista;
    private double urojona;

    Cplx(double rzeczywista,double urojona){
        this.rzeczywista=rzeczywista;
        this.urojona=urojona;
    }

    void add(Cplx liczba){
        this.rzeczywista+=liczba.rzeczywista;
        this.urojona-=liczba.urojona;
    }

    void show(){
        System.out.println(this.rzeczywista+" + "+this.urojona+"i");
    }
}
public class Main {
    public static void main(String[] args){
        Cplx liczba= new Cplx(4,5);
        Cplx liczba2=new Cplx(12,2.5);

        liczba.add(liczba2);
        liczba.show();
    }
}
