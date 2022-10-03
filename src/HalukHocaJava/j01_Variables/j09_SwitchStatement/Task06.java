package HalukHocaJava.j01_Variables.j09_SwitchStatement;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
Scanner sc=new Scanner(System.in);
		System.out.println("(v.ı.p) öğrenmek istediğiniz harfi giriniz : ");
		String st=sc.next().toLowerCase();
		char harf =st.charAt(0);
		switch (harf) {
			case 'v':
				System.out.println("Very");
				break;
			case 'i':
				System.out.println("Important");
				break;
			case 'p':
				System.out.println("Person");
				break;
			default:
				System.out.println("hatalı harf girdiniz");
		}
















	}
}
