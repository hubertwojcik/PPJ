package Polimorfizm.Cwiczenie_11_01;

public class Drzewo {
    private boolean wieczneZielone;
    private int wysokosc;
    private String przekrojDrzewa;

    Drzewo(boolean wieczneZielone,int wysokosc,String przekrojDrzewa){
        this.wieczneZielone=wieczneZielone;
        this.wysokosc=wysokosc;
        this.przekrojDrzewa=przekrojDrzewa;
    }

    public String toString(){
        return "Wiecznie zielone: "+this.wieczneZielone+" ,wysokosc: "+this.wysokosc+" ,przekrój drzewa: "+this.przekrojDrzewa;
    }

    void show(){
        System.out.println(super.toString());
    }
}
