package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        Integer arr[]={12,14,21,23,10,4};
        int ort=0;
        int toplm=0;
        for (int i = 0; i < arr.length ; i++) {
            toplm += arr[i];
            ort = toplm/ arr.length;
        }
        System.out.println("toplm = " + toplm);
        System.out.println("ort = " + ort);
    }
}