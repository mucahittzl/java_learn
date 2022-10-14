package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        //remove();-> listten istenen elemanı siler
        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.remove("angara"));//false
        System.out.println(listSehir.remove("Londra"));//true
        System.out.println(listSehir.remove(1));//LosAngelse
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, Stockholm]
       // System.out.println(listSehir.remove(11));//olmayan index eleman silinmesi istenirse RTE verir
        listSehir.add("Münih"); //eyni eleman eklemeleri
        listSehir.add("Angara"); //eyni eleman eklemeleri
        listSehir.add("Münih"); //eyni eleman eklemeleri
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, Stockholm, Münih, Angara, Münih]
        listSehir.remove("Münih");//tekrarlı eleman varsa ilk index eleman silinir diğerlerine dokunulmaz
        System.out.println("listSehir = " + listSehir);//listSehir = [Munih, Stockholm, Angara, Münih








    }
}
