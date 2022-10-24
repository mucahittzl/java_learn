package j15_Arrays.Odev;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

    int arr[]={1,2,-3,4,-5,-6};


        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]*-1;
        }
        System.out.println(Arrays.toString(arr));


        for (int a:arr){
          a=a*-1;
             System.out.print(" " + a);
}





    }
}
