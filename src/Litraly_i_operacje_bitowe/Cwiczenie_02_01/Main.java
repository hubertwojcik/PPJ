package Litraly_i_operacje_bitowe.Cwiczenie_02_01;
//Dana jest wartość 165. Utwórz program wyświetlający na ekranie tę wartość z wykorzystaniem literału:
//binarnego (system dwójkowy),
//oktalnego (system ósemkowy),
//heksadecymalnego (system szesnastkowy).

public class Main {
    public static void main (String[] args){
        int binary=0b10100101;
        int oct=0245;
        int hex=0xA5;

        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + oct);
        System.out.println("Hexadecimal: " + hex);
    }
}
