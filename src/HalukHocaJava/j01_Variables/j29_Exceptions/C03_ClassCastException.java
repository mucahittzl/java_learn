package HalukHocaJava.j01_Variables.j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {

        //ClassCastException -> Birbirine dönüştürülemeyen data type'lar birbirine dönüştürüldüğünde oluşan RTE Exception'dur

        Object obj="javaCAN'lara selam olsun";
        String str= (String) obj;//object data type string data type'a casting yapılarak atandı.
        System.out.println("str = " + str);//javaCAN'lara selam olsun

        Object sayi1=10;
         //String str2= (String) sayi1;//object data type string data type'a casting yapılarak atandı.
         //System.out.println("str2 = " + str2);//ClassCastException

        try {
            String str2= (String) sayi1;
        }catch (ClassCastException e){
            System.out.println("agam integer object hiç stringe çevrilir mi?");
        }

        try {
                String str3= (String) obj;
            System.out.println("agam TRY Block'ta bu yazıyı okuduysan Exception fırlatmadı code sorunsuz");
        }catch (ClassCastException e){
            System.out.println("agam str3'te hata aldın");
        }


        System.out.println("agam sorun handle edildi dewamkee");//bu code çalışmazsa pr sorunsuz kırılmadan un olmustur
    }
}
