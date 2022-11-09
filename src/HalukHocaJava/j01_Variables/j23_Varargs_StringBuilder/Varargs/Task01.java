package HalukHocaJava.j01_Variables.j23_Varargs_StringBuilder.Varargs;

public class Task01 {
    public static void main(String[] args) {

                /*
        Task ->
        verilen Stringleri birlestiren concat isimli METHOD create ediniz.
        input : "m", "e", "r", "v", "e";
        output : merve
        input:"a","l","i";
         */
        String arr1[] = {"m", "e", "r", "v", "e"};
        String arr2[] = {"a", "l", "i"};
        strBirlestir(arr1);
        strBirlestir(arr2);
        strBirlestir("javacan"," Enise Hanım");

    }//main

    public static void strBirlestir(String...str){
        String birlesenStr="";
        for (String w:str){
            birlesenStr=birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }


}
