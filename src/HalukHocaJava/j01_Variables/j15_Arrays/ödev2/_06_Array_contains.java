package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        String arr[]={"Apple","Orange","Banana","Kiwi"};

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("Apple")) System.out.println(true);
            else System.out.println(false);
            break;
        }



    }
}
