package TekrarDersleri.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task07 {
    public static void main(String[] args) {


    /*
    Write a Java program to separate odd and even numbers of a given array of integers.
    Put all odd numbers first, and then even numbers.
     example: int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
     */


        int sayi[] = {20, 12, 23, 17, 7, 8, 10, 2, 1, 0};
        ArrayList<Integer> yenisayı = new ArrayList<>();

        for (int i : sayi) {
            if (i % 2 == 1) {

                yenisayı.add(i);
            }


        }
        for (int j:sayi){
            if (j%2==0){
                yenisayı.add(j);
            }
        }
        System.out.println(yenisayı);
    }
}
