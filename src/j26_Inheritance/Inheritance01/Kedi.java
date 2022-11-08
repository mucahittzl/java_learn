package j26_Inheritance.Inheritance01;

public class Kedi extends Mammal{//Mammal parent class child-torun

    /*
    Child class obj olmadan parent class variable ve methodlara ulaşabilir
     */

    public Kedi() {

        System.out.println("Agam ahan da kedi p'siz cons...");

    }

    public void cırmala(){
        System.out.println("kedi fena cırmalar miyavlar");
    }

}
