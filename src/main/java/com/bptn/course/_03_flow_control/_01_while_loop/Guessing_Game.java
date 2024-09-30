package com.bptn.course._03_flow_control._01_while_loop;

import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int targetNumber = 23;
        int guess = 0; // Initialize to a value outside the valid range

        System.out.println("Guess a number between 1 and 100:");

        while (guess != targetNumber) {
            guess = scanner.nextInt(); // Take user input

            if (guess < 1 || guess > 100) {
                System.out.println("Please select a number between 1 and 100.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the right number.");
                break;
            }
        }
        scanner.close();

	}

}
