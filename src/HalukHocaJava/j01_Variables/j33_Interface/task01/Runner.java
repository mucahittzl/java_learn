package HalukHocaJava.j01_Variables.j33_Interface.task01;

public class Runner {
    public static void main(String[] args) {

    /*
    Kare, Dikdortken, ve cember sınıflarından oluşacak bir geometri programı yapılmak isteniyor.
    bunların ayrı ayrı , fakat ortak metodlarının (cevresi() ve alani() )zorunlu olabilmesi için
    gerekli yapıyı kurunuz ve print ediniz....
     */


    Cember c=new Cember();
        System.out.println("c.alan(4) = " + c.alan(4));
        System.out.println("c.cevre(4) = " + c.cevre(4));

        Dikdörtgen d=new Dikdörtgen();
        System.out.println("d.alan(4,5) = " + d.alan(4, 5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4, 5));
        System.out.println("d.cevre(24,38) = " + d.cevre(24, 38));

        Kare k=new Kare();
        System.out.println("k.alan(5) = " + k.alan(5));
        System.out.println("k.cevre(8) = " + k.cevre(8));

    }
}
