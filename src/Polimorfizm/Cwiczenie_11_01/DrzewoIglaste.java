package Polimorfizm.Cwiczenie_11_01;

public class DrzewoIglaste extends  Drzewo{
    private int iloscIgiel;
    private double dlugoscSzyszki;

    DrzewoIglaste(boolean wieczneZielone,int wysokosc,String przekrojDrzewa,int iloscIgiel,double dlugoscSzyszki){
        super(wieczneZielone,wysokosc,przekrojDrzewa);
        this.iloscIgiel=iloscIgiel;
        this.dlugoscSzyszki=dlugoscSzyszki;
    }

    public String toString(){
        return  super.toString()+" ilość igieł: "+this.iloscIgiel+" ,długość szyszki "+this.dlugoscSzyszki;

    }
}
