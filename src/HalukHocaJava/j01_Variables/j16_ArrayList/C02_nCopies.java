package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String>listUlke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String>listSehir=new ArrayList<>(List.of("Munih","losAngeles","Londra","stockholm"));

        //nCopies(int, obje);-> int elemanlı bir
        ArrayList<String>yenilist=new ArrayList<>(Collections.nCopies(7,"javaCAN"));
        System.out.println(yenilist);

        //addAll();-> liste diğer listi olduğu gibi ekler

        listUlke.addAll(listSehir);//ülke list sonuna sehir list tamamen eklendi
        System.out.println(listUlke);
        listSehir.addAll(3,listUlke);// 3. index den itibaren ulke listi sehir liste tamamen eklendi
        System.out.println(listSehir);

        //task-> 1 den 10 a kadar sayıları bir liste atayıp print eden code create ediniz
        ArrayList<Integer>sayilar=new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            sayilar.add(i);
        }
        System.out.println(sayilar);











    }
}
