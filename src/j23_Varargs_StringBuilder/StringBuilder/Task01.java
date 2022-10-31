package j23_Varargs_StringBuilder.StringBuilder;

public class Task01 {
    public static void main(String[] args) {

                /*
        Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
               olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir method create ediniz
            (without case sensitivity)
            Eg : input : I love Java
            Output: "Reversed sentence : avaJ evol I
               It is not a palindrome"

         */

        System.out.println("tersString(\"ece\") = " + tersString("ece")); //ece
        System.out.println("tersString(\"serhat\") = " + tersString("serhat"));//tahres

        StringBuilder sb1=new StringBuilder("ali");
        tersSB(sb1);
        System.out.println(sb1);//ila
        tersSB(new StringBuilder("serhat"));//tahres
        System.out.println("isPolindrom(\"ey edip adanada pide ye\") = " + isPolindrom("ey edip adanada pide ye"));//true
        System.out.println("isPolindrom(\"nazım\") = " + isPolindrom("nazım"));//false

    }//main sonu

    public static String tersString(String str){ //amele işi olan yöntem
        String StringTersi="";
        for (int i = str.length()-1; i >=0 ; i--) {
            StringTersi+=str.charAt(i);
        }
        return StringTersi;
    }
public static void tersSB(StringBuilder sb){
        sb.reverse();
}

public static boolean isPolindrom(String str){
        if (str==null){
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);
}


}
