package Wyjątki.Cwiczenia_12_01;

public class Rakieta
{
    String nazwa;
    int wagaPaliwa;

    Rakieta(String nazwa,int wagaPaliwa){
        this.nazwa=nazwa;
        this.wagaPaliwa=wagaPaliwa;
    }

    void start() throws Exception{
        if(wagaPaliwa<10000){
            throw new Exception("Start anulowany");
        }
        System.out.println("START");

    }
    void zatankuj(){
        this.wagaPaliwa=700*(int)(Math.random()*800);
    }
}
