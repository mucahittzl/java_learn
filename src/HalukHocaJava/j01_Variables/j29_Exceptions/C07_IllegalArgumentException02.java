package HalukHocaJava.j01_Variables.j29_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("agam try block başındasın");
            hata();
            System.out.println("agam try block sonundasın");
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println(e.getMessage());
           e.printStackTrace();
        }

        System.out.println("sorun handle edildi dewamkee");
    }//main sonu

    public static void hata(){
        throw new IllegalArgumentException("Agam naptin yine mi hata");
    }

}
