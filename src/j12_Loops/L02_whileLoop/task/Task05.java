package j12_Loops.L02_whileLoop.task;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		
			Scanner sc=new Scanner(System.in);
		System.out.println("isim giriniz:");
		String isim= sc.nextLine();
		System.out.println("soyisim giriniz:");
		String soyisim= sc.nextLine();
		String adSoyad = isim.concat(soyisim);
		int x=0;
		while (x<adSoyad.length()){
			System.out.print(adSoyad.charAt(x)+" ");
			x++;
		}




	}

}
