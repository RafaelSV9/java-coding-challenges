package com.rafaelsv.challenges.menu;

import com.rafaelsv.challenges.tasks.FactorialChallenge;
import com.rafaelsv.challenges.tasks.FizzBuzzChallenge;
import com.rafaelsv.challenges.tasks.MaxNumberChallenge;
import com.rafaelsv.challenges.tasks.PalindromeChallenge;
import com.rafaelsv.challenges.tasks.PrimeNumberChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Scanner scanner;

    public MainMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            printHeader();
            printOptions();
            option = readInt("Escolha uma opção: ");

            switch (option) {
                case 1 -> new PrimeNumberChallenge(scanner).run();
                case 2 -> new FactorialChallenge(scanner).run();
                case 3 -> new PalindromeChallenge(scanner).run();
                case 4 -> new FizzBuzzChallenge(scanner).run();
                case 5 -> new MaxNumberChallenge(scanner).run();
                case 0 -> System.out.println("\nEncerrando o programa. Até mais! 👋");
                default -> System.out.println("\nOpção inválida. Tente novamente.\n");
            }

            if (option != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
            }

        } while (option != 0);
    }

    private void printHeader() {
        System.out.println("======================================");
        System.out.println("         JAVA CODING CHALLENGES");
        System.out.println("======================================");
    }

    private void printOptions() {
        System.out.println("1 - Verificar se um número é primo");
        System.out.println("2 - Calcular fatorial de um número");
        System.out.println("3 - Verificar se uma palavra é palíndromo");
        System.out.println("4 - FizzBuzz até N");
        System.out.println("5 - Encontrar o maior número de uma lista");
        System.out.println("0 - Sair");
        System.out.println("--------------------------------------");
    }

    private int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = scanner.nextInt();
                scanner.nextLine(); // consume newline
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
                scanner.nextLine(); // clear buffer
            }
        }
    }
}
