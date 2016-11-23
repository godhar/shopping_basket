package com.example.user.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 23/11/2016.
 */

public class TheShoppingBasket implements Discountable {

    Customer customer;
    ArrayList<Item> basket;
    float total;

    public TheShoppingBasket(Customer customer){
        this.basket = new ArrayList<Item>();
        this.customer = customer;
        this.total = 0;

    }

    public boolean customerHasLoyaltyCard(){
        return this.customer.hasLoyaltyCard();
    }

    public void addItem(Item item){
        basket.add(item);
    }

    public int getTotalItems(){
        return basket.size();
    }

    public float getBasketSum(){
        for(Item basketItems : basket){
            total += basketItems.getPrice();
        }
        return total;
    }

    public void removeItem(Item item){
        for(Item thingy : basket){
            if(thingy.equals(item)){
                basket.remove(thingy);
            }
        }
    }

    public void checkBasketForDiscount(){
        if(total >= 20.00f){
            makeDiscount();
        }
    }

    public void makeDiscount(){
        total -= (total * 0.1f);
    }




}
