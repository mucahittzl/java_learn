package TekrarDersleri.Arrays;

import java.util.Arrays;

public class Task05 {
    /*
   Find the middle element in an integer array
   Example:  (10, 5, 6) ==> (5, 6, 10) ==> Output=6
             (16, 5, 8, 10) ==> (5, 8, 10, 16) ==> Output=(8+10)/2 = 9
*/
    public static void main(String[] args) {


        int []arr={16,5,8,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int middleIndex= arr.length/2;
if (arr.length%2!=0){
    System.out.println(arr[middleIndex]);
}else middleIndex=(arr[middleIndex]+arr[middleIndex-1])/2;
        System.out.println(middleIndex);
    }
}
