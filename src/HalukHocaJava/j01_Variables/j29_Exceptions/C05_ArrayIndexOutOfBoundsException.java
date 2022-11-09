package HalukHocaJava.j01_Variables.j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException -> array'lerde olmayan bir index elemanı ile işlem aypıldığında oluşan RTE exception

        int arr[]={24,27,38,41,54};
        System.out.println("arr[0] = " + arr[0]);//24

       // System.out.println("arr[0] = " + arr[7]);//ArrayIndexOutOfBoundsException

        try {
            System.out.println("arr[0] = " + arr[7]);
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (ArrayIndexOutOfBoundsException e){//burası çalışır
            System.out.println("olmayan array elemanı istendi");
            System.out.println("agam  bu yazıyı okuduysan catch block çalıştı sorun handle edildi");
        }

        try {
            System.out.println("arr[0] = " + arr[3]);//burası çalışır
            System.out.println("agam TRY Block da bu yazıyı okuduysan exception fırlatmadı code sorunsuz");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("olmayan array elemanı istendi");
            System.out.println("agam  bu yazıyı okuduysan catch block çalıştı sorun handle edildi");
        }


        System.out.println("agam sorun handle edildi dewamkee");//bu code çalışmazsa pr sorunsuz kırılmadan un olmustur
    }
}
