package com.odebar.collections;

import com.odebar.entity.Order;

import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>() {
            {
                add(new Order(231, 12.));
                add(new Order(389, 2.9));
                add(new Order(747, 32.));
                add(new Order(517, 1.7));
                add(new Order(414, 17.));
            }
        };
        System.out.println(orders);
        float bigAmount = 10;
        int percent = 5;
//        Classical Iterator
//        OrderAction action = new OrderAction();
//        action.discountAction(bigAmount, orders, percent);

//        functional approach
        orders.removeIf(order -> order.getAmount() <= bigAmount);
        orders.forEach(order -> order.setAmount(order.getAmount() * (100 - percent) / 100.0));
        System.out.println(orders);

    }
}
