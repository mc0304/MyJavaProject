package com.michael.myjavaproject.customer;

import com.michael.myjavaproject.accounts.BrokerageAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomersLogic extends Customer {

    public static List<BrokerageAccount> accountList = new ArrayList<>();

    public static List<Customer> customerList = new ArrayList<>();

    public static void createNewAccount(Scanner scanner) {

        System.out.println("1. Enter Full Name");
        setFirstName(scanner.nextLine());
    }

    public static void login(Scanner scanner) {

        System.out.println("Coming Soon");
    }
}
