/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromechecker2;

/**
 *
 * @author Nombulelo
 */

import java.util.Scanner;

public class PalindromeChecker2 {

    public static void main(String[] args) {
            
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Welcome to the Palindrome checker ");
        System.out.print("\nEnter your favourite numbber: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("Yes, " + number + " is a palindrome!");
            System.out.println("Congratulations, you've found a numerical palindrome!");
        } else {
            System.out.println("No, " + number + " is not a palindrome.");
            System.out.println("Keep exploring for numerical palindromes!");
        }
        scanner.close();
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }

        return originalNumber == reversedNumber;

    }
}
