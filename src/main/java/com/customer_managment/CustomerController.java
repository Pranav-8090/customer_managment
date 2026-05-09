package com.customer_managment;



public class CustomerController {

    CustomerService service =
            new CustomerService();

    public void save(Customer c) {
        service.save(c);
    }

    public void displayAll() {
        service.displayAll();
    }

    public void getById(int id) {
        service.getById(id);
    }

    public void updateBalance(int id,
                              double balance) {

        service.updateBalance(id, balance);
    }

    public void deleteCustomer(int id) {
        service.deleteCustomer(id);
    }

    public void searchByEmail(String email) {
        service.searchByEmail(email);
    }

    public void countCustomer() {
        service.countCustomer();
    }

    public void averageBalance() {
        service.averageBalance();
    }

    public void maxBalance() {
        service.maxBalance();
    }
}