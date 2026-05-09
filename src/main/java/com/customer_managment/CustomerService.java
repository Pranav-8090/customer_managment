package com.customer_managment;

public class CustomerService {

    CustomerDAO dao = new CustomerDAO();

    public void save(Customer c) {
        dao.save(c);
    }

    public void displayAll() {
        dao.displayAll();
    }

    public void getById(int id) {
        dao.getById(id);
    }

    public void updateBalance(int id,
                              double balance) {

        dao.updateBalance(id, balance);
    }

    public void deleteCustomer(int id) {
        dao.deleteCustomer(id);
    }

    public void searchByEmail(String email) {
        dao.searchByEmail(email);
    }

    public void countCustomer() {
        dao.countCustomer();
    }

    public void averageBalance() {
        dao.averageBalance();
    }

    public void maxBalance() {
        dao.maxBalance();
    }
}