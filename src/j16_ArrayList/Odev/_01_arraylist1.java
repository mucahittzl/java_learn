package j16_ArrayList.Odev;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(List.of("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        System.out.println("Count = " + getCount(list1, "Orange"));
        getCount(list1,"Orange");




    }

    private static int getCount(ArrayList<String>a,String str) {
        int count = 0;
        for(String value : a) {
            count+=value.contains(str)? 1 : 0;
        }
        return count;
    }
}
