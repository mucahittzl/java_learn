package HalukHocaJava.j01_Variables.j36_Map;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;

public class C01_HashMap {
    public static void main(String[] args) {

        /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

        1) HashMap: HasMap key-value yapisini kullanir. Key ve value
            programci tarafindan yazilir.Key değeri benzersiz(unıque) olmalı dublicate kabul etmez
            Key ve value'da null degeri kullanilabilir. Key'de
            1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri
            kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de
            value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler ekrana yazdirirken rastgele siralama yapar
            HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
         */

        HashMap<String,String>hm=new HashMap<>();
        //map.put(); -> girilen key, value datayı map'a eleman olarak ekler
        hm.put("Amazon","296 Euro");
        hm.put(null,"296 Euro");  // key null değer kabul eder.
        hm.put(null,"296 Euro");  // tekrarlı unıque değerine value update edilir.Aynı key kullanılırsa üzrine atama yapılır
        hm.put("Ebay",null);      // value değeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("Apple store","500 Euro");// Apple store key'deki value 333 euro iken 500 olarak update edildi
        hm.put("MediaMarkt","183 Euro");
        //map sout komutuna parametre olarak print edilir..
        System.out.println("hm = " + hm);//{null=296 Euro, Saturn=300 Euro, Ebay=null, Apple store=500 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}




    }
}
