package j15_Arrays.Odev;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */


        Scanner sc=new Scanner(System.in);
        int arr[]=new int[8];

        for (int i = 0; i <8 ; i++) {
            System.out.println("rakamları gir:");
            arr[i]=sc.nextInt();

        }
        int aded=0;
        for (int i = 0; i <8; i++) {
            if (arr[i]%3==0){
                aded++;
            }
        }
        System.out.println("3'e bolunen sayı adedi:"+aded);






    }
}
