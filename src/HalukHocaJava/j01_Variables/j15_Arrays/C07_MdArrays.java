package HalukHocaJava.j01_Variables.j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {

        //->arr elemanlarını toplayan code create ediniz->137
        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt


    int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println("arr deki tüm elemanlar toplamı:"+toplam); //137















    }
}
