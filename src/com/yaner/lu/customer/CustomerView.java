package com.yaner.lu.customer;

import java.util.Scanner;

public class CustomerView {

    public static final String ADD_NEW_CUSTOMER = "---------Add New Customer---------";
    public static final String ADDING_COMPLETED = "---------Adding Completed---------\n";
    public static final String MODIFY_NEW_CUSTOMER = "---------Modify New Customer---------";
    public static final String EXIT_REMINDER = "Please enter customer id (Enter -1 to exit): ";
    public static final String MODIFICATION_COMPLETED = "---------Modification Completed---------\n";

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
        boolean loopFlag = true;
        do {
            customerView.enterMainMenu();
        } while (loopFlag = true);
    }

    Scanner scanner =new Scanner(System.in);
    CustomerList customerList = new CustomerList(10);
    boolean loopFlag = true;

    public void enterMainMenu() {
        System.out.println("---------Customer Information Management System---------\n");
        System.out.println("               1. Add a new customer");
        System.out.println("               2. Modify customer information");
        System.out.println("               3. Delete a customer");
        System.out.println("               4. Show customer list");
        System.out.println("               5. Exit\n");
        System.out.print("               Please enter your selection (1-5): ");
        int menuSelection = scanner.nextInt();
        // TODO
        switch (menuSelection) {
            case 1:
                addNewCustomer();
                break;
            case 2:
                modifyCustomer();
                break;
            case 3:
                deleteCustomer();
            case 4:
                listAllCustomers();
                break;
            case 5:

                if ()
                exitWithConfirmation();
                break;
        }

    }

    private void addNewCustomer() {
        System.out.println(ADD_NEW_CUSTOMER);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Gender: ");
        char gender = scanner.next().toLowerCase().charAt(0);
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Phone-Number: ");
        String phoneNumber = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.println(ADDING_COMPLETED);
        Customer customer = new Customer(name, gender, age, phoneNumber, email);
        customerList.addCustomer(customer);
    }

    // TODO 'press enter to skip'
    private void modifyCustomer() {
        System.out.println(MODIFY_NEW_CUSTOMER);
        System.out.print(EXIT_REMINDER); // TODO inappropriate name
        int customerId = scanner.nextInt() - 1;
        Customer customer = customerList.getCustomer(customerId);
        Customer modifiedCustomer = new Customer();
        String name = customer.getName();
        System.out.print("Name(" + name + "): ");
        modifiedCustomer.setName(scanner.next());
        char gender = customer.getGender();
        System.out.print("Gender(" + gender + "): ");
        modifiedCustomer.setGender(scanner.next().toLowerCase().charAt(0));
        int age = customer.getAge();
        System.out.print("Age(" + age + "): ");
        modifiedCustomer.setAge(scanner.nextInt());
        String phoneNumber = customer.getPhoneNumber();
        System.out.print("Phone-Number(" + phoneNumber + "): ");
        modifiedCustomer.setPhoneNumber(scanner.next());
        String email = customer.getEmail();
        System.out.print("Email(" + email + "): ");
        modifiedCustomer.setEmail(scanner.next());
        customerList.replaceCustomer(customerId, modifiedCustomer);
        System.out.println(MODIFICATION_COMPLETED);
    }

    private void deleteCustomer() {

    }

    private void listAllCustomers() {
        System.out.println("---------Customer List---------");
        System.out.println("ID\tName\tGender\tAge\tPhone-Number\tEmail");
        for (int i = 0; i < customerList.getAllCustomers().length; i++) {
            Customer customer = customerList.getCustomer(i);
            int id = i + 1;
            System.out.println(id + "\t"
                    + customer.getName() + "\t"
                    + customer.getGender() + "\t\t"
                    + customer.getAge() + "\t"
                    + customer.getPhoneNumber() + "\t\t"
                    + customer.getEmail());
        }
        System.out.println("---------End---------\n");
    }

    private void exitWithConfirmation() {
        System.out.print("Do you want to exit? (Y/N): ");
        char response = getConfirmation();
        if (response == 'y') {
            loopFlag = false;
        } else if (response == 'n') {
            continue;
        } else System.out.println("Invalid input, please enter 'Y' or 'N'.");
    }

    private char getConfirmation() {
        return scanner.next().toLowerCase().charAt(0);
    }
}
