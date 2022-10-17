package j15_Arrays.ödev2;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int maxvalue=0;
        Integer arr[]={12,2,5,15,8};
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>maxvalue){
                maxvalue=arr[i];
            }
        }
        System.out.println(maxvalue);







    }
}

