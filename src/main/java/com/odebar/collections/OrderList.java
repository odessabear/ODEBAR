package com.odebar.collections;

import com.odebar.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private List<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<Order>();
    }

    public OrderList(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return List.copyOf(orders);
    }
}
