package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(8, 7, 9, 6, 7));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 12, 3, 1));

        System.out.println(common_values(list1, list2));
    }

    private static List<Integer> common_values(List<Integer>list1,List<Integer>list2) {
        List<Integer> esit = new ArrayList<>();
        for (Integer a : list1) {
            for (Integer b:list2) {

                if (a==b&&!esit.contains(a)) {

                    esit.add(a);
                }
            }
        }
        return esit;

    }
}
