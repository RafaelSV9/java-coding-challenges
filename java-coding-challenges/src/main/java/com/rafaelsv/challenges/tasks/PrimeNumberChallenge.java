package com.rafaelsv.challenges.tasks;

import java.util.Scanner;

public class PrimeNumberChallenge implements CodingChallenge {

    private final Scanner scanner;

    public PrimeNumberChallenge(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Desafio 1: Número Primo ---");
        System.out.print("Informe um número inteiro positivo: ");
        int n = readPositiveInt();

        if (isPrime(n)) {
            System.out.printf("%d é um número primo.%n", n);
        } else {
            System.out.printf("%d NÃO é um número primo.%n", n);
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

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
