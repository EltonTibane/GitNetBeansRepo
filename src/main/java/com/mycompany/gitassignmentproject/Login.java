/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitassignmentproject;


import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // Hardcoded credentials
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt user for username and password
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Check credentials
        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
