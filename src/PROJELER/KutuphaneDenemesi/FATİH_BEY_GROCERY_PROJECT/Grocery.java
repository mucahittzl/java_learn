package PROJELER.KutuphaneDenemesi.FATİH_BEY_GROCERY_PROJECT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Grocery {

    public String shopName;
         Scanner input = new Scanner(System.in);
         Map<Integer, Integer> cart = new HashMap<>();
         Map<String, Double> productPrice = new HashMap<>();
         Map<Integer, String> product = new HashMap<>();
         double sum=0;
         boolean flag = true;

 public void printProduct() {
  for (int i = 1; i <= product.size(); i++) {
   System.out.println(i + " : " + product.get(i) + " " + productPrice.get(product.get(i)));
  }
 }

 public void printCart() {
  sum=0;
  for ( Integer i : cart.keySet()) {
   System.out.println(i + " : " + product.get(i) + " " +cart.get(i) + " KG " +  (cart.get(i) * productPrice.get(product.get(i)))+ " TL");
   sum= sum+ (cart.get(i) * productPrice.get(product.get(i)));
  }
  System.out.println("Total Price : " + sum + " TL");
 }

 public void shopping() {
 }


}