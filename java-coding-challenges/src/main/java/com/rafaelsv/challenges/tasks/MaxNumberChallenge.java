package com.rafaelsv.challenges.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumberChallenge implements CodingChallenge {

    private final Scanner scanner;

    public MaxNumberChallenge(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("\n--- Desafio 5: Maior Número da Lista ---");
        System.out.println("Digite números separados por espaço (ex: 10 5 8 20).");
        System.out.print("Entrada: ");
        String line = scanner.nextLine();

        List<Double> numbers = parseNumbers(line);
        if (numbers.isEmpty()) {
            System.out.println("Nenhum número válido foi informado.");
            return;
        }

        double max = numbers.get(0);
        for (double value : numbers) {
            if (value > max) {
                max = value;
            }
        }

        System.out.println("Números lidos: " + numbers);
        System.out.println("Maior número: " + max);
    }

    private List<Double> parseNumbers(String line) {
        List<Double> numbers = new ArrayList<>();
        String[] parts = line.trim().split("\s+");
        for (String part : parts) {
            try {
                if (!part.isBlank()) {
                    numbers.add(Double.parseDouble(part));
                }
            } catch (NumberFormatException e) {
                System.out.printf("Aviso: '%s' não é um número válido e será ignorado.%n", part);
            }
        }
        return numbers;
    }
}
