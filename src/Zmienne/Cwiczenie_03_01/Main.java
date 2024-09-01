package Zmienne.Cwiczenie_03_01;
//ZZadeklaruj zmienne wszystkich typów prostych, a następnie nadaj im kolejno
// najmniejszą i największą możliwą wartość. Wykorzystaj literały: logiczne, zapisane w systemie dziesiętnym,
//a tam gdzie to możliwe również w szesnastkowym, ósemkowym i binarnym.
public class Main {
    public static void main(String[] args){
        byte byteMin=(byte) 0b10000000;
        byte byteMax=(byte) 0b01111111;

        short shortMin=(short) 0b1000000000000000;
        short shortMax=(short) 0b0111111111111111;

        int intMin=0b10000000000000000000000000000000;
        int intMax=0b011111111111111111111111111111111;
    }
}
