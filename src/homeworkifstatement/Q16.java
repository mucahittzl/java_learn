package homeworkifstatement;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("num1 gir:");
        int num1= sc.nextInt();
        System.out.println("num2 gir:");
        int num2=sc.nextInt();
        System.out.println("num3 gir:");
        int num3= sc.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        System.out.println("Max = "+max+"   Min = "+min);












    }
}

