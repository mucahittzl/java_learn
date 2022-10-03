package HalukHocaJava.j01_Variables.j10_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {
        /*
        concat()methodu içine(parametre) aldığı string varıable yi çalıştığı stringin sonuna ekler
        java da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar
         */
String name="nur";
String meslek="qa tester";
        System.out.println(name.concat(meslek)); // Nur qa tester
        System.out.println("name");// nur
        //Trick->string methodları variable de gecici değğişiklik yapar.Ama değişken atama yapılırsa kalıcı değisir.
        name=meslek.concat(name); //burda atama yapıldı sonrasında yazdırılırsa birleşecek
        System.out.println("name:"+ name); //a testernur

        System.out.println( name.concat( true  +  ":)")); //  qa testernurtre:)

    // Trick->concat methodu parametre olarak string type harici tum dataları stringe cevirip concat eder


    }
}
