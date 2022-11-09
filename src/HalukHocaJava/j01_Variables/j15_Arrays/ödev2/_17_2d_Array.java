package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */


        Integer arr[][]={{2,3,2},{4,1,5},{7,2,5}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i][j]==2){
                    arr[i][j]=6;
                }
            }
        }
        System.out.println("arr = " + Arrays.deepToString(arr));


    }
}