package Klasy.Cwiczenie_09_01;

class MethodCurrier{
     void setValue(int value){
        System.out.println(value+" Value int");
    }
    void setValue(float value){
        System.out.println(value+" Value float");
    }
}
public class Main {
    public static void main(String[] args){
        MethodCurrier currier= new MethodCurrier();
        float fValue=1.4f;
        int iValue=2;
        currier.setValue(fValue);
        currier.setValue(iValue);
    }
}
