package HalukHocaJava.j01_Variables.j12_Loops.L01_ForLoop.TASK;

import java.util.Scanner;

public class Task09Nested5 {
    public static void main(String[] args) {


          /*
  task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
    Örnek Ekran çıktısı
*
* *
* * *
* * * *

   */
        Scanner sc=new  Scanner(System.in);

        System.out.println("kare için boyut giriniz : ");
        int boyut=sc.nextInt();

        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");//yan yana olması için ln silinir

            }
            System.out.println(""); //dumy attık alt alta yazsın diye
        }








    }
}
