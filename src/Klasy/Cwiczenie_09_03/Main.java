package Klasy.Cwiczenie_09_03;


class Osoba {
    String imie;
    String nazwisko;
    int rokUrodzenia;

    Osoba(String imie,String nazwisko, int rok){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rok;
    }

    void show(){
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.rokUrodzenia);
    }
}
public class Main {
    public static void main(String[] args){
        Osoba osoba= new Osoba("Hubert","Wojcik",1996);
        osoba.show();


    }
}
