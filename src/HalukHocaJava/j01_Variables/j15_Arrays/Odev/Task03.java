package HalukHocaJava.j01_Variables.j15_Arrays.Odev;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[]={1,2,3};
		int yeniarr[] =new int[arr.length];
		for (int i = 0; i <=arr.length-1 ; i++) {

			yeniarr[(i+2)% arr.length]=arr[i];
		}

		System.out.println(Arrays.toString(yeniarr));


	}

}
