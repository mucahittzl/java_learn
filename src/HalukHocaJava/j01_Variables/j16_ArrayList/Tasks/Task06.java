package HalukHocaJava.j01_Variables.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

                /* TASK :
                 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
                 sadece tek elemanlarını ayrı diziye bir metodda atayarak
                  yazdırınız.

                 */


        int sayiArr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i <sayiArr.length ; i++) {
            System.out.print(i+1+". elemanı agam giresin :");
            sayiArr[i]=sc.nextInt();
        }


        tekElemanlar(sayiArr);
        System.out.println(tekElemanlar(sayiArr));

    }//main sonu

    private static ArrayList<Integer> tekElemanlar(int[] sayiArr) {

        ArrayList<Integer>tekSayılar=new ArrayList<>();//tek sayıların atanacagı bos lıst

        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==1){ // array elemanların tek olma sartı
                tekSayılar.add(sayiArr[i]);// tek olma sartı saglayan array elemanı lıste atandı

            }
        }


        return tekSayılar;


    }
}
