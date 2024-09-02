package Polimorfizm.Cwiczenie_11_03;

public class Dog extends Animal{

    Dog(){
        super("Pies");
    }
    @Override
    public void makeSound(){
        super.makeSound();
        System.out.println("Hau Hau Hau");
    }
}
