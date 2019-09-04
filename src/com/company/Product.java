package com.company;

public class Product {
    private double _Prijs;
    private String _Omschrijving;


    public Product(double price, String name){
        this._Prijs = price;
        this._Omschrijving = name;
    }


    public double get_Prijs() {
        return _Prijs;
    }

    public String get_Omschrijving(){
        return this._Omschrijving;
    }

}
