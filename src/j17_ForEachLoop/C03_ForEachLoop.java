package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop {
    public static void main(String[] args) {


        //task-> iki string array elemanlarının ortak olmasını kontrol eden code create ediniz..with for-each

        String arr1[] = {"nazım", "gulsum", "dilek", "erol", "cuneyt", "çigdem"};
        String arr2[] = {"musty", "gulsum", "ayse", "enıse", "cuneyt", "çigdem"};

        for (String a : arr1) {
            for (String b : arr2) {
                if (a.equalsIgnoreCase(b)) {
                    System.out.println(a);
                }
            }
        }

        List<String> ortakIsim = new ArrayList<>();//ortak ısımlerin atanacagı boş list
        for (String str1 : arr1) {
            for (String str2 : arr2) {
                if (str2.equalsIgnoreCase(str1)) {//her bir çekirdek eşitliği kontrol
                    ortakIsim.add(str2);
                }
            }
        }
        if (ortakIsim.isEmpty()) {//ortak isim list boşluk kontrol
            System.out.println("ararylerinizde ortak isim yok " + ortakIsim);
        } else System.out.println(ortakIsim);





    }
}
