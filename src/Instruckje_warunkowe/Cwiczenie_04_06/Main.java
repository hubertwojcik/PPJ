package Instruckje_warunkowe.Cwiczenie_04_06;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        int day=scanner.nextInt();

        switch (month){
            case 1: case 2: case 3:
                System.out.println((day>21 && month==3) ? "Wiosna" :"Zimna");
                break;
            case 4: case 5: case 6:
                System.out.println((day>20 && month==6) ? "Lato":"Wiosna");
                break;
            case 7: case 8: case 9:
                System.out.println((day>23 && month==9) ? "Jesień":"Zima");
            case 10: case 11: case 12:
                System.out.println((day>22 && month==12) ? "Zima":"Jesień");

                break;
        }
    }
}
