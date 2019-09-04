package com.company;

import java.util.ArrayList;
import java.util.Set;

public class ShoppingCart {
    private ArrayList<Product> _products;


    public ShoppingCart() {
        this._products = new ArrayList<Product>();
    }

    public void addToCart(Product product){
        this._products.add(product);
    }

    public Product[] getAll(){
        int size = this._products.size();
        return this._products.toArray(new Product[size]);
    }
}
