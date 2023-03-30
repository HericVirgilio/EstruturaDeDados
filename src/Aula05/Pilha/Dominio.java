package Aula05.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Dominio {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        Stack pilhaImpar = new Stack();
        Stack pilhaPar = new Stack();
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + " -Digite um numero");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("O numero digitado foi 0");
                if (pilhaPar.empty() || pilhaImpar.empty()) {
                    System.out.println("----------- Erro -----------\n uma das pilhas esta vazia");
                } else {
                    System.out.println("Removendo número da pilha IMPAR e Par..." + " retirado da pilha Par o número" +
                            " \n" +
                            pilhaPar.pop() + " retirado da pilha IMPAR o número " + pilhaImpar.pop());
                }
            } else if (num % 2 == 0) {
                System.out.println("Inserindo número na pilhaPar: " + pilhaPar.push(num));
            } else {
                System.out.println("Inserindo número na pilhaImpar: " + pilhaImpar.push(num));
            }
        }
        int  pilhaParSize = pilhaPar.size();
        int  pilhaImparSiza = pilhaImpar.size();
        for (int i = 0; i < pilhaParSize; i++) {
            System.out.println("Retirando elementos da pilha PAR: " + pilhaPar.pop());
        }
        for (int i = 0; i < pilhaImparSiza; i++) {
            System.out.println("Retirando elementos da pilha IMPAR: " + pilhaImpar.pop());
        }
    }
}
