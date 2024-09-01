package Litraly_i_operacje_bitowe.Cwiczenie_02_02;

//Przedstaw program, który dokona przesunięcia bitowego wartości 14:
//o zero pozycji w prawo,
//rezultat poprzedniego punktu o dwie pozycje w lewo,
//rezultat poprzedniego punktu o 4 pozycje w prawo.
public class Main {
    public static void main(String[] args){
        int value=14;
        value>>=0;
        System.out.println("Zero pozycji w lewo = "+value);
        value<<=2;
        System.out.println("Dwoie pozycji w lewo = "+value);
        value>>=4;
        System.out.println("Cztery pozycje w prawo = "+value);
    }
}
