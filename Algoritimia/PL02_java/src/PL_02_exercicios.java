//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //2. Crie um algoritimo que após ler dois números
        //inteiros apresenta a sua soma

        //Scanner in = new Scanner(System.in);

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

        /*Scanner in = new Scanner(System.in);

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
        } else if (n2 < n3 && n2 < n4) {
            System.out.println("O menor é o " + n2);
        } else if (n3 < n4) {
            System.out.println("O menor é o " + n3);
        } else {
            System.out.println("O menor é o " + n4);
        }*/

        //10. Faça um programa que verifique se um número é ímpar

        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira um valor");
        int valor = in.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor digitado é par");
        }
        else {
            System.out.println("O valor digitado é ímpar");
        }*/

        //11. Faça um programa que receba 3 valores que representarão os lados de um triângulo e verifique se os valores
        //formam um triângulo e classifique esse triângulo como:
        //• Equilátero (3 lados iguais);
        //• Isósceles (2 lados iguais);
        //• Escaleno (3 lados diferentes)

        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro lado");
        int l1 = in.nextInt();

        System.out.println("Insira o valor do segundo lado");
        int l2 = in.nextInt();

        System.out.println("Insira o valor do terceiro lado");
        int l3 = in.nextInt();

        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Estes valores não formam um triângulo");
        }
        else if (l1 > (l2+l3) || l2 > (l1+l3) || l3 > (l1+l2)){
                System.out.println("Estes valores não formam um triângulo");
            }
        else if (l1 == l2 && l2 == l3) {
            System.out.println("Este triângulo é equilátero");
        }
        else if ((l1 == l2 && l2 != l3)||(l1 != l2 && l1 == l3) || (l2 == l3 && l1 != l2)) {
            System.out.println("Este triângulo é isóceles");
        }
        else {
            System.out.println("Este triângulo é escaleno");
        }*/

        //12. Utilize a estrutura SE para fazer um programa que retorne o nome de um produto a partir do código do mesmo.
        //Considere os seguintes códigos:
        //• 001 - Parafuso;
        //• 002 - Porca;
        //• 003 - Prego;
        //• Para qualquer outro código indicar “Não definido”

        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira o código do produto");
        int produto = in.nextInt();


        if (produto == 001){
            System.out.println("001 - Parafuso");
        }
        else if (produto == 002){
            System.out.println("O02 - Porca");
        }
        else if (produto == 003){
            System.out.println("003 - Prego");
        }
        else {
            System.out.println("Produto não encontrado");
        }*/

        //13. Refaça o exercício anterior usando a estrutura LER-CASO

        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira o código do produto");
        int produto = in.nextInt();


        switch (produto) {
            case 001:
                System.out.println("001 - Parafuso");
                break;
            case 002:
                System.out.println("O02 - Porca");
                break;
            case 003:
                System.out.println("003 - Prego");
                break;
            default:
             }*/

        //Ciclo/laço

        /*for (int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        int i = 1;
        while (i <= 100){
            System.out.println(i);
            i++;
        }*/

        //14. Faça um programa que utilize a estrutura ENQUANTO para ler 50 números e calcule e exiba a média aritmética
        //deles.

        /*Scanner in = new Scanner(System.in);
        double n = 0;
        double soma = 0;

        while (n < 5){
              System.out.prinln("Insira um valor);
              double numero = in.nextDouble();
              //soma = soma + numero;
              soma += numero
              n++;
        }
        double media = soma / 5;
        System.out.println("A média dos números é " + media);
         */

        //15. Refaça o exercício usando a estrutura PARA

        /*Scanner in = new Scanner(System.in);
        int quantidade = 5;
        double soma = 0;

        for (int n = 1; n <= quantidade; n++){
            System.out.println("Insira um valor");
            double numero = in.nextDouble();
            //soma = soma + numero;
            soma += numero;

        }
        double media = soma / quantidade;
        System.out.println("A média dos números é " + media);*/

        //16. Dado uma série de 20 valores inteiros, faça um algoritmo que calcule e
        // escreva a média aritmética destes valores.

        /*Scanner in = new Scanner(System.in);
        int quantidade = 20;
        double soma = 0;

        for (int n = 1; n <= quantidade; n++){
            System.out.println("Insira um valor");
            int numero = in.nextInt();
            //soma = soma + numero;
            soma += numero;

        }
        double media = soma / quantidade;
        System.out.println("A média dos números é " + media);*/

        //17. Adapte o exercício anterior considerando que se a média obtida for maior
        // que 8 deverá ser atribuída 10 para a média.

        /*Scanner in = new Scanner(System.in);
        int quantidade = 20;
        double soma = 0;

        for (int n = 1; n <= quantidade; n++){
            System.out.println("Insira um valor");
            int numero = in.nextInt();
            //soma = soma + numero;
            soma += numero;

        }
        double media = soma / quantidade;

            if (media > 8) {
                System.out.println("A média dos números é 10");
            }
            else {
                    System.out.println("A média dos números é " + media);
            }*/

        //18. Dado um conjunto de n números inteiros inseridos pelo utilizador,
        // faça um algoritmo que calcule a média dos
        //valores maiores que 4.

        /*Scanner in = new Scanner(System.in);
        int quantidade = 5;
        int soma = 0;
        int contador_vezes = 0;

        for (int n = 1; n <= quantidade; n++){
            System.out.println("Insira um valor");
            int numero = in.nextInt();

            if (numero > 4) {
                soma += numero;
                contador_vezes++;
            }
        }

        int media = soma / contador_vezes;
            System.out.println("A média dos números é " + media);*/

        //outra forma------quando pede um número---------------------------

        /*Scanner in = new Scanner(System.in);
        double numero = 1;
        double soma = 0;
        double contador_vezes = 0;

        do {
            System.out.println("Insira um valor. Insira 0 para parar");
            numero = in.nextDouble();

            if (numero > 4) {
                soma += numero;
                contador_vezes++;
            }
        }

        while (numero != 0);
            if (contador_vezes > 0) {
                double media = soma / contador_vezes;
                System.out.println("A média dos números é " + media);
            }
            else {
            System.out.println("Não inseriu valores acima de 4");

            }
        }*/


        //19. Crie um programa que permita converter um valor
        // em horas para segundos e mostre o valor em segundos.

        /*Scanner in = new Scanner(System.in);

        System.out.println("Digite as horas");
        int hora = in.nextInt();
        int segundos = (hora*3600);

        System.out.println("Digite as horas");

        System.out.println(hora + " hora(s) correspondem a " + segundos);*/


        //20. Crie um programa que permita converter um valor em dias para anos, semanas e dias.

        /*Scanner in = new Scanner(System.in);


        System.out.println("Digite um valor");
        int valor = in.nextInt();

        int ano = 365;
        int semana = 7;

        int anos = valor / ano;
        int diasrestantes = valor % ano;
        int semanas = diasrestantes / semana;
        diasrestantes = diasrestantes % semana;

        System.out.println("O valor digitado corresponde a " + anos + " ano(s), " + semanas + " semanas ou " + diasrestantes + " dias");*/


        //21. Crie um programa que permita converter um valor em bytes para bits.

        //Scanner in = new Scanner(System.in);

        //System.out.println("Digite um valor de bytes");
        //int bytes = in.nextInt();


        /*int bytes = 8;

        System.out.println("Digite um valor de bytes");
        int valor = in.nextInt();

        System.out.println( valor + " corresponde a " + (valor * bytes) + " bits");*/


        // 22. Crie um programa que permita converter um valor em Megabytes para Bytes.

        /*Scanner in = new Scanner(System.in);

        int megabytes = 1048576;

        System.out.println("Digite um valor de Megabytes");
        int valor = in.nextInt();

        System.out.println( valor + " corresponde a " + (valor * megabytes) + " bits");*/


        //23. Crie um programa para multiplicar dois números sem recurso ao operador
        // multiplicação.

        /*Scanner in = new Scanner(System.in);

        int resultado = 0;

        System.out.println("Digite o valor a ser multiplicado");
        int n1 = in.nextInt();

        System.out.println("Digite o valor que você quer multiplicar");
        int n2 = in.nextInt();

        for (int i = 0; i < n2; i++ ) {
            resultado += n1;
        }
        System.out.println("O reultado é " + resultado);*/




        //24. Ler N números, determinar o maior, o menor e a média dos N números lidos.

        /*Scanner in = new Scanner(System.in);
        double soma = 0/*, maior = 0, menor = 0;
        double maior, menor;


        System.out.println("Quantos valores quer inserir?");
        int quant = in.nextInt();

        if (quant > 0) {
            System.out.println("Insira o primeiro número");
            double n = in.nextDouble();
            maior = n;
            menor = n;
            soma += n;

            for (int i = 2; i <= quant; i++) {
                System.out.println("Insira o " + i + " número");
                n = in.nextDouble();

                soma += n;

                if (n > maior) {
                    maior = n;
                }

                if (n < menor) {
                    menor = n;
                }
            }
            double media = soma / quant;
            System.out.println("A media é: " + media);
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        else {
            System.out.println("Para calcular tem de inserir pelo menos um valor");
        }*/



        //25. Elabore uma função que dado um ano verifique se ele é ou não bissexto.


        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira o ano ");
        int ano = in.nextInt();

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                System.out.println(ano + " é um ano bissexto.");
            }
            else {
                System.out.println(ano + " não é um ano bissexto.");
            }*/

        //26. Escreva um programa que converta um valor binário para decimal

        /*Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor a ser convertido ");
        int bin = in.nextInt();
        int dec = 0;
        int pos = 0; //posição da elevação

        //100101 = 1x2^5 + 0x2^4 + 0x2^3 + 1x2^2 + 0x2^1 + 1x2^0 = 37

        while(bin > 0){
            int ultimoDigito = (bin % 10); //pow = a elevado

            if (ultimoDigito != 0 && ultimoDigito != 1){
                System.out.println("Valor introduzido é inválido");
                return;
            }
            dec += ultimoDigito * Math.pow(2,pos);
            pos++;
            bin /= 10; //bin = bin / 10;
        }

        System.out.println(dec);*/








    }

}


