package Polimorfizm.Cwiczenie_11_01;

public class Main {
    public static void main(String[] args){
        Drzewo drzewo = new Drzewo(false, 10, "okrągły");
        DrzewoIglaste drzewoIglaste = new DrzewoIglaste(true, 20, "stożkowy", 2000, 5.5);
        DrzewoLisciaste drzewoLisciaste = new DrzewoLisciaste(false, 15, "eliptyczny", 2);
        DrzewoOwocowe drzewoOwocowe = new DrzewoOwocowe(false, 12, "okrągły", 3, "jabłko");

        Drzewo[] las = {drzewo, drzewoIglaste, drzewoLisciaste, drzewoOwocowe};

        for (Drzewo d : las) {
            System.out.println(d);
        }
    }
}
