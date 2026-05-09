package com.customer_managment;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CustomerDAO {

    // SAVE
    public void save(Customer c) {

        Session session =
                HibernateConfig.getFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        session.save(c);

        tx.commit();
        session.close();

        System.out.println("Customer Added");
    }

    // DISPLAY
    public void displayAll() {

        Session session =
                HibernateConfig.getFactory().openSession();

        Query<Customer> q =
                session.createQuery(
                        "from Customer",
                        Customer.class);

        List<Customer> list = q.list();

        list.forEach(System.out::println);

        session.close();
    }

    // GET BY ID
    public void getById(int id) {

        Session session =
                HibernateConfig.getFactory().openSession();

        Customer c =
                session.get(Customer.class, id);

        System.out.println(c);

        session.close();
    }

    // UPDATE BALANCE
    public void updateBalance(int id,
                              double balance) {

        Session session =
                HibernateConfig.getFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        Customer c =
                session.get(Customer.class, id);

        if (c != null) {

            c.setBalance(balance);

            session.update(c);

            System.out.println("Updated");
        }

        tx.commit();
        session.close();
    }

    // DELETE
    public void deleteCustomer(int id) {

        Session session =
                HibernateConfig.getFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        Customer c =
                session.get(Customer.class, id);

        if (c != null) {

            session.delete(c);

            System.out.println("Deleted");
        }

        tx.commit();
        session.close();
    }

    // SEARCH EMAIL
    public void searchByEmail(String email) {

        Session session =
                HibernateConfig.getFactory().openSession();

        Query<Customer> q =
                session.createQuery(
                        "from Customer where email=:e",
                        Customer.class);

        q.setParameter("e", email);

        q.list().forEach(System.out::println);

        session.close();
    }

    // COUNT
    public void countCustomer() {

        Session session =
                HibernateConfig.getFactory().openSession();

        Query<Long> q =
                session.createQuery(
                        "select count(*) from Customer",
                        Long.class);

        System.out.println(
                "Total Customers = "
                        + q.uniqueResult());

        session.close();
    }

    // AVG BALANCE
    public void averageBalance() {

        Session session =
                HibernateConfig.getFactory().openSession();

        Query<Double> q =
                session.createQuery(
                        "select avg(balance) from Customer",
                        Double.class);

        System.out.println(
                "Average Balance = "
                        + q.uniqueResult());

        session.close();
    }

    // MAX BALANCE
    public void maxBalance() {

        Session session =
                HibernateConfig.getFactory().openSession();

        Query<Double> q =
                session.createQuery(
                        "select max(balance) from Customer",
                        Double.class);

        System.out.println(
                "Max Balance = "
                        + q.uniqueResult());

        session.close();
    }
}