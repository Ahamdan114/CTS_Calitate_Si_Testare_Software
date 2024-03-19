package cts.seminar_3;

import java.util.ArrayList;

public class User
{
    private String name;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> customers;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;
        this.orders = new ArrayList<Order>();
        this.customers = new ArrayList<Order>();
    }

    public void addOrder(Order order)
    {
        this.orders.add(order);
    }

    public void addCustomer(Order customer)
    {
        this.customers.add(customer);
    }
}
