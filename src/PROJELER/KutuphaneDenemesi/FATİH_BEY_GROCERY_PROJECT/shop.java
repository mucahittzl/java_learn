package PROJELER.KutuphaneDenemesi.FATİH_BEY_GROCERY_PROJECT;

public class shop extends Grocery {

    @Override
    public void shopping() {
        while (flag){
            optionDisplay();

            String option = input.next();
            switch (option) {
                case "1":
                    addToCart();
                    break;
                case "2":
                    removeToCart();
                    break;
                case "3":
                    payAndLeave();
                case "4":
                    System.out.println("Have a Nice Day.");
                    flag = false;
                    break;
                default:
                    System.out.println("wrong chose. try again");
                    shopping();
            }
        }
    }

    public void optionDisplay () {
        System.out.println("Welcome to " + shopName +" Grocery. Select Options:");
        System.out.println("1: Add item to cart");
        System.out.println("2: Delete items from cart");
        System.out.println("3: Pay and leave");
        System.out.println("4: Leave " + shopName + " Grocery :(");
    }
    public void payAndLeave(){
        if (sum != 0) {
            System.out.println("You will pay : " + sum +" TL");
            System.out.println("Type 'Y' to pay");

            if (input.next().equalsIgnoreCase("y")) {
                System.out.println("Checking Visa...");
                System.out.println("Wait for conformation...");
                System.out.println("Payment Done!");
                sum=0;
                cart.clear();
            }
        }
    }

    public void removeToCart(){
        printCart();
        System.out.println("Which one do you want to remove?");
        int del=input.nextInt();
        sum = sum - (cart.get(del) * productPrice.get(product.get(del)));
        cart.remove(del);
        printCart();
        shopping();
    }
    public void addToCart() {
        do {
            printProduct();
            System.out.println("Select item number");
            int item = input.nextInt();
            if (item > product.size() || item <= 0) {
                System.out.println("invalid input");
                addToCart();
                break;
            }

            System.out.println("How much Kg do you want?");
            int kg = input.nextInt();
            if (cart.containsKey(item)) {
                kg = kg + cart.get(item);
            }
            if (kg > 50) {
                System.out.println("Please Contact wholesale department");
                addToCart();
                break;
            } else {
                cart.put(item, kg);
                printCart();
                shopping();
            }
        }while (flag) ;
    }

}