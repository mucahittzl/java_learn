package HalukHocaJava.j01_Variables.j15_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        //Array elemanı varlığını kontrol etme
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi=34;

    boolean flag=false; // default değeri ile başlanır->false
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==sayi){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("aradığınız array da var");
        }else {
            System.out.println("aradıgınız sayı array da yok");
        }
        Arrays.sort(arr); //array elemanları sıralandı
        System.out.println(Arrays.toString(arr)); // sıralanmıs hali
        System.out.println(Arrays.binarySearch(arr, 34)); //binarySearch(arr,34);->method aranan elemanı array da arayıp index return eder.
        // trick-> binarySearch() methodu arrayde olmayan elemanla calısırsa sonuc olarak eger bu eleman arrayd a olsaydı kaçıncı
        // olurdu nun cevabını verir. basına olmadıgı için "-" koyar
        System.out.println(Arrays.binarySearch(arr,99)); // bu örnekte -13 verir


    }
}
