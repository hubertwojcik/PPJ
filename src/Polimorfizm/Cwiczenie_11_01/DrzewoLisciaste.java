package Polimorfizm.Cwiczenie_11_01;

public class DrzewoLisciaste extends Drzewo{
    private int ksztaltLiscia;

    DrzewoLisciaste(boolean wieczneZielone,int wysokosc,String przekrojDrzewa,int ksztaltLiscia){
        super(wieczneZielone,wysokosc,przekrojDrzewa);
        this.ksztaltLiscia=ksztaltLiscia;
    }

    public String toString(){
        return super.toString()+" ,kształt liścia: "+this.ksztaltLiscia;
    }
}
