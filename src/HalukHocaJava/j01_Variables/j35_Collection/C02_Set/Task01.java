package HalukHocaJava.j01_Variables.j35_Collection.C02_Set;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        /*
        Deger ataması yapılan array'i arrayList'e çeviren method create ediniz
        main içerisinde methodun return ettiği arrayList'i hashSet,LinkedHashSet ve Tree Set'e atayınız
         */
        String  arr[]={"Muharrem","Umit","Sinan","Nihan"};

        //  arrayListeCevir(arr);
        HashSet<String >hs=new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String > lhs=new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String > ts=new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hurra set : "+hs);//[Muharrem, Sinan, Nihan, Umit]
        System.out.println("erken gelen girer set : "+lhs);//[Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıre set : "+ts);//[Muharrem, Nihan, Sinan, Umit]
    }//main sonuu

    public static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String > arLst=new ArrayList<>(List.of(arr));

        return arLst;
    }
}
