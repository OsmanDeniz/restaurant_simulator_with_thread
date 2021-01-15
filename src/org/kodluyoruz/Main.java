package org.kodluyoruz;

import com.deniz.Entities.Customer;
import com.deniz.Entities.Desk;
import com.deniz.Entities.Waiter;
import com.deniz.Manager.CustomerManager;

public class Main {

    public static void main(String[] args) {
        // =============== CUSTOMER ===================
        Customer c1 = new Customer(1);
        // =============== DESKS ===================
        Desk[] desks = {new Desk("Masa1"), new Desk("Masa2"), new Desk("Masa3"), new Desk("Masa4"), new Desk("Masa5")};
        // =============== WAITER ===================
        Waiter[] waiters = {new Waiter("Garson1"), new Waiter("Garson2"), new Waiter("Garson3")};
        // =============== SETTINGS ===================
        CustomerManager manager = new CustomerManager(desks, waiters);

        manager.start();
        try {
            manager.join();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }


    }
}
