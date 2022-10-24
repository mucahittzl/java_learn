package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        System.out.println("getLenght(list1) = " + getLenght(list1));

    }

    private static ArrayList<Integer> getLenght(ArrayList<String> list1) {
        ArrayList<Integer>list2=new ArrayList<>();
        for (String i:list1) {

            list2.add(i.length());

        }



return list2;
    }
}