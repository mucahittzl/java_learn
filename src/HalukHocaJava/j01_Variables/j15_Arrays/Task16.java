package HalukHocaJava.j01_Variables.j15_Arrays;

public class Task16 {
    public static void main(String[] args) {

//task->sayı arr daki son elemanların çarpımını print eden code create ediniz

        int sayi[][] = {{1, 2, 3}, {9, 8},{24,0,4}};

int çarpım=1;
        for (int i = 0; i < sayi.length ; i++) {

    çarpım*=sayi[i][sayi[i].length-1];

        }

        System.out.println(çarpım);








    }
}
