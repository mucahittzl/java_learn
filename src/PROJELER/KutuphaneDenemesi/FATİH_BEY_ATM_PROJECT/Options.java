package PROJELER.KutuphaneDenemesi.FATİH_BEY_ATM_PROJECT;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{



    Scanner input=new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Map<Integer, Integer> data= new HashMap<>();

    boolean flag= true;

    public void login(){
        System.out.println("Hello ,Welcome to Kimukin ATM...");
        int counter=0;
        do {
            data.put(12345, 1234);
            data.put(23456, 2345);
            data.put(34567, 3456);
            data.put(45678, 4567);



            try{
                System.out.println("Enter the account number");
                setAccountNumber(input.nextInt());
                System.out.println("Enter Pin number");
                setPinNumber(input.nextInt());

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("you have entered invalid character(s)! Please select an integer or press 'q' to exit.");
                input.nextLine();
                String exit= input.next();
                if (exit.equalsIgnoreCase("q")){
                    flag=false;
                    break;
                }

            }
            int count=0;
            for (Map.Entry<Integer,Integer> w: data.entrySet()){
                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
        getAccountTypes();
                }else {
                    count++;
                }

            }
            if (count==data.size()){
                System.out.println("Account number or Pin is invalid.");
                System.out.println("Please enter a valid number or press q to exit");
                input.nextLine();
                String exit= input.next();
                if (exit.equalsIgnoreCase("q")) {
                    flag = false;

                }
            }
if (counter== 3){
    System.out.println("your account blocked");
    flag=false;
    
}
        }while (flag);





    }






    public void optionDisplay() {
        System.out.println("Select Options:");
        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Depozit");
        System.out.println("4: Exit");
    }


    public void checkingOperations(){
        do{
            optionDisplay();

            int option= input.nextInt();
            if (option==4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("your checking balance is : " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDepozit();
                    break;
                default:
                    System.out.println("Invalid Option! Please select 1, 2, 3 or 4 ");
                }
        }while (true);
        getAccountTypes();
    }


    public void savingOperations(){
        do{
            optionDisplay();
            int option = input.nextInt();
            if(option == 4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Your saving balance is: "+moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Invalid option! Please select 1, 2, 3 or 4");
            }
        }while (true);
        getAccountTypes();
    }



    public void getAccountTypes(){
        System.out.println("Select the account you would like to access!");
        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("You are in checking account!");
                checkingOperations();
                break;
            case 2:
                System.out.println("You are in saving account!");
                savingOperations();
                break;
            case 3:
                System.out.println("Thanks for choosing the ATM! See you later!");
                flag = false;
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, 3");
        }
    }







}
