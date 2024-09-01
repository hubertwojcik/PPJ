package Instrukcje_iteracyjne.Cwiczenie_05_02;

public class Main {
    public static void main(String[] args){
        int s=0;
        int step=1;
        while(step<10){
            s=s+1;
            step++;
        }
        int k=0;
        for(int i=1;i<10;i++){
            k=k+1;
        }
        System.out.println(s);
        System.out.println(k);
    }
}
