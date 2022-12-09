package HalukHocaJava.j01_Variables.j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {

        /*
        HashTable->
        HashMap'de kullanılan tüm methodlar HashTable objesi ile de call edilir.
        1- HashMap ve TreeMap thread-safe ve synchronized olmadığı için map'ler arasında TreeMap thread-safe ve synchronized
        olan bir mapê ihtiyaç oldugundan HashTable tanımlanmıştır.
        2- HashTable hashMap'e göre daha yavaştır.
        3- HashTable key ve value'lerde null değere izin vermez.
        4-HashTable eleman ataması yapılırken HashMap gibi random(rastgele) yapar.
         */

        Hashtable<String,String>ht=new Hashtable<>();

        ht.put("kebab","adana");
        ht.put("döner","sivas");
        ht.put("köfte","tekirdağ");
        ht.put("çorba","beyran");
        ht.put("söğüş","");
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebab=adana}
        ht.put("döner","dönerse senindir :)");//döner key update edilir key'de duplicate değil üzerine value ataması yapılır.
        System.out.println("ht = " + ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir :), kebab=adana}
        //ht.put(null,"trileçe");//RTE->NullPointerException
        //ht.put("kahve",null);//RTE->NullPointerException
        System.out.println("agam selametle dewamkee");

        Hashtable<String,String>ht1=new Hashtable<>();

        ht1.put("salata","patlıcan Közleme");
        ht1.put("ara sıcak","içli köfte");
        System.out.println("ht1 = " + ht1);
        ht.putAll(ht1);


        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);

        

    }
}
