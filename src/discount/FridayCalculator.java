package discount;

import com.company.Product;
import com.company.ShoppingCart;

public class FridayCalculator extends Calculator{

    @Override
    public double getTotalDiscount(ShoppingCart calc) {
        double totalPrice = 0;

        for (Product p : calc.getAll())
            totalPrice += p.get_Prijs();


        return totalPrice * 5;
    }
}
