package com.customer_managment;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    private int cid;

    private String name;
    private int age;
    private String email;
    private double balance;

    public Customer() {
    }

    public Customer(int cid, String name,
                    int age, String email,
                    double balance) {

        this.cid = cid;
        this.name = name;
        this.age = age;
        this.email = email;
        this.balance = balance;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", email=" + email + ", balance=" + balance
				+ "]";
	}
    
}