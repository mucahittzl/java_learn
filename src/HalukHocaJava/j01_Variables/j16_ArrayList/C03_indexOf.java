package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        //indexOf();-> list içinde istenen elemanın index değerini return eder. Küçük-Büyük harf duyarlılıgı var

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String>listSehir=new ArrayList<>(List.of("Munih","losAngeles","Londra","stockholm"));

        System.out.println(listSehir.indexOf("Londra"));// 2. sırada oldugunu verir
        System.out.println(listSehir.indexOf("Angara"));// oolmadıgı için -1 verir

            listUlke.add("Amerigonya");
        System.out.println(listUlke.indexOf("Amerigonya"));//1 değeri verir tekrarlı elemanlarda soldan ilk bulunan elemanın indexini verir
        System.out.println(listUlke.lastIndexOf("Amerigonya"));// sağdan ilk bulunan elemanın indexini return eder 4 değeri verir


    }
}
