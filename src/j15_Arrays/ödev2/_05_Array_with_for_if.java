package j15_Arrays.ödev2;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */
       int topla=0;
        Integer arr[]={5,6,8,12,14,19};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0) {
                topla += arr[i];
            } else topla -= arr[i];
        }
        System.out.println("topla = " + topla);

    }
}
