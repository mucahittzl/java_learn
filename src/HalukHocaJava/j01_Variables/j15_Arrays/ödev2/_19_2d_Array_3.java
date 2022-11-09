package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */


        String Arr[][]={{"new jersey","atlanta","ohio"},
                {"Pittsburgh" ,"ohio","new york","ohio"},
                {"ohio","new york"}};

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {

                if (Arr[i][j].equalsIgnoreCase("ohio")) {
                    Arr[i][j] = "Florida";
                }
            }
        }
        System.out.println(Arrays.deepToString(Arr));









    }
}

