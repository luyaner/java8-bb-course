package com.yaner.lu.recorder;

import com.yaner.lu.recorder.util.Utility;

public class FamilyAccountRecorder {

    public static final String INCOME_AMOUNT = "Income Amount: ";
    public static final String INCOME_DESCRIPTION = "Income Description: ";
    public static final String SPENDING_AMOUNT = "Spending Amount: ";
    public static final String SPENDING_DESCRIPTION = "Spending Description: ";
    public static final String EXIT_CONFIRMATION = "Are you sure you want to exit? (Y/N): ";
    public static final char Y = 'y';
    public static final char N = 'n';
    public static final String INVALID_INPUT = "Invalid Input!";

    public static void main(String[] args) {

        boolean loopFlag = true;
        int accountBalance = 10000;
        String accountDetails = "Item\t\tBalance\t\tAmount\t\tDescription\n";

        do {
            printMenu();

            int selectionNumber = Utility.readSelectionNumber();
            int incomeAmount;
            String incomeDescription;
            int spendingAmount;
            String spendingDescription;

            switch (selectionNumber) {
                case 1:
                    showAccountDetails(accountDetails);
                    break;
                case 2:
                    System.out.print(INCOME_AMOUNT);
                    incomeAmount = Utility.readNumber();
                    System.out.print(INCOME_DESCRIPTION);
                    incomeDescription = Utility.readString();
                    accountBalance += incomeAmount;
                    accountDetails += "Income\t\t"+accountBalance+"\t\t"+incomeAmount+"\t\t\t"+incomeDescription+"\n";
                    break;
                case 3:
                    System.out.print(SPENDING_AMOUNT);
                    spendingAmount = Utility.readNumber();
                    System.out.print(SPENDING_DESCRIPTION);
                    spendingDescription = Utility.readString();
                    accountBalance = accountBalance - spendingAmount;
                    accountDetails += "Spending\t"+accountBalance+"\t\t"+spendingAmount+"\t\t\t"+spendingDescription+"\n";
                    break;
                case 4:
                    char response = getConfirmationResponse();
                    if (response == Y) {
                        loopFlag = false;
                    } else if (response == N) {
                        continue;
                    } else System.out.println(INVALID_INPUT);
                    break;
            }

        } while (loopFlag);
    }

    private static char getConfirmationResponse() {
        System.out.print(EXIT_CONFIRMATION);
        return Utility.readString().toLowerCase().charAt(0);
    }

    private static void showAccountDetails(String accountDetails) {
        System.out.println("------------------Account Details------------------");
        System.out.println(accountDetails);
    }

    private static void printMenu() {
        System.out.println("\n------------------Family Account------------------");
        System.out.println("                1. Account Details");
        System.out.println("                2. Record Incomes");
        System.out.println("                3. Record Spending");
        System.out.println("                 4. Exit");
        System.out.print("\nPlease enter a number between 1 to 4: ");
    }
}
