package com.rafaelsv.challenges.tasks;

import java.util.Scanner;

public class FizzBuzzChallenge implements CodingChallenge {

    private final Scanner scanner;

    public FizzBuzzChallenge(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Desafio 4: FizzBuzz ---");
        System.out.print("Gerar FizzBuzz até qual número? ");
        int n = readPositiveInt();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private int readPositiveInt() {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value <= 0) {
                    System.out.print("Digite um inteiro positivo: ");
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Digite um inteiro positivo: ");
            }
        }
    }
}
