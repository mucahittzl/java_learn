package HalukHocaJava.j01_Variables.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C07_NestedTernaryOperator {
    public static void main(String[] args) {

        /*
TASK :
 Girilrn bir pozitif tamsayı pozitif tamsayı 4 basamaklı ise  "4 Basamaklı" print eden
 4 basamaklı degilse çift olup olmadigini kontrol edip. Çift ise "4 basamaklı olmayan çift sayı" yazdırın.
 Çift sayı degilse "4 basamaklı olmayan tek sayı yazdırın."
 */

        Scanner sc=new Scanner(System.in);
        System.out.println("pozitif tam sayı gır:");
        int num=sc.nextInt();
        System.out.println(num>999 && num<10000 ? "4 Basamakli" : (num%2==0 ? "4 basamakli olmayan cift sayi":"4 basamakli olmayan tek sayi"));

























    }
}
