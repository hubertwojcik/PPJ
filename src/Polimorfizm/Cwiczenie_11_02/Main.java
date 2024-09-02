package Polimorfizm.Cwiczenie_11_02;



public class Main {
    public static void main(String[] args){
        Drzewo drzewoOwocowe = new Drzewo();
        double masa=0;
        Owoc[] owoce=new Owoc[100];

        int liczbaJablek=0;
        int liczbaGruszek=0;
        int liczbaPomaranczy=0;

        for (int i=0;i<owoce.length;i++){
            if(masa>5000)
                break;
            Owoc owoc=drzewoOwocowe.zerwijOwoc();
            owoce[i]=owoc;
            masa+=owoc.getMasa();
            String nazwaOwocy=owoc.getNazwa();
            switch (nazwaOwocy){
                case "Jablko":
                    liczbaJablek++;
                    break;
                case "Pomarancza":
                    liczbaPomaranczy++;
                    break;
                case "Gruszka":
                    liczbaGruszek++;
                    break;
            }
        }
        int liczbaOwocow= liczbaGruszek+liczbaJablek+liczbaPomaranczy;
        System.out.println("Zebrano " + +liczbaOwocow +" owoców o łącznej masie: " + masa + "g.");
        System.out.println("Liczba jablek: " + liczbaJablek);
        System.out.println("Liczba pomaranczy: " + liczbaPomaranczy);
        System.out.println("Liczba gruszek: " + liczbaGruszek);

    }
}
