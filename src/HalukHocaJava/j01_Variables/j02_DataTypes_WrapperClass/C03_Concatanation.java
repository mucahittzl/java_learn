package HalukHocaJava.j01_Variables.j02_DataTypes_WrapperClass;

public class C03_Concatanation {
    public static void main(String[] args) {
        String ad="mücahit";
        String soyad ="tezel";

        int a=7;
        int b=11;
//birden çok string variable ile farklı variable'ler + ile işleme alınırsa java birleştirme yaparak yeni bir string oluşturur
// string ifade geldikten sonra birleştirir toplama yapmaz7+11 degil 711 olur

        System.out.println(ad+soyad+a+b);//mücahit tezel711

        System.out.println(a+ad+soyad+b);//7mücahit tezel11

        System.out.println(a+b+ad+soyad);//18mücahit tezel

        System.out.println("  "+a+b);// ...711

        System.out.println(ad+soyad+(a+b));//mucahit tezel18 (parantez içini toplar)matematikteki gibi

        System.out.println((a+b)+ad+soyad);//18mücahit tezel

        System.out.println(ad+(a-b)+(a-b));//mücahit-4-4

        System.out.println(ad+((a-b)+(a-b)));//mücahit-8


        char ch='1';//
        System.out.println(ad+ch);//mucahit1

        System.out.println(a+ch+ad);//56mucahit    1'in ascii değerini alır  ch karakter değer olduğu için.

        System.out.println(ad+(ch+b));//mucahit60

        System.out.println(a+ad+ch);//7mucahit1  burda stringle değil intecer ifadeyle basladı ch1 değerini alır

/*TRICK->char data turu işleme girdiği variables'in türüne gore farklı ıslem yapar
eger işleme girdiği variables aritmatik işlemse ascii değeri ile işlem yapar.
 */



    }
}









