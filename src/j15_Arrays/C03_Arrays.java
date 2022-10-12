package j15_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

//Stringi arraya çevirme.....split()->girilen parametre değere göre string ifade parçalanır.

        String str="javaCAN'lara selam olsun. en kısa zamanda bolcana ofer sonrası TUZLABALIK :)";
        //task->String ifadeyi kelimele sayısını print eden code create ediniz
       String strArr[]= str.split(" "); //str her " " karaktere göre parçalanır.
                                             //her bir parça strArrayın bir elemanı olarak atandı
        System.out.println(Arrays.toString(strArr)); //[javaCAN'lara, selam, olsun., en, kısa, zamanda, oofer, sonrası, TUZLABALIK, :)]
        System.out.println(strArr.length); //11

    //task->string ifadedeki harf sayısını print eden code create ediniz

        String harfArr[]=str.split("");//string harf harf "" hiçlik e göre parçalandı
        System.out.println(Arrays.toString(harfArr));//
        System.out.println(harfArr.length); //76
    }
}
