import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static String[] nomes;
    static String[] letras;

    public static void main(String[] args) {


        //1. Faça um programa que peça ao utilizador três notas, guarde-as num vetor e apresente a média final lendo as
        //notas do vetor.

        /*double[] notas = new double[3];
        double soma = 0;

        // Pedir ao utilizador as 3 notas e preencher no array
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira uma nota");
            notas[i] = in.nextDouble();
            //soma += notas[i];
        }

        // Percorrer o array, ler todas as notas e adicionar cada uma ao acumulador
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("Media: " + media);*/


        //2. Faça um programa que guarde num vetor os nomes de pelo menos 10 alunos da turma.
        // Deve permitir ao utilizador ao inserir o número do aluno
        // (índice do vetor) indicar qual o nome do mesmo.

        //Arrey com os 10 nomes dados pelo sistema
       /*String [] alunos = {
               "Filipe" , "Filipa" , "Paula" , "Marcos" , "Bruno" , "Mauro" , "Andreia" , "Ana" , "Ruben" , "Rui"
        };

        // Exibindo uma mensagem de instrução ao usuário
        System.out.println("Digite o número do aluno (0 a 9) para saber o nome:");
        int indice = in.nextInt();

        // Verificando se o índice está dentro do limite do vetor
        if (indice >= 0 && indice < alunos.length) {
            // Exibindo o nome do aluno correspondente ao índice
            System.out.println("O aluno no índice " + indice + " é: " + alunos[indice]);
        } else {
            // Caso o índice seja inválido, exibindo uma mensagem de erro
            System.out.println("Índice inválido. Digite um número entre 0 e 9.");
        }*/

        //3. Faça um programa que receba 10 valores inteiros e os coloque em um vetor. Em seguida exiba-os em ordem
        //inversa à ordem de entrada

        /*int[] nums = new int[10];

        // ciclo para gerar números
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
        }

        // mostrar ordem de inserção
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // mostrar ordem inversa à inserção
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();*/

        //4. Faça um programa que utilize uma estrutura de repetição para ler 10 números armazenando-os em um vetor e
        //calcule e exiba a média aritmética deles. Em seguida o programa deve apresentar todos os valores armazenados
        //no vetor que sejam menores que a média

       /* int[] nums = new int[50];
        int soma = 0;
        // ciclo para gerar números
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
            soma += nums[i];
        }

        int media = soma / nums.length;
        System.out.println("Média: " + media);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < media) {
                System.out.println("Posição: " + i + "\t Valor: " + nums[i]);
            }
            /*else{
                System.out.println("###Posição: " + i + "\t Valor: " + nums[i]);
            }*/


        //5. Faça um programa que ordene de forma crescente e decrescente um vetor. Sugere-se pesquisa na internet pelo
        //tópico: “java bubble sort”

        //Algoritmo Bubble Sort
        //O Bubble Sort é um algoritmo simples de ordenação que compara pares de elementos adjacentes
        // e os troca se estiverem fora de ordem. Ele repete esse processo até que todos os elementos estejam ordenados.

       /* Integer[] nums = new Integer[10];
        // ciclo para gerar números
        System.out.print("Array original: \t");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(100);
            System.out.print(nums[i] + "\t");
        }
        System.out.println();

        // ordenar crescente
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        Arrays.sort(nums);

        System.out.print("Array crescente: \t");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();*/

        // ordenar decrescente
        /*for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        Arrays.sort(nums, Collections.reverseOrder());

        System.out.print("Array decrescente: \t");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }
        System.out.println();*/


        //6. Faça um programa que peça ao utilizador um conjunto de nomes e os guarda num vetor. De seguida sorteie uma
        //posição do vetor e escreva o nome que está nessa posição

        /*String[] nome = new String [3];


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome " + (i + 1) + ": ");
            nome[i] = in.nextLine();
        }

        Random random = new Random();

        int sorteio = rnd.nextInt(0, 3);
        System.out.println("O número sorteado é: " + (sorteio + 1) + " - " + nome[sorteio]);*/


        //7. Faça um programa que peça ao utilizador um conjunto de nomes. Sempre que o utilizador insere um nome deve
        //inserir num outro vetor a 1ª letra de cada nome. Permita ao utilizador escrever o conteúdo de cada vetor. Sugere-se a utilização de um menu.

        PreencherArrays();
        int op;

        do {
            System.out.println("1-Preencher arrays");
            System.out.println("2-Mostrar Nomes");
            System.out.println("3-Mostrar Letras");
            System.out.println("4-Ordenar");
            System.out.println("0-Sair");
            //try {
            op = in.nextInt();
            if (op == 0) break;
            else if (op == 1) PreencherArrays();
            else if (op == 2) Mostrar(nomes);  //MostrarNomes();
            else if (op == 3) Mostrar(letras); //MostrarLetras();
            else if (op == 4) Ordenar();
            else System.out.println("Opção inválida");
                /*} catch (InputMismatchException e) {
                    System.out.println("Insira um valor numérico");
                    in = new Scanner(System.in);
                    op = -1;
                }*/
        } while (op != 0);


        private static void ex07_Mostrar (String[]dados){
            try {
                for (int i = 0; i < dados.length; i++) {
                    System.out.println("Posição " + (i + 1) + ": " + dados[i]);
                }
            } catch (NullPointerException e) {
                System.out.println("Array ainda não preenchido");
            }
        }

        /* private static void ex07_MostrarLetras() {
            for (int i = 0; i < letras.length; i++) {
                System.out.println("Posição " + (i + 1) + ": " + letras[i]);
            }
        }

        private static void ex07_MostrarNomes() {
            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Posição " + (i + 1) + ": " + nomes[i]);
            }
        }*/

        private static void PreencherArrays () {
            System.out.println("Quantos nomes vai inserir?");
            int quant = in.nextInt();

            nomes = new String[quant];
            letras = new String[quant];

            in = new Scanner(System.in);
            for (int i = 0; i < quant; i++) {
                System.out.println("Qual o " + (i + 1) + "º nome?");
                nomes[i] = in.nextLine();
                // ex07_letras[i] = String.valueOf(ex07_nomes[i].charAt(0));
                letras[i] = nomes[i].substring(0, 1);
            }
        }

        private static void Ordenar() {
            // 8. Altere o exercício anterior ordenando os vetores.
            Arrays.sort(nomes);
            Arrays.sort(letras);
            System.out.println("Arrays ordenados");
        }





    }
}