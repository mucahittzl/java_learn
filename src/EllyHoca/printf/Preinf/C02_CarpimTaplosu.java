package EllyHoca.printf.Preinf;

public class C02_CarpimTaplosu {
     /* verilen sayi icin carpim tablosu olusturun
        Ornek :
            input  : 5
            output : 1  2  3  4  5
                     2  4  6  8 10
                     3  6  9 12 15
                     4  8 12 16 20
                     5 10 15 20 25

     */


    public static void main(String[] args) {

        //Call to multipleTable method inside main method
        int tableInput=5;
        multipleTable(tableInput);

    }

    private static void multipleTable(int tableInput) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.printf("%-3d",i*j);
            }
            System.out.println();
        }

    }


    // Create a method an integer as parameter

}
