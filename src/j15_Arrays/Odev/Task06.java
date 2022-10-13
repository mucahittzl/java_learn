package j15_Arrays.Odev;

import java.util.Arrays;

public class Task06 {
    static   int arr[]= {3,5,6,1,9,45,25,4,9,0};
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz


        System.out.println(Arrays.toString(sıralama()));


    }

    private static int[] sıralama() {
int yeniarr[]=new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
           yeniarr[i]= arr[arr.length-i-1];

        }

        return yeniarr;


    }
}
