package Instrukcje_iteracyjne.Cwiczenia_05_08;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num=0;
        while(true){
            char c=scanner.next().charAt(0);

            System.out.println(c);
            if(c=='A'){
                num--;
            }else if(c=='D'){
                num++;
            }
            switch (num%4){
                case 0:
                    System.out.println("North");
                    break;
                case -1:case 3:
                    System.out.println("East");
                    break;
                case 2: case-2:
                    System.out.println("South");
                    break;
                case 1: case -3:
                    System.out.println("West");
                    break;

            }
        }
    }
}
