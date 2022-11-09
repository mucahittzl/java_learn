package HalukHocaJava.j01_Variables.j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Task->kullanıcıdan alınan değerlerle bir int array elemanlarını buyukten kucuge print eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("kaç elemanlı array istiyorsun:");
        int arrBoyut= sc.nextInt();
        int arr[]=new int[arrBoyut]; // boyutu belirlenmıs boş int array
        for (int i = 0; i <arrBoyut ; i++) {
            System.out.print(i+". index elemanı giriniz : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("agam istediğin array:"+Arrays.toString(arr));
        Arrays.sort(arr);// arr küçükten büyüğe sıralandı
        for (int i = arr.length-1/*en buyuk sondaki elemandan dongu baslar*/; i >=0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
