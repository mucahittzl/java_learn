package HalukHocaJava.j01_Variables.j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */



		Scanner sc = new Scanner(System.in);
		System.out.println("sayıyı giriniz:");
		int sayı1= sc.nextInt();
		int i=0;
		while(i<11){
			System.out.println(sayı1+""+"*"+i+"="+(sayı1*i));
			i++;
		}




	}

}
