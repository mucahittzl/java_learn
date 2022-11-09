package HalukHocaJava.j01_Variables.j16_ArrayList.Odev;

import java.util.ArrayList;
import java.util.List;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {


        int sayı[][]={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        List<Integer> list1=new ArrayList<>();
       for (int a[]:sayı){
           for (int b:a){
               list1.add(b);
           }
       }
        System.out.println(list1);


    }
}