package Polimorfizm.Cwiczenie_11_02;
import java.util.*;
public class Drzewo {
    Owoc zerwijOwoc(){
        int wybor=new Random().nextInt(3);
        switch (wybor){
            case 0:
                return new Jablko();
            case 1:
                return new Gruszka();
            case 2:
                return new Pomarancza();
            default:
                return null;
        }
    }
}
