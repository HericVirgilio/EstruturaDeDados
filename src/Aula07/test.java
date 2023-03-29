package Aula07;
import java.util.LinkedList;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        LinkedList <String> lista = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome: ");
        lista.add(sc.next());
        System.out.println("Qual é sua idade: ");
        lista.add(sc.next());
        System.out.println("Você assistiu o novo filme do John Wick? ( yes/no )");
        lista.add(sc.next());
        System.out.println("Os elementos digitados foram" + lista);
        boolean sair = true;
        while(sair){
            int res;
            System.out.println("---------- CONTROLES -----------");
            System.out.println("Para remover o ultimo item digitado tecle: 0");
            System.out.println("Para encerrar o pragrama digite: 1");
            res = sc.nextInt();
            if(lista.size() != 0){
                if (res == 0){
                    System.out.println("Removendo resposta: " + lista.getLast());
                    lista.removeLast();
                }
            }else {
                System.out.println("Lista vazia finalizando pragrama....");
                sair = false;
            }
            if(res == 1){
                sair = false;
            }
        }
        boolean listaVazia = true;
        System.out.println("Tamanho da lista: " + lista.size());
        if (lista.size() != 0){
            listaVazia = false;
        }
        System.out.println("Lista está vazia? Respsota = " + listaVazia);
        if (lista.size() != 0){
            System.out.println("Valor do último elemento da lista: " + lista.getLast());
        }
    }
}
