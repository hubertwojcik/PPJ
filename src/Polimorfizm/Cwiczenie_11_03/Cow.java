package Polimorfizm.Cwiczenie_11_03;

public class Cow extends Animal{
    Cow(){
        super("Krowa");
    }

    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("MUuuuuuuuuuuu");
    }
}
