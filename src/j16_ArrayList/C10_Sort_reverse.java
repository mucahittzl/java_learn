package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {

        //Collections.sort(list);-> verilen listi natural sıralama yapar
        //Collections.reverse(list);->verilen listin ters sıralamasını return eder

        ArrayList<String> listSehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stockholm"));
        System.out.println("listSehir = " + listSehir);// sıralama oncesi->listSehir = [Munih, LosAngeles, Londra, Stockholm]
        Collections.sort(listSehir); //sort() methodu sout içinde çalışmaz
        System.out.println("listSehir = " + listSehir);//sıralama sonrası->listSehir = [Londra, LosAngeles, Munih, Stockholm]

        Collections.reverse(listSehir);
        System.out.println("listSehir = " + listSehir);//sondan başa yazdırır   listSehir = [Stockholm, Munih, LosAngeles, Londra]

        ArrayList<String> listUlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isvec"));
        System.out.println("listUlke = " + listUlke);// ters sıra öncesi->listUlke = [Almanya, Amerigonya, ingiltere, isvec]
        Collections.reverse(listUlke);
        System.out.println("listUlke = " + listUlke);//ters sıra sonrası->listUlke = [isvec, ingiltere, Amerigonya, Almanya]









    }
}
