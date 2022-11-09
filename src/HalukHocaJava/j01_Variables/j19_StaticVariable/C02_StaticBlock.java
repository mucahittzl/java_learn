package HalukHocaJava.j01_Variables.j19_StaticVariable;

public class C02_StaticBlock {

    /*
        1.static block yapıları static variableleleri değer ataması için kulanılır
        2.static block class olsuturuldugunda bütün methodlardan(main method dahil)önce çalişir
        3.birden fazla static block varsa yukarıdan aşağıya sıralama ile çalışır
         */
    static String isim;
    static {
        System.out.println("ağam 1. static blok çalıştı :)");
        isim="Dilek Hanım";
        System.out.println("isim = " + isim);//

    }

    public static void main(String[] args) {

        System.out.println("main method başladı");
        isim="Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("main method bitti :(");


    }

    static {
        System.out.println("ağam 2. static blok çalıştı :)");
        isim = "Ugur Bey";
        System.out.println("isim = " + isim);//
    }

}
