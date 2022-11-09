package HalukHocaJava.j01_Variables.j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>(Arrays.asList( "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        System.out.println("rotateList(list1) = " + rotateList(list1));


    }

    private static ArrayList<String> rotateList(ArrayList<String> list1) {
      // ArrayList<String>tersi=new ArrayList<>();
       Collections.reverse(list1);
      //  tersi.add(String.valueOf(list1));
        return list1;
    }
}

