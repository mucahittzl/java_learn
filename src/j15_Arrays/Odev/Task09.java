package j15_Arrays.Odev;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

       Scanner sc=new Scanner(System.in);


       int arr[]= new int[5];

       for (int i = 0; i <5 ; i++) {

           System.out.println(i+". sayı gir:");

            arr[i]=sc.nextInt();
       }
       for (int i = 4; i >=0 ; i--) {

           System.out.println(arr[i] + " ");
       }


    }
}
