package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        //task->girilen tamsayının tam bölen sayısını print eden code create ediniz.
        // 20 ->1,2,4,5,10,20 : 20 nin 6 tane tam böleni vardır örneği gibi

        Scanner sc=new Scanner(System.in);
        System.out.println("tamsayı giriniz:");
        int sayı= sc.nextInt();

        int bölensayı=1;
        int tamBölenAdedi=0;

        while (bölensayı<=sayı){
        if (sayı%bölensayı==0){//sayı bölen sayıya tam bölünme şartı
            tamBölenAdedi++;
        }
        bölensayı++; //loop sonsuza düşmemesi için ve diğer sayıların böldüğünü kontrol etmek için 1 arttırdık
        }
        System.out.println("girilen sayı"+" "+sayı+" "+"nın"+" "+tamBölenAdedi+" "+"kadar tam böleni var");












    }
}
