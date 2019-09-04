package com.company;


import discount.DefaultCalculator;
import discount.FridayCalculator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean isAfterEight = false; // no Discount, mo ,di ,wo ,do ,za 50%
        boolean isFriday =  true; // 50 %
        boolean isMonday = true; //



        Product butter = new Butter(1.00);
        Product appleSyrup = new AppleSyrup(2.00);
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(appleSyrup);



            discount.Calculator calc = new discount.DefaultCalculator();
            if(isFriday){
                calc = new FridayCalculator();
            } else{
                calc = new DefaultCalculator();
            }
            double discount = 0;
//            if(isFriday){
//                discount = 0;
//            } else {
//                discount = (isAfterEight) ?  0.0 : calc.getTotalDiscount(cart);
//            }
//        if(isMonday){
//            discount += cart.getAll(cart);
//        }


            System.out.println("Total Discount: " + discount);


        // AppleSyrup.get_Omschrijving();
    }
}
