//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Crie um algoritimo que após ler dois números
        //inteiros apresenta a sua soma

        Scanner in = new Scanner(System.in);

        //System.out.println("Insira um número");
        //String primeiro_numero = in.nextLine();
        //int n1 = Interger.parseInt(primeiro_numero)
        //double primeiro_numero = in.nextDouble();

        //System.out.println("Insira outro número");
        //String segundo_numero = in.nextLine();
        //int n2 = Interger.parseInt(segundo_numero)
        //double segundo_numero = in.nextDouble();

        //String soma = primeiro_numero + segundo_numero;
        //double soma = primeiro_numero + segundo_numero;
        //System.out.println("A soma é: " + soma);

        //3. Crie um algoritmo que após ler dois números inteiros apresenta a sua diferença.

        /*System.out.println("Insira um número");
        int primeiro_numero = in.nextInt();
        System.out.println("Insira outro número");
        int segundo_numero = in.nextInt();

        int diferenca = primeiro_numero - segundo_numero;
        System.out.println("A diferença é: " + diferenca);*/

        //4. Pretende-se lendo a base e altura de um triângulo calcular a sua área.

        //System.out.println("Insira a altura do triângulo");
        //int altura = in.nextInt();
        //System.out.println("Insira a base do triângulo");
        //int base = in.nextInt();

        //int area = (base * altura)/2;
        //System.out.println("A área do triângulo é: " + area);

        //5. Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço do produto e retorne
        //o troco a ser dado.

        //System.out.println("Insira o valor pago");
        //double valor_pago = in.nextDouble();
        //System.out.println("Insira o valor do produto");
        //double valor_produto = in.nextDouble();

        //double troco = valor_pago - valor_produto;
        //System.out.println("O valor do troco é: " + troco);

        //situação do exercício 5 com condicionais:

        /*System.out.println("Insira o valor pago");
        double valor_pago = in.nextDouble();
        System.out.println("Insira o valor do produto");
        double valor_produto = in.nextDouble();

            double troco = valor_pago - valor_produto;

            if( troco > 0) {
                System.out.println("O valor do troco é: " + troco);
            }
            else if( troco < 0) {
                System.out.println("Ainda falta pagar: " + troco * -1);
            }
            else {
                System.out.println("Não tem troco");
            }*/




        //6. Faça um programa que receba o valor do quilo de um produto e a quantidade de quilos do produto consumida
        //calculando o valor final a ser pago.

        //System.out.println("Insira o valor do quilo do produto");
        //double valor_quilo = in.nextDouble();
        //System.out.println("Insira a quantidade de quilos do produto");
        //double quantidade_produto = in.nextDouble();

        //double valor_pagar = valor_quilo * quantidade_produto;
        //System.out.println("O valor final a ser pago é: " + valor_pagar);

        //7. O preço de um automóvel é calculado pela soma do preço de fábrica com o preço dos impostos (45% do preço
        //de fábrica) e a percentagem do revendedor (28% do preço de fábrica). Faça um algoritmo que leia o nome do
        //automóvel e o preço de fábrica e escreva o nome do automóvel e o preço final.

        /*double perc_impostos = 0.45;
        double perc_revendedor = 0.28;

        System.out.println("Insira o nome do carro");
        String nome_carro = in.nextLine();
        System.out.println("Insira o preço de fábrica do " +nome_carro+ "?");
        double preco_carro = in.nextDouble();

        double carro_final = preco_carro + (preco_carro * perc_impostos) + (preco_carro * perc_revendedor);
        System.out.println("O automóvel " + nome_carro + " custará " + carro_final);*/



        //Exercícios grupo 2

        //8. Faça um programa que receba 2 valores e retorne o maior entre eles.

        /*System.out.println("Insira o primeiro valor");
        double primeiro_valor = in.nextDouble();

        System.out.println("Insira o segundo valor");
        double segundo_valor = in.nextDouble();

            if( primeiro_valor > segundo_valor) {
                System.out.println("O primeiro valor é maior: " + primeiro_valor);
            }
            else if(primeiro_valor < segundo_valor) {
                System.out.println("O segundo valor é maior: " + segundo_valor);
            }
            else {
                System.out.println("Os números são iguais" + primeiro_valor);
            }*/

        //9. Faça um programa que receba 4 valores e retorne o menor entre eles.

        System.out.println("Insira o primeiro valor");
        double n1 = in.nextDouble();

        System.out.println("Insira o segundo valor");
        double n2 = in.nextDouble();

        System.out.println("Insira o terceiro valor");
        double n3 = in.nextDouble();

        System.out.println("Insira o quarto valor");
        double n4 = in.nextDouble();

        if (n1 < n2 && n1 < n3 && n1 < n4) {
            System.out.println("O menor é o " + n1);
        }
        else if (n2 < n3 && n2 < n4){
            System.out.println("O menor é o " + n2);
        }
        else if (n3 < n4){
            System.out.println("O menor é o " + n3);
        }
        else {
            System.out.println("O menor é o " + n4);
        }
    }