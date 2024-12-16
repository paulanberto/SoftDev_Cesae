import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class ex01arraylist {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();


    public static void main(String[] args) {


        //O Euromilhões é um jogo de sorte ou azar no qual o jogador deve preencher uma chave composta por 5 números de 1 a 50 e 2 estrelas (números) de 1 a 12.
        // Crie uma aplicação que permita ao utilizador:
        //1. Simular um sorteio (sortear uma chave vencedora que deve ser apresentada ao utilizador de forma ordenada).
        //2. Criar um boletim com 1 a 5 chaves (inseridas pelo utilizador) e comparar com a chave vencedora desse sorteio.
        //3. Criar um boletim com 1 a 5 chaves (criadas aleatoriamente) e comparar com a chave vencedora desse sorteio.
        //4. Simular quantas vezes seria necessário jogar (sempre com a mesma chave) de forma a conseguir ganhar o 1o
        //prémio (5 números e 2 estrelas).
        //Informação extra: https://www.jogossantacasa.pt/web/SCCartazResult/


        int op;
        do {

            System.out.println("\n" + "Bem vindo (a), vamos jogar?");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Sorteio");
            System.out.println("2-Apostar");
            System.out.println("3-Comprar jogo pronto");
            System.out.println("4-Simulação");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            } else if (op == 2) {
                Apostar();
            } else if (op == 1) {
                Sorteio();
            } else if (op == 3) {
                ComprarJogo();
            } else if (op == 4) {
                Simulcao();
            } else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }

    private static void Simulcao() {
    }

    private static void ComprarJogo() {
        ArrayList<ArrayList<Integer>> numerosRandom = new ArrayList<>();
        ArrayList<ArrayList<Integer>> estrelasRandom = new ArrayList<>();
        ArrayList<Integer> numero;
        ArrayList<Integer> estrela;


        System.out.println("Quantas apostas você quer fazer?");
        int numApostas = in.nextInt();


        if (numApostas >= 1 && numApostas <= 5) {
            for (int i = 0; i < numApostas; i++) {
                numero = new ArrayList<>();
                estrela = new ArrayList<>();

                while (numero.size() < 5) {
                    int num = rnd.nextInt(1, 51);

                    if (!numero.contains(num)) {
                        numero.add(num);
                    }
                }
                while (estrela.size() < 2) {
                    int star = rnd.nextInt(1, 13);

                    if (!estrela.contains(star)) {
                        estrela.add(star);
                    }
                }
                numerosRandom.add(numero);
                estrelasRandom.add(estrela);

                 System.out.println("A sua " + (i+1)  + "ª aposta é  " + "\t");                                  
                 System.out.println("Números: " + numerosRandom.get(i) + "  Estrelas: " + estrelasRandom.get(i));

            }
                 Sorteio(); 
        }

    }

    private static void Sorteio() {
        ArrayList<Integer> numeroSorteados = new ArrayList<>();
        ArrayList<Integer> estrelasSorteados = new ArrayList<>();


        while (numeroSorteados.size() < 5) {
            int numero = rnd.nextInt(1, 51);

            if (!numeroSorteados.contains(numero)) {
                numeroSorteados.add(numero);
            }
        }
        while (estrelasSorteados.size() < 2) {
            int estrela = rnd.nextInt(1, 13);

            if (!estrelasSorteados.contains(estrela)) {
                estrelasSorteados.add(estrela);
            }
        }

        Collections.sort(estrelasSorteados);
        Collections.sort(numeroSorteados);
        System.out.println("Os números sorteados são: ");
        System.out.println("Números: " + numeroSorteados + "  Estrelas: " + estrelasSorteados);


    }


    private static void Apostar() {


        ArrayList<ArrayList<Integer>> numeroSolicitados = new ArrayList<>();
        ArrayList<ArrayList<Integer>> estrelasSolicitadas = new ArrayList<>();
        ArrayList<Integer> numero;
        ArrayList<Integer> estrela;
        int i;

        System.out.println("Quantas apostas você quer fazer?");
        int numApostas = in.nextInt();


        if (numApostas >= 1 && numApostas <= 5) {
            for (i = 0; i < numApostas; i++) {
                numero = new ArrayList<>();
                estrela = new ArrayList<>();

                while (numero.size() < 5) {
                    System.out.println("\n" + "Digite 5 números entre 1 e 50:");
                    int num = in.nextInt();

                    if (num < 1 || num > 50) {
                        System.out.println("Digite um número válido entre 1 e 50");
                        continue;
                    }

                    if (!numero.contains(num)) {
                        numero.add(num);
                    } else {
                        System.out.println("\n" + "Número repetido. Digite um novo número entre 1 e 50: ");
                    }
                }
                while (estrela.size() < 2) {
                    System.out.println("\n" + "Digite 2 números entre 1 e 12: ");
                    int star = in.nextInt();

                    if (star < 1 || star > 12) {
                        System.out.println("Digite um número válido entre 1 e 12");
                        continue;
                    }
                    if (!estrela.contains(star)) {
                        estrela.add(star);
                    } else {
                        System.out.println("\n" + "Número repetido. Digite um novo número entre 1 e 12:");
                    }
                }

                Collections.sort(numero);
                Collections.sort(estrela);
                numeroSolicitados.add(numero);
                estrelasSolicitadas.add(estrela);

                System.out.println("A sua " + (i+1)  + "ª aposta é  " + "\t");
                System.out.println("Números: " + numeroSolicitados.get(i) + "  Estrelas: " + estrelasSolicitadas.get(i));

            }
                Sorteio();

        }
    }
}


