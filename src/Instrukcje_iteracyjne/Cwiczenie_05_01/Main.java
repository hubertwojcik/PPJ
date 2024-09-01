package Instrukcje_iteracyjne.Cwiczenie_05_01;

public class Main {
    public static void main(String[] args){
        boolean isTrue=checkNumber(145);
        System.out.println(isTrue);
    }
    public static boolean checkNumber(int number){
        int originalNumber=number;
        int sum=0;
        while(originalNumber!=0){
            int singleNumber=originalNumber%10;
            int silnia=1;
            for (int i=1;i<=singleNumber;i++){
                silnia*=i;
            }
            sum+=silnia;
            originalNumber=originalNumber/10;
        }
        return sum==number;
    }
}
