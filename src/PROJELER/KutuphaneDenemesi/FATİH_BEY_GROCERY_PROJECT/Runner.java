package PROJELER.KutuphaneDenemesi.FATİH_BEY_GROCERY_PROJECT;



public class Runner{
    public static void main(String[] args) {

        Grocery ilker=new shop();
        ilker.product.put(1, "Apple");
        ilker.product.put(2, "Grape");
        ilker.product.put(3, "Cucumber");
        ilker.product.put(4, "Tomato");
        ilker.product.put(5, "Watermelon");

        ilker.productPrice.put("Apple", 10.50);
        ilker.productPrice.put("Grape", 20.00);
        ilker.productPrice.put("Cucumber", 20.25);
        ilker.productPrice.put("Tomato", 8.50);
        ilker.productPrice.put("Watermelon", 5.50);

        ilker.shopName="ILKER";

        ilker.shopping();

    }




}
