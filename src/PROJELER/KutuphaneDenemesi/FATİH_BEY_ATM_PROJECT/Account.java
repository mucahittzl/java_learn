package PROJELER.KutuphaneDenemesi.FATİH_BEY_ATM_PROJECT;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {


    private int accountNumber;
    private int pinNumber;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput(){
        return input;
    }
    public void setInput(Scanner input){
        this.input=input;
    }

    private double calculateCheckingBalanceAfterWithdraw(double amount){
        checkingBalance= checkingBalance - amount;
        return checkingBalance;
    }

    private double calculateCheckingBalanceAfterDepozit(double amount){
        checkingBalance= checkingBalance + amount;
        return checkingBalance;
    }

    private double calculateSavingBalanceAfterWithdraw(double amount){
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    private double calculateSavingBalanceAfterDepozit(double amount){
        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    public void getCheckingWithdraw(){
        System.out.println("Your checking balance is : "+ moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw!");
        double amount= input.nextDouble();
        if (amount <= 0){
            System.out.println("negative or zero amount is not acceptable!");
            getCheckingWithdraw();
        } else if (checkingBalance >= amount) {
        calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("This is your remaining balance" + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("You do not enough money!");
        }
    }

public void getCheckingDepozit(){

    System.out.println("Your checking balance is "+ moneyFormat.format(checkingBalance));
    System.out.println("Enter the amount you would like to deposit");
    double amount = input.nextDouble();
    if(amount <= 0){
        System.out.println("Negative or zero amount is not accaptable!");
        getCheckingDepozit();
    }else {
        calculateCheckingBalanceAfterDepozit(amount);
        System.out.println("This is your remaining balance" + moneyFormat.format(checkingBalance));
    }
}

public void getSavingWithdraw(){
    System.out.println("your saving balance is " + moneyFormat.format(savingBalance));
    System.out.println( " Enter the amount you would like to withdraw!");
    double amount= input.nextDouble();
    if(amount <= 0){
        System.out.println("Negative or zero amount is not acceptable!");
        getSavingWithdraw();
    }else if (savingBalance >= amount){
        calculateSavingBalanceAfterWithdraw(amount);
        System.out.println("your remaining balance is : " + moneyFormat.format(savingBalance));
    }else{
        System.out.println("You do not enough money!");
    }
}

public void getSavingDeposit(){
    System.out.println("your saving balance is " + moneyFormat.format(savingBalance));
    System.out.println( " Enter the amount you would like to depozit!");
    double amount= input.nextDouble();
    if(amount <= 0){
        System.out.println("Negative or zero amount is not acceptable!");
        getSavingDeposit();
    }else if (savingBalance >= amount){
        calculateSavingBalanceAfterDepozit(amount);
        System.out.println("your remaining balance is : " + moneyFormat.format(savingBalance));
    }else{
        System.out.println("You do not enough money!");
    }
}




}