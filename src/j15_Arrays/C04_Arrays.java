package j15_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        //Array eşitlik kontrolü...equals() -> methodu index ve value kontrolu yapar ve true/false return eder

        int sayı1[]={39,3,72,63,84};
        int sayı2[]={84,72,63,3,39};

        System.out.println("sayi1 ve sayı2 eşit mi:"+Arrays.equals(sayı1, sayı2)); //false verir
        Arrays.sort(sayı1);//burada sayıları sıraladık [3,39,63,72,84]
        Arrays.sort(sayı2);//burada sayıları sıraladık [3,39,63,72,84]
        System.out.println("sayi1 ve sayı2 eşit mi:"+Arrays.equals(sayı1, sayı2)); // true verir

        //array ı stringe cevirme... toString(arr);-> verilen arr' i string data type cevirir

        String str=Arrays.toString(sayı1);
        System.out.println("str:"+str); //str:[3, 39, 63, 72, 84] array ın tum karakterleri string olarak tanımlandı
        System.out.println(str.substring(6));


    }
}
