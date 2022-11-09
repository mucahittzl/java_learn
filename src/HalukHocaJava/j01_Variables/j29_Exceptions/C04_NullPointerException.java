package HalukHocaJava.j01_Variables.j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {

        //ullPointerException ->Null ataması yapılan bir string'te length() method run edildiğinde oluşan RTE exception

        String str="";
        System.out.println("str.length() = " + str.length());

        String str1=null;
       // System.out.println("str1.length() = " + str1.length());//NullPointerException kod kırılır

        try {
            System.out.println("str.length() = " + str1.length());//excp try block kırılır catch block run olur
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (NullPointerException e){
            System.out.println("sıkıntı var burdan devam et");
        }

        try {
            System.out.println("str.length() = " + str1.length());//exception olmadığı içib try block tamamlanır catch block çalışmaz
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (NullPointerException e){
            System.out.println("sıkıntı var burdan devam et");
        }

        System.out.println("agam sorun handle edildi dewamkee");//bu code çalışmazsa pr sorunsuz kırılmadan un olmustur
    }
}
