package PROJELER.KutuphaneDenemesi.FATİH_BEY_GROCERY_PROJECT;

public class Runner2 {
    public static void main(String[] args) {


        Grocery shop2 = new shop();
        shop2.product.put(1, "Apple");
        shop2.product.put(2, "Grape");
        shop2.product.put(3, "Cucumber");
        shop2.product.put(4, "Tomato");
        shop2.product.put(5, "Watermelon");

        shop2.productPrice.put("Apple", 10.50);
        shop2.productPrice.put("Grape", 20.00);
        shop2.productPrice.put("Cucumber", 20.25);
        shop2.productPrice.put("Tomato", 8.50);
        shop2.productPrice.put("Watermelon", 5.50);

        shop2.shopName = "İLKER";


        System.out.println("Welcome to " + shop2.shopName +"Grocery. Select Options:");
        shop2.shopping();


    }
}
