package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */


     // Integer arr[]={1,2,3,4};
     // for (int i = 0; i < arr.length ; i++) {
     //     if (arr[i].)
     // }


        int inArr[]={1,2,3,4};

        int sayac=0;
        for (int i = 0; i < inArr.length; i++) {

            if (inArr[i]==1 ) {
                sayac++;
            }
            if (inArr[i]==4){
                sayac++;
            }
        }
        System.out.println(sayac != 2);







    }
}