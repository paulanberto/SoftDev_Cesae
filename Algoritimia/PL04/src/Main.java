//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static int saldoInicial = 100;
    static int saldoAtual = 1;

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("Digite seu nome");
            String nome = in.nextLine();
            System.out.println("Bem vindo (a) " + nome);
            System.out.println("Seu saldo atual é: " + saldoAtual + "€");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Lotaria");
            System.out.println("2-Raspadinha");
            System.out.println("3-Gestão da Conta");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            }
            else if (op == 1) {
                Lotaria();
            }
            else if (op == 2) {
                Raspadinha();
            }
            else if (op == 3) {
                GestaoConta();
            }
            else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }

    private static void GestaoConta() {

        int op;
        do {
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Levantamento");
            System.out.println("2-Depósito");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            if (op == 0) {
                return;
            } else if (op == 1) {
                Levantamento();
            } else if (op == 2) {
                Deposito();
            } else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }

    private static void Levantamento() {
        System.out.println("Digite o valor que deseja levantar");
        double valorLev = in.nextDouble();

        if (valorLev > saldoAtual) {
            System.out.println("Este valor está acima do seu saldo, que é " + saldoAtual);
        }


        int op;
        do {
            System.out.println("Você confirma o levantamento de " + valorLev + "€");
            System.out.println("1-Sim");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            }
            else if (op == 1) {
                System.out.println("Você levantou o valor de " + valorLev + "€. Seu novo saldo é " + (saldoAtual - valorLev) + "€");
                saldoAtual += valorLev;
                break;

            }
            else {
                System.out.println("Opção inválida");
                return;
            }
        }
        while (op != 0);

    }


    private static void Deposito() {
        System.out.println("Digite o valor que deseja depositar");
        int valorDep = in.nextInt();

        int op;
        do {
            System.out.println("Você confirma o depósito de " + valorDep + "€");
            System.out.println("1-Sim");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            }
            else if (op == 1) {
                System.out.println("Você depositou o valor de " + valorDep + "€. Seu novo saldo é " + (saldoAtual + valorDep) + "€");
                saldoAtual += valorDep;
                break;
            }
            else {
                System.out.println("Opção inválida");
                return;
            }
        }
        while (op != 0);

        }



    private static void Lotaria() {

        if (saldoAtual < 5) {
            System.out.println("Você não possui saldo suficiente para jogar na Lotaria. Efetue um depósito para continuar a jogar");
            return;
        }
        else {
            saldoAtual = saldoAtual - 5;
        }

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
        while (op != 0);


    }

}
