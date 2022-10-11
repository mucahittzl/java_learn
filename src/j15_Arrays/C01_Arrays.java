package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */


        int a; //declare edilen ama atanmayan primitive data
        int arr[]; //declare edilen (tanımlanan) ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz..

        String isimArray[] = {"muharrem", "enıse", "cebrail", "nazım", "özge"}; //hem tanımlama hem atama yapılan string array
        String isimArray2[] = {"muharrem", "enıse", "cebrail", "nazım", "özge"};

        int sayıArr[] = new int[5]; // java heap memory'de 5 default->0 olan int array olusturuldu


        //Array'a eleman ekleme...

        sayıArr[2] = 34;
        sayıArr[0] = 35;
        sayıArr[1] = 34;
        sayıArr[3] = 61;
        sayıArr[0] = 34; // 0 index array elemanı 34 değeri ile update edildi
        //array elemanları unıque olmak zorunda değildir tekrarlı array elemanı olabılır.

        //array eleman sayısı boyut değeri....

        System.out.println(sayıArr.length); // 5
        //Array son elemanı...
        System.out.println("isimArray.length-1 = " + isimArray[isimArray.length - 1]);// son elemanı verir özge
        isimArray[isimArray.length - 1] = "QA özge"; //array son eleman update edildi..


        //Array da olmayan eleman

        //okkalı bir tecik--> sayıArr[11]=23;// cte vermez ama olmayan eleman rte verir->array run time da oluşur

        //Array elemanmları print etme

        for (int i = 0; i < isimArray.length; i++) {
            System.out.print(isimArray[i] + " ");
        }
        System.out.println("isimArray = " + isimArray);//isimArray = [Ljava.lang.String;@2c6a3f77 ->isimarray referans değeridir

        System.out.println("Arrays.toString(isimArray) = " + Arrays.toString(isimArray)); // isimArray stringe çevrildi



        //task-> sayıArr leemanlarından değeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayıArr.length ; i++) {
            if (sayıArr[i]%2==1) System.out.println(sayıArr[i]); // 61 verir
        }

        //task-> sayıArr çift index elemanları print eden code create ediniz
        for (int i = 0; i < sayıArr.length ; i+=2) {
            System.out.println(sayıArr[i]);  // 34 34 veir
        }

        //task-> isimArray 5 harfli elemanlarından olusa arrayı n elemanlarını prınt eden code create ediniz

        String yeniARR[]=new String[isimArray.length]; //isimArray elemanı kadar yeni array olusturduk
        for (int i = 0; i <isimArray.length ; i++) {
            if(isimArray[i].length()==5){
            yeniARR[i]=isimArray[i];
            }
        }
        System.out.println("Arrays.toString(yeniARR) = " + Arrays.toString(yeniARR)); // boyutu 5 olan değerleri yazar araya null atar


    }
}