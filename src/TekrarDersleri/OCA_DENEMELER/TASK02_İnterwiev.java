package TekrarDersleri.OCA_DENEMELER;

public class TASK02_İnterwiev {
    public static void main(String[] args) {

        /*
        Bir Stringde ilk uniq karakteri bulup return eden method create ediniz.
        Ex:
        String str1="AAABBBCCCDEF";
        String uniqf="D";
         */
        System.out.println("unıq(\"AAABBBCCCDEF\") = " + unıq("AAABBBCCCDEF"));


    }//main sonu
    public static String unıq(String str1){
        String unıqBos="";
        for (int i = 0; i <str1.length() ; i++) {
            if (str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
                unıqBos=String.valueOf(str1.charAt(i));
                break;
            }
        }
        return unıqBos.length()==0?"unıq karakter yok":unıqBos;
    }


}
