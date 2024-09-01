package Klasy_2.Cwiczenie_10_05;

public class CiagnikSiodlowy extends PojazdKolowy{
    private int masa;

    CiagnikSiodlowy(String color,int iloscOsi,int masa){
        super(color,iloscOsi);
        this.masa=masa;
    }

    void rozpocznijJazde(){
        if(masa/super.getIloscOsi()>11000){
            System.out.println("Jazda niebezpieczna, odmowa uruchomienia silnika!");

        }else{
            System.out.println("Jazda jazda jazda");
        }

    }

}
