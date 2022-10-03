package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */


		Scanner sc = new Scanner(System.in);
		System.out.println("ay giriniz");
		int ay = sc.nextInt();

		switch (ay) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("girilen ay 31 gün çeker");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("rilen ay 30 gün çeker");
				break;
			case 2:
				System.out.print("yılınızı giriniz : ");
				int yil = sc.nextInt();
				if (yil % 4 == 0) {
					System.out.println("girilen ay subat ayı 29 gün ceker ");
				} else System.out.println("girilen ay 28 gun ceker");
				break;
			default:
				System.out.println("doğru değer gir");

		}


	}




















}
