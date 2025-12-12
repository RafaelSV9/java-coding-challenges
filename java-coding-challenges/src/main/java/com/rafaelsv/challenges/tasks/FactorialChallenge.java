package com.rafaelsv.challenges.tasks;

import java.util.Scanner;

public class FactorialChallenge implements CodingChallenge {

    private final Scanner scanner;

    public FactorialChallenge(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Desafio 2: Fatorial ---");
        System.out.print("Informe um número inteiro não negativo (0 a 20): ");
        int n = readBoundedInt(0, 20);

        long result = factorial(n);
        System.out.printf("%d! = %d%n", n, result);
    }

    private int readBoundedInt(int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value < min || value > max) {
                    System.out.printf("Digite um inteiro entre %d e %d: ", min, max);
                } else {
                    return value;
                }
            } catch (NumberFormatException e) {
                System.out.printf("Valor inválido. Digite um inteiro entre %d e %d: ", min, max);
            }
        }
    }

    private long factorial(int n) {
        long result = 1L;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
