package Klasy.Cwiczenie_09_02;

class MethodCurrier{
    void setValue(int value){
        System.out.println(value+" Value int");
    }
    void setValue(float value){
        System.out.println(value+" Value float");
    }

    void setValue(Number value){
        System.out.println("Dostarczona wartość to "+value.num);
        value.setValue(value.num+12);
        value.showValue();
    }
}

class Number{
    int num;

    void setValue(int val){
        this.num=val;
    }
    void showValue(){
        System.out.println("Warotść pola Number = "+this.num);
    }
}
public class Main {
    public static void main(String[] args){
        Number number= new Number();
        MethodCurrier currier= new MethodCurrier();
        float fValue=1.4f;
        int iValue=2;
        currier.setValue(fValue);
        currier.setValue(iValue);
        currier.setValue(number);
    }
}
