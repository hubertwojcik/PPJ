package Tablice.Cwiczenie_06_08;
import java.util.*;
public class Main {
    public static void main(String[] args){
        char A='A';
        char Z='Z';
        char[] array=new char[26];
        for(int i=0;i<array.length;i++){
            int randomValue=(int)(Math.random()*25);
            int numValue = ((int) A) + randomValue;
            array[i]=((char) numValue);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        char[] result=new char[26];
        for(int i=0;i<result.length;i++){
            result[i]=array[array.length-1-i];
            System.out.print(result[i]+" ");

        }
    }
}
