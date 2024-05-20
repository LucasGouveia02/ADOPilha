package org.example;

import org.example.lista.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        Scanner scanner = new Scanner(System.in);

        boolean exibicao = true;
        do {
            System.out.println("""
                    1 - Inserir
                    2 - Remover
                    3 - Exibir
                    4 - Tamanho da Pilha
                    5 - Sair
                    """);

            int escolha = 0;
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
            } else {
                System.out.println("O valor inserido não é um inteiro.");
                scanner.nextLine();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor a ser inserido: ");
                    int valor = 0;
                    if (scanner.hasNextInt()) {
                        valor = scanner.nextInt();
                        lista.push(valor);
                    } else {
                        System.out.println("O valor inserido não é um inteiro.");
                        scanner.nextLine();
                    }
                    System.out.println("Tamanho da pilha: " + lista.size());
                    break;
                case 2:
                    lista.pop();
                    System.out.println("Valor removido!");
                    break;
                case 3:
                    lista.exibir();
                    System.out.println("Tamanho da pilha: " + lista.size());
                    break;
                case 4:
                    System.out.println("Tamanho da pilha: " + lista.size());
                    break;
                case 5:
                    exibicao = false;
                    break;
                default:
                    System.out.println("Opção incorreta!");
            }
        } while (exibicao);
    }
}