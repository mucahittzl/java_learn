package HalukHocaJava.j01_Variables.j13_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {


        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.

 */

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz


        Scanner sc=new Scanner(System.in);
        System.out.println("mail giriniz:");
        String mail= sc.nextLine();

        for (int i = 0; i <mail.length() ; i++) {// 0. indexten son indexe kadar karakterleri döngüye alır
            char c=mail.charAt(i); //döngüdeki her karakteri c ye atar
            if (c==' '){ // c ed @ karakteri varsa if blok run edilir
                continue; //if blok lopp u atlar
            }
            System.out.print(c); //lopp dakı elde edilen karakteri c ye atar print eder
        }















    }
}
