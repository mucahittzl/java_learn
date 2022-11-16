package HalukHocaJava.j01_Variables.j32_Abstract.Ornek2;

public class Runner {
    public static void main(String[] args) {

        Dikdörtgen dd=new Dikdörtgen(24,7);
        dd.setName("Dikdörtgen");
     //  dd.cevreHesapla();
     //  dd.alanHesapla();
        System.out.println("dd.ciz() = " + dd.ciz());
        System.out.println(dd);

        Cember c1=new Cember(39);
        c1.setName("cemberimde gül oya");
        System.out.println(c1);
    }
}
