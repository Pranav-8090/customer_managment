package com.customer_managment;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CustomerController controller =
                new CustomerController();

        while (true) {
        	System.out.println("............................................................................................");
            System.out.println("\n1.Add");
            System.out.println("2.Display");
            System.out.println("3.Get By ID");
            System.out.println("4.Update Balance");
            System.out.println("5.Delete");
            System.out.println("6.Search Email");
            System.out.println("7.Count");
            System.out.println("8.Average Balance");
            System.out.println("9.Max Balance");
            System.out.println("10.Exit");
            System.out.println("\n...............................................................................................");

            int ch = sc.nextInt();

            switch (ch) {

            case 1:

                System.out.println(
                        "Enter cid,name,age,email,balance");

                Customer c = new Customer(
                        sc.nextInt(),
                        sc.next(),
                        sc.nextInt(),
                        sc.next(),
                        sc.nextDouble()
                );

                controller.save(c);

                break;

                case 2:

                    controller.displayAll();

                    break;

                case 3:

                    System.out.println("Enter ID");

                    controller.getById(sc.nextInt());

                    break;

                case 4:

                    System.out.println("Enter ID");

                    int id = sc.nextInt();

                    System.out.println("Enter Balance");

                    double bal = sc.nextDouble();

                    controller.updateBalance(id, bal);

                    break;

                case 5:

                    System.out.println("Enter ID");

                    controller.deleteCustomer(sc.nextInt());

                    break;

                case 6:

                    System.out.println("Enter Email");

                    controller.searchByEmail(sc.next());

                    break;

                case 7:

                    controller.countCustomer();

                    break;

                case 8:

                    controller.averageBalance();

                    break;

                case 9:

                    controller.maxBalance();

                    break;

                case 10:

                    System.exit(0);
            }
        }
    }
}