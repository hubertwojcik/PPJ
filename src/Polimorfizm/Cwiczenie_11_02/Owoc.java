package Polimorfizm.Cwiczenie_11_02;

public class Owoc {
    private String nazwa;
    private double masa;

    Owoc(String nazwa,double masa){
        this.nazwa=nazwa;
        this.masa=masa;
    };

    public String getNazwa() {
        return nazwa;
    }

    public double getMasa() {
        return masa;
    }
}
