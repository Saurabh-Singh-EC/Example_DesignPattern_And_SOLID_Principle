package com.codeWithSrb.DesignPattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

    List<Item> items = new ArrayList<>();

    public ShopingCart(List<Item> items) {
        this.items = items;
    }

    public void addItemToCart(Item item) {
        items.add(item);
    }

    public void removeItemFromCart(Item item) {
        items.remove(item);
    }

    public int calculateItemsPrice() {
        return items.stream().mapToInt(Item::getItemsCost).sum();
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int totalSum = calculateItemsPrice();
        paymentStrategy.pay(totalSum);
    }
}