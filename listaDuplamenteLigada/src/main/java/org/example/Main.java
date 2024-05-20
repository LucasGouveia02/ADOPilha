package org.example;

import org.example.lista.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Lista lista = new Lista();

        Scanner scanner = new Scanner(System.in);

        boolean exibicao = true;
        do {
            System.out.print("1 - Inserir\n" +
                    "2 - Remover\n" +
                    "3 - Exibir\n" +
                    "4 - Tamanho da Pilha\n" +
                    "5 - Sair\n" +
                    "Opção: ");

            int escolha = 0;
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
            } else {
                System.out.println("O valor inserido não é um inteiro.");
                scanner.nextLine();
            }

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser inserido: ");
                    int valor = 0;
                    if (scanner.hasNextInt()) {
                        valor = scanner.nextInt();
                        lista.push(valor);
                        System.out.println(valor + " inserido!");
                    } else {
                        System.out.println("O valor inserido não é um inteiro. \n");
                        scanner.nextLine();
                    }
                    System.out.println("Tamanho da pilha: " + lista.size() + "\n");
                    break;
                case 2:
                    if (lista.pop()){
                        System.out.println("Valor removido!");
                    } else {
                        System.out.println("Pilha vazia!");
                    }
                    System.out.println("Tamanho da pilha: " + lista.size() + "\n");
                    break;
                case 3:
                    System.out.println("Elementos da pilha:");
                    lista.exibir();
                    System.out.println("Tamanho da pilha: " + lista.size() + "\n");
                    break;
                case 4:
                    System.out.println("Tamanho da pilha: " + lista.size() + "\n");
                    break;
                case 5:
                    exibicao = false;
                    break;
                default:
                    System.out.println("Opção incorreta! \n");
            }
        } while (exibicao);
    }
}