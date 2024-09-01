package Litraly_i_operacje_bitowe.Cwiczenie_02_03;
//Utwórz program, który zdefiniuje literał opisujący liczbę całkowitą. Następnie program wyświetli na ekranie:
//wartość reprezentowaną przez ostatnie 5 bitów tego literału;
//1 lub 0 zależnie od wartości siódmego bitu tego literału;
//wartość poszczególnych bajtów (począwszy od najbardziej znaczącego) z których składa się ta liczba - wynikiem powinny być 4 liczby z przedziału [0 − 255]
//wartość reprezentowaną przez dwa środkowe bajty literału reprezentowane jako liczba z przedziału
public class Main {
    public static void main(String[] args){
        int literal=198;
        int lastFiveBits=literal&0b11111;
        System.out.println("Ostatnie 5 bitów = "+lastFiveBits);
        int la=(literal>>6)&0b0001;
        System.out.println("Siodmy bit to ="+la);
        int firstByte=(literal>>24) & 0xFF;
        System.out.println("Pierwszy bajt = " + firstByte);
        int secondByte=(literal>>16) & 0xFF;
        System.out.println("Drugi bajt = " + secondByte);
        int thirdByte=(literal>>8) & 0xFF;
        System.out.println("Trzeci bajt = " + thirdByte);
        int fourthByte=literal & 0xFF;
        System.out.println("Czwarty bajt = " + fourthByte);
        int twoMidldeBaits = (literal>>8) & 0xFFFF;
        System.out.println("Dwa środkowe bajty = "+twoMidldeBaits);
    }
}
