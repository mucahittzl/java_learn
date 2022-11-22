package HalukHocaJava.j01_Variables.j36_Map;

import java.util.HashMap;

public class C06_putAll {
    public static void main(String[] args) {

        HashMap<String, String> hm = new HashMap<>();
        //map.putAll(map1);->Girilen map istenen map'e ekler

        hm.put("Amazon", "296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm = " + hm);

        HashMap<String, String> hm1 = new HashMap<>();


        hm1.put("Köfteci yusuf", "kaburga ızgara");
        hm1.put("starBucks","flat White");
        hm1.put("güllüoğlu", "cennet çamuru");
        hm1.put("nusret", "dana spagetti");
        hm1.put("clarusway", "bolcana offer");
        hm1.put("javacan", "javanaz");

        System.out.println("hm1 = " + hm1);
        hm.putAll(hm1);
        System.out.println("hm = " + hm);
        System.out.println("hm1 = " + hm1);

        //cincix code...
        HashMap<String, String> hm2 = new HashMap<>(hm1);//hm2 map hem tanımlandı men de entry olarak hm1 entry atandı
        System.out.println("hm2 = " + hm2);


    }
}
