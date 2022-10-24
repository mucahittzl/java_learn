package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */


    public static void main(String[] args) {

        List<String> renkler = new ArrayList<>(Arrays.asList("yellow", "red", "blue", "red", "blue"));
        String r1="blue";
        String r2="yellow";

        System.out.println(changeInArraylist(renkler, r1, r2));

    }

    private static List<String> changeInArraylist(List<String> renkler, String s1, String s2) {

        for (String s : renkler) {
            Collections.replaceAll(renkler,s1,s2);
        }

        return renkler;
    }




}
