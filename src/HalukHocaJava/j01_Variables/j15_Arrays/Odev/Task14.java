package HalukHocaJava.j01_Variables.j15_Arrays.Odev;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        String str = "ade1r4d3";
        String arr[]=str.replaceAll("\\D","").split("");

        int sayıT=0;
        for (int i = 0; i < arr.length ; i++) {
            sayıT+=Integer.valueOf(arr[i]);
        }
        System.out.print("Sayı toplam:"+sayıT);


    }


}

