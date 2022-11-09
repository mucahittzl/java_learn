package HalukHocaJava.j01_Variables.j15_Arrays;

public class Task15 {
    public static void main(String[] args) {

        //task-> arr tüm elemanlarının çarpımını print eden code create ediniz

        int sayi[][] = {{1, 2, 3}, {9, 8}};

        int çarpma = 1;

        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi[i].length; j++) {
                çarpma *= sayi[i][j];
            }
        }
            System.out.println(çarpma);


        }
    }