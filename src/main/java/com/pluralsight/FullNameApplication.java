package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = myScanner.nextLine();
        firstName = firstName.trim();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();
        lastName = lastName.trim();

        String fullName;

        System.out.print("Middle name (to skip press Enter↵): ");
        String middleName = myScanner.nextLine();
        middleName = middleName.trim();
        int lengthMiddleName = middleName.length();

        if (lengthMiddleName == 0) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }

        System.out.print("Suffix (ex. Jr, PhD - to skip press Enter↵): ");
        String suffix = myScanner.nextLine();
        suffix = suffix.trim();
        int lengthSuffix = suffix.length();

        if (lengthSuffix != 0) {
            fullName = fullName + ", " + suffix;
        }

        System.out.println("\nGenerated full name: " + fullName);
    }
}
