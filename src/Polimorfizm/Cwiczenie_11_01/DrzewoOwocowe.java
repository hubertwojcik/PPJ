package Polimorfizm.Cwiczenie_11_01;

public class DrzewoOwocowe extends DrzewoLisciaste{
    private String nazwaOwoca;
    DrzewoOwocowe(boolean wieczneZielone,int wysokosc,String przekrojDrzewa,int ksztaltLiscia,String nazwaOwoca){
        super(wieczneZielone,wysokosc,przekrojDrzewa,ksztaltLiscia);
        this.nazwaOwoca=nazwaOwoca;
    }

    public String toString(){
        return super.toString()+" nazwa owoca: "+this.nazwaOwoca;
    }
}
