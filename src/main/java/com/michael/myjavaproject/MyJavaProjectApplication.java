package com.michael.myjavaproject;

import com.michael.myjavaproject.customer.Customer;
import com.michael.myjavaproject.customer.CustomersLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class MyJavaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJavaProjectApplication.class, args);

        //These are the main actions a customer can perform on the Home Page.
        System.out.println("Hey Investor! What would you like to do today?");
        System.out.println("1. Create New Account");
        System.out.println("2. Login");

        //Instantiate a scanner class to accept user input.
        Scanner scanner = new Scanner(System.in);

        List<Customer> customers = new ArrayList<>();

        int customerActions = scanner.nextInt();
        switch (customerActions) {
            case 1:
                CustomersLogic.createNewAccount(scanner);
                break;
            case 2:
                CustomersLogic.login(scanner);
                break;
            default:
                System.out.println("What the hell just happened!?");
                break;
        }

        System.out.println("Please enter your first name.");
        Customer cus1 = new Customer();
        customers.add(cus1);
        cus1.setFirstName(scanner.nextLine());

        scanner.close();
        System.out.println(customers);
        System.out.println(cus1);

    }


}
