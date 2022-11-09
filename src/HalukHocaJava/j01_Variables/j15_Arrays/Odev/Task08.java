package HalukHocaJava.j01_Variables.j15_Arrays.Odev;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);



        int arr[]=new int[7];
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(i+". int değeri gir:");
            arr[i]= sc.nextInt();
        }
        ;
        for (int i = 0; i <7 ; i++) {
            if (arr[i]%2==1) System.out.print("tek sayılar:"+arr[i]+" ");
        }







    }
}
