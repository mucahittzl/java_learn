package HalukHocaJava.j01_Variables.j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {

                    /*
            Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
             */

        int sayi=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikGabık";
        carpStringUzun(sayi,str1,str2,"Javacan",str3);


    }
    public static void carpStringUzun(int carapcakSayi,String...str){
        String enUzun="";
        for (String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
        System.out.println("agam ıstediğin değer :"+(carapcakSayi*enUzun.length())+" "+enUzun);
    }
}
