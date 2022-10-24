package j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        List<Integer>list1=new ArrayList<>(Arrays.asList( 5,3,4,6,7));

        System.out.println(secondMax(list1));


    }
    public static ArrayList<Integer>secondMax(List<Integer> list1){

        List<Integer>list2=new ArrayList<>();
        Collections.sort(list1);
        list2.add(list1.get(list1.size()-2));
   return (ArrayList<Integer>) list2;
    }
}

