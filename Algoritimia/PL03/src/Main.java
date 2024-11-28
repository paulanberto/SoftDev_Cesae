import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int op;
        do {
            System.out.println("Bem vindo");
            System.out.println("Escolha uma das seguintes opções");
            System.out.println("1-Calculadora");
            System.out.println("2-Lista de números");
            System.out.println("3-Calendário");
            System.out.println("0-Sair");
            op = in.nextInt();

            if (op == 0) {
                return;
            } else if (op == 1) {
                Calculadora();
            } else if (op == 2) {
                ListaNumeros();
            } else if (op == 3) {
                Calendario();
            } else {
                System.out.println("Opção inválida");
            }
        }
        while (op != 0);
    }


    private static void Calculadora() {
        int op = 1;
        while (op != 0) {
            System.out.println("Aplicação 1: Calculadora");
            System.out.println("1-Somar");
            System.out.println("2-Subtrair");
            System.out.println("3-Dividir");
            System.out.println("4-Multiplicar");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    //Somar();
                    Operacao("+");
                    break;
                case 2:
                    //Subtrair();
                    Operacao("-");
                    break;
                case 3:
                    //Divisao();
                    Operacao("/");
                    break;
                case 4:
                    //Multiplicar();
                    Operacao("*");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static double PedirNumero() {
        System.out.println("Insira um número");
        return in.nextDouble();
        /*double numero = in.nextDouble();
        return numero;*/
    }

    private static void Operacao(String operacao) {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();
        double resultado = switch (operacao) {
            case "+" -> numero1 + numero2;
            case "-" -> numero1 - numero2;
            case "*" -> numero1 * numero2;
            default -> numero1 / numero2;
        };

        /*if (operacao == "+") {
            resultado = numero1 + numero2;
        } else if (operacao == "-") {
            resultado = numero1 - numero2;
        } else if (operacao == "*") {
            resultado = numero1 * numero2;
        } else {
            resultado = numero1 / numero2;
        }*/

        System.out.println("O resultado é: " + resultado);
    }

    private static void Somar() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double soma = numero1 + numero2;

        /*System.out.println("Insira um número");
        double primeiro_numero = in.nextDouble();
        System.out.println("Insira outro número");
        double segundo_numero = in.nextDouble();

        double soma = primeiro_numero + segundo_numero;*/
        System.out.println("A soma dos números é: " + soma);
    }

    private static void Subtrair() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double subtracao = numero1 - numero2;

        /*System.out.println("Insira um número");
        double primeiro_numero = in.nextDouble();
        System.out.println("Insira outro número");
        double segundo_numero = in.nextDouble();

        double subtracao = primeiro_numero - segundo_numero;*/
        System.out.println("A subtração dos números é: " + subtracao);
    }

    private static void Divisao() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double divisao = numero1 / numero2;

        /*System.out.println("Insira um número");
        double primeiro_numero = in.nextDouble();
        System.out.println("Insira outro número");
        double segundo_numero = in.nextDouble();

        double divisao = primeiro_numero / segundo_numero;*/
        System.out.println("A divisão dos números é: " + divisao);
    }

    private static void Multiplicar() {
        double numero1 = PedirNumero();
        double numero2 = PedirNumero();

        double multiplicacao = numero1 * numero2;

        /*System.out.println("Insira um número");
        double primeiro_numero = in.nextDouble();
        System.out.println("Insira outro número");
        double segundo_numero = in.nextDouble();

        double multiplicacao = primeiro_numero * segundo_numero;*/
        System.out.println("A multiplicação dos números é: " + multiplicacao);
    }

    //---------------------------------------------------------------------
    private static void ListaNumeros() {
        int inicio, fim;

        System.out.println("Insira o número inicial ");
        inicio = in.nextInt();
        System.out.println("Insira o número final ");
        fim = in.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i); //pode também usar print(i+"\t")
        }
    }
    //Neste caso, se o primeiro número for maior que o segundo,
    // o programa organiza do menor para o maior
    /* if (inicio < fim) {
        for (int i = inicio; i <= fim; i++)
            System.out.println(i);
        }
       else {
           for (int i = inicio; i >= fim; i++)
            System.out.println(i);
        }
     */

    //---------------------------------------------------------------------
    private static void Calendario() {
        int op = 1;
        while (op != 0) {
            System.out.println("Aplicação 3: Calendário");
            System.out.println("1-Consultar ano bissexto");
            System.out.println("2-Transformar dias");
            System.out.println("0-Voltar ao menu anterior");
            op = in.nextInt();

            switch (op) {
                case 0:
                    break;
                case 1:
                    Bissexto();
                    break;
                case 2:
                    Transformar();
                    break;
                default:
                    System.out.println("Opção inválida");
            }


        }


    }

    private static void Bissexto() {
        System.out.println("Insira o ano ");
        int ano = in.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println(ano + " é um ano bissexto.");
        }
        else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
    private static void Transformar() {
        System.out.println("Digite um valor");
        int valor = in.nextInt();

        int ano = 365;
        int semana = 7;

        int anos = valor / ano;
        int diasrestantes = valor % ano;
        int semanas = diasrestantes / semana;
        diasrestantes = diasrestantes % semana;

        System.out.println("O valor digitado corresponde a " + anos + " ano(s), "
                + semanas + " semanas ou "
                + diasrestantes + " dias");
    }




}