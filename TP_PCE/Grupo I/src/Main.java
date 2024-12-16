/*import java.util.Random;
import java.util.Scanner;

public class Main {
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
            } /*else if (op == 2) {
                ComprarJogo();
            } else if (op == 1) {
                Sorteio();
            } else if (op == 3) {
                Simulcao();
            } else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }

    private static void Apostar() {
        System.out.println("Quantas apostas você quer fazer?");
        int numApostas = in.nextInt();
        int rodada = 0;
        int[] num = new int[5];
        int[] estrela = new int[2];
        int numPremPrinc = rnd.nextInt(1, 50);
        int numPremEst = rnd.nextInt(1, 12);

        while (rodada < numApostas) {
            System.out.println("\n" + "Digite 5 números entre 1 e 50:");

            // Preenchendo os números principais
            for (int i = 0; i <= num.length; i++) {
                boolean repetido = false;

                while (true) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    int numero = in.nextInt();

                    for (int i = 0; i < estrela.length; i++) {
                        while (true) {
                            System.out.print("Digite o número " + (i + 1) + ": ");
                            int numEstrela = in.nextInt();


                            if (numEstrela >= 1 && numEstrela <= 12) {
                                estrela[i] = numEstrela;
                                break;
                            } else {
                                System.out.println("Número inválido. Tente novamente (entre 1 e 12).");
                            }
                        }
                    }
                }
            }

            System.out.println("Digite 2 números entre 1 e 12:");

            for (int i = 0; i < estrela.length; i++) {
                while (true) {
                    System.out.print("Digite o número " + (i + 1) + ": ");
                    int numEstrela = in.nextInt();


                    if (numEstrela >= 1 && numEstrela <= 12) {
                        estrela[i] = numEstrela;
                        break;
                    } else {
                        System.out.println("Número inválido. Tente novamente (entre 1 e 12).");
                    }
                }
            }
            System.out.print("\nVocê digitou os seguintes números: ");
                    for (int i = 0; i < num.length; i++) {
                        System.out.print(num[i]);
                        if (i < num.length - 1) {
                            System.out.print(", ");
                        }
                    }
            System.out.print("\nVocê digitou as seguintes estrelas: ");
                    for (int i = 0; i < estrela.length; i++) {
                        System.out.print(estrela[i]);
                        if (i < estrela.length - 1) {
                            System.out.print(", ");
                        }
                    }

            rodada++;

        }


    }

    private static void ComprarJogo() {
        System.out.println("Quantos jogos você quer comprar?");
        int numApostas = in.nextInt();


    }

    private static void Sorteio() {
    }

    private static void Simulcao() {
    }




    private static void Lotaria() {



        int numPremio = rnd.nextInt(1000, 10000);


        System.out.println("Insira um número entre 1000 e 9999");
        int num = in.nextInt();

        while (num < 1000 || num > 9999) {
            System.out.println("Número Inválido. Insira novamente .");
            num = in.nextInt();
        }

        System.out.println("Número premiado: " + numPremio);

        // Verificação do 1º prêmio (número exato)
        if (numPremio == num) {
            System.out.println("Apostador com o número " + num + " ganhou o 1º prêmio!");
            saldoAtual = saldoInicial + 100;
        }
        // Verificação do 2º prêmio (últimos 3 dígitos)
        else if (numPremio % 1000 == num % 1000) {
            System.out.println("Apostador com o número " + num + " ganhou o 2º prêmio!");
            saldoAtual = saldoAtual + 75;
        }
        // Verificação do 3º prêmio (últimos 2 dígitos)
        else if (numPremio % 100 == num % 100) {
            System.out.println("Apostador com o número " + num + " ganhou o 3º prêmio!");
            saldoAtual = saldoAtual + 50;
        }
        else {
            System.out.println("Apostador com o número " + num + " não ganhou nenhum prêmio.");
        }
    }

    private static void Raspadinha() {

        if (saldoAtual < 2) {
            System.out.println("Você não possui saldo suficiente para jogar na Raspadinha. Efetue um depósito para continuar a jogar");
            return;

        }

        int op;
        do {
            System.out.println("Bem vindo");
            System.out.println("Seu saldo atual é: " + saldoAtual + "€");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Primeiro tipo");
            System.out.println("2-Segundo tipo");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            } else if (op == 1) {
                tipo1();
            } else if (op == 2) {
                tipo2();
            } else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }

    private static void tipo1() {
        int somaPremio = 0;
        int numAleatorio = 0;
        int valorPremio = 0;

        int numPrincipal = rnd.nextInt(1, 11);

        if (numPrincipal < 1 || numPrincipal > 10) {
            System.out.println("Número inválido");
            return;
        }

        System.out.println("Número principal: " + numPrincipal);
        for (int i = 1; i <= 5; i++) {
            numAleatorio = rnd.nextInt(1, 11);
            valorPremio = rnd.nextInt(1, 101);
        }

        System.out.println("Número: " + numAleatorio + " Prêmio: " + valorPremio + "€");
        if (numAleatorio == numPrincipal) {
            somaPremio += valorPremio;
            saldoAtual = saldoAtual + somaPremio;
        } else {
            saldoAtual = saldoAtual - 2;
        }
    }


    private static void tipo2() {
        int somaPremio = 0;

        int op;
        do {
            System.out.println("Bem vindo");
            System.out.println("Seu saldo atual é: " + saldoAtual + "€");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Jogar");
            System.out.println("0-Sair");
            op = in.nextInt();


            if (op != 1) {
                return;
            } else {
                int numUtilizador = rnd.nextInt(1, 11);
                System.out.println("O seu número é " + numUtilizador);
                int ValorPremio = rnd.nextInt(1, 11);
                System.out.println("O valor do prémio é " + ValorPremio + "€");
                System.out.println("************");

                int contador = 0;

                for (int i = 0; i < 9; i++) {
                    int num = rnd.nextInt(1, 11);
                    System.out.println(num);
                    if (numUtilizador == num) {
                        contador++;
                    }

                }
                System.out.println("************");
                if (contador >= 3) {
                    System.out.println("Ganhou " + ValorPremio + "€");
                    saldoAtual = saldoAtual + ValorPremio;
                } else {
                    System.out.println("Não tem prémio :(");
                    saldoAtual = saldoAtual - 2;
                }

            }
        }
        while (op != 0);*/





