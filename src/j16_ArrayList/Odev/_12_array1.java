package j16_ArrayList.Odev;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

     int[] arr = {1,2,3,1};
        System.out.println("dupicate(arr) = " + dupicate(arr));

    }

    private static boolean dupicate(int[]arr) {
        int count=0;
        boolean flag=false;
        for (int i:arr){
            count=0;
            for (int j : arr){
                if (j==i)count++;
            }
            if (count>1)flag=true;
            break;
        }
        return flag;



    }
}