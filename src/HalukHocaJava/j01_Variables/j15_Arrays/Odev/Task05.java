package HalukHocaJava.j01_Variables.j15_Arrays.Odev;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.println("int değeri gir:");
        int değer= sc.nextInt();

        String sayı=String.valueOf(değer);
        String arr[]=sayı.split("");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }












    }
  
}
