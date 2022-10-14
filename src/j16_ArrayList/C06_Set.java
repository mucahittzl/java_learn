package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {

    //set();->listin istenen indexe istenen elemanını set eder

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","losAngeles","Londra","stockholm"));
        System.out.println(listSehir.set(3, "Angara"));//stockholm-> set edilen değer print edilir
        System.out.println(listSehir);//[Munih, losAngeles, Londra, Angara]-> list set edilmis halini print eder
        //System.out.println(listSehir.set(11, "pataGONYA"));//olmayan index set edilirse rte verir
        System.out.println("listSehir = " + listSehir);

    }
}
