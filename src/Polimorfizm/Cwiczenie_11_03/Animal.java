package Polimorfizm.Cwiczenie_11_03;

public class Animal {
    protected String species;

    public Animal(String species){
        this.species=species;
    }

    public void makeSound(){
        System.out.println("Unknown");
    }
}
