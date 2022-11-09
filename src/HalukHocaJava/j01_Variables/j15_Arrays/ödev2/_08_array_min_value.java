package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        Integer arr[]={14,19,5,21};

        int minvalue=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (minvalue>arr[i]){
                minvalue=arr[i];
            }
        }
        System.out.println("minvalue = " + minvalue);








    }
}

