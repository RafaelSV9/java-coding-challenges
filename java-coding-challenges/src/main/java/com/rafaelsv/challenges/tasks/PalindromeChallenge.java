package com.rafaelsv.challenges.tasks;

import java.util.Scanner;

public class PalindromeChallenge implements CodingChallenge {

    private final Scanner scanner;

    public PalindromeChallenge(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Desafio 3: Palíndromo ---");
        System.out.print("Digite uma palavra ou frase: ");
        String text = scanner.nextLine();

        if (isPalindrome(text)) {
            System.out.printf(""%s" é um palíndromo.%n", text);
        } else {
            System.out.printf(""%s" NÃO é um palíndromo.%n", text);
        }
    }

    private boolean isPalindrome(String text) {
        String normalized = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = normalized.length() - 1;
        while (i < j) {
            if (normalized.charAt(i) != normalized.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return !normalized.isEmpty();
    }
}
