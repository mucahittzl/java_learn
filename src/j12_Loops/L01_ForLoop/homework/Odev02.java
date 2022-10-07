package j12_Loops.L01_ForLoop.homework;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz

		 */


		Scanner sc = new Scanner(System.in);
		System.out.println("bir kelime giriniz : ");
		String kelime = sc.next();
		int rakam = 0;
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) >= '0' || kelime.charAt(i) <= '9')
				rakam++; }
		System.out.println("girdiginiz kelimedeki rakam sayısı=" + rakam);





	}
}