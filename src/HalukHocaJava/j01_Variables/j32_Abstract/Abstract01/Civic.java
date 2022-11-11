package HalukHocaJava.j01_Variables.j32_Abstract.Abstract01;

public class Civic extends Lastik{//Honda parent abstract Class extend child concrete class
    /*
    extends Honda yazılarak Honda Class'a concrete bir Civik class tanımlandı
    java CTE verdi.Çözüm olarak;
    a- Unımplemented(uyarlanmamış) method ımplement edilmeli
    b- Parent Honda class'dan abstract keyword kaldırılmalı
    c- Concrete olan chıld Civic class abstract yapılmalı
     */

    //concrete class'da abstract method tanımlanır mı?
    // public abstract void absMethod(); ya class abstract olmalı ya da method concrete body olmalı..
    //TRİCK-> Child concrete class parent abstract class'ın abstract methodlarını mutlaka implement(override) etmeli.
    @Override



    public void motor() {
        System.out.println("1.6 eco motor az yakar çok kaçar ");
    }

    @Override
    void koltuk() {
        System.out.println("Agam ucuz olsun diye kumaş koltuk temiz tut");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");
    }
    public int vites(){//concrete child method
        return 5;
    }

    @Override
    public void lastikEbat() {
        System.out.println("21 inç lastik");
    }
   //Civic obj1=new Civic();//civic oğlu civic
   //Honda obj=new Civic();//honda oğlu civic
}
