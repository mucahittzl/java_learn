package HalukHocaJava.j01_Variables.j36_Map.TASKS;

import java.util.HashMap;
import java.util.Map;

public class Task02 {

      /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */

    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        map.put("isim","pakize");
        map.put("email","pkz@gmail");
        map.put("adres","Edirne");
        map.put("tel","1907");

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("isim","kezban");
        map2.put("email","kzbn@gmail");
        map2.put("adres","Edirne");
        map2.put("tel","1907-1907");

        HashMap<String,HashMap<String,String>>kartvizit=new HashMap<>();
        kartvizit.put("pakize",map);
        kartvizit.put("kezban",map2);
        System.out.println("kartvizit = " + kartvizit);

        // 2. YOL

        Map<Integer,Kartvizit>krt=new HashMap<>();
        Kartvizit k1=new Kartvizit("enise","neise@tester.com","google company","1907");
         krt.put(k1.id, k1);
        System.out.println("krt = " + krt);
        System.out.println("krt.get(k1.id) = " + krt.get(k1.id));//k1.id key values:{isim='enise', email='neise@tester.com', adres='google company', tel='1907'
        System.out.println("krt.get(101) = " + krt.get(101));//1001 key valuues:{isim='enise', email='neise@tester.com', adres='google company', tel='1907'


    }
}