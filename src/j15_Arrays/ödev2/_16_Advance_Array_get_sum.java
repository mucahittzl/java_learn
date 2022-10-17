package j15_Arrays.ödev2;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */


        String str = "$12 $23 $10 $2 $5 $2";
        String arr []= str.replace("$","").split(" ");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=Integer.parseInt(arr[i]);

        }
        System.out.println("toplam = " + toplam);


        
        
        
        
        
        
    }
}