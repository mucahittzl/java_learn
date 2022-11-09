package HalukHocaJava.j01_Variables.j15_Arrays.ödev2;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        int sayı=123;

        String arr[]=String.valueOf(sayı).split("");

        int tersArr[]= new int [arr.length];
        int a=0;
        int index=0;

        for (int i = arr.length-1; i >=0 ; i--) {
            tersArr[index]=Integer.parseInt(arr[i]);
            index++;
        }
        System.out.println(tersArr[0]*100+tersArr[1]*10+tersArr[2]);










    }
}


