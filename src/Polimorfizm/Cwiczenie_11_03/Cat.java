package Polimorfizm.Cwiczenie_11_03;

public class Cat extends Animal{
    Cat(){
        super("Kot");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Miau Miau Miau");
    }
}
