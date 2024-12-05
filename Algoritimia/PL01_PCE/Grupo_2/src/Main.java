import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();

    public static void main(String[] args) {

        //1. Crie um programa que utilize um array multidimensional que simule a tabuada de 10x10. Deve utilizar ciclos para
        //preenchimento do array e aquando da execução da aplicação escrever a todo o array.


        /*System.out.println("Quantas linhas quer?");
        int linhas = in.nextInt();

        System.out.println("Quantas colunas quer?");
        int colunas = in.nextInt();

        int[][] tabuada = new int[linhas][colunas];
        /*
        1   2   3   4   5   6   7   8   9   10
        2   4   6   8   10  12  14  16  18  20
                ...
        10  20  30  40  50  60  70  80  80  100
        */

        /*for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                tabuada[i][j] = (i + 1) * (j + 1);
                System.out.print(tabuada[i][j] + "\t");
            }
            System.out.println();
        }*/


        //2. Faça um programa que guarde um array multidimensional de 3x3 com números aleatórios e o apresente no ecrã.
        /*

        // Criando o array 3x3
        int[][] tabela = new int[3][3];

        // Criando o objeto Random para gerar números aleatórios
        Random random = new Random();


        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela[i].length; j++) {
                tabela[i][j] = random.nextInt(10);;
                System.out.print(tabela[i][j] + "\t");
            }
            System.out.println();
        }*/

        //3. Altere a aplicação anterior permitindo ao utilizador preencher o array com os valores que pretender.

        /*
       int[][] tabela = new int[3][3];


        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                tabela[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                 System.out.print(tabela[i][j] + "\t");
            }
            System.out.println();
        }*/

        //4. Altere a aplicação anterior permitindo ao utilizador escolher o número de linhas e colunas do array.


        /*System.out.println("Quantas linhas quer?");
        int linhas = in.nextInt();

        System.out.println("Quantas colunas quer?");
        int colunas = in.nextInt();

        int[][] tabela = new int[linhas][colunas];


        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                tabela[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < tabela.length; j++) {
                System.out.print(tabela[i][j] + "\t");
            }
            System.out.println();
        }*/

        //5. Acrescente a possibilidade de o utilizador calcular a soma e a média dos valores do array por linha, por coluna e
        //no total.


       /* System.out.println("Quantas linhas terá o array?");
        int linhas = in.nextInt();

        System.out.println("Quantas colunas terá o array?");
        int colunas = in.nextInt();

        int[][] nums = new int[linhas][colunas];
        int[] somaL = new int[linhas];
        int[] somaC = new int[colunas];
        int somaTotal = 0;

        // preenchimento do array
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Qual o valor da posição (" + i + "," + j + ")");
                nums[i][j] = in.nextInt();
                somaC[j] += nums[i][j];
                somaL[i] += nums[i][j];
                somaTotal += nums[i][j];
            }
        }

        // apresentação do array
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println(" | " + somaL[i] + "\t" + (somaL[i] / colunas));
        }
        System.out.println("---------------");
        for (int i = 0; i < colunas; i++) {
            System.out.print(somaC[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < colunas; i++) {
            System.out.print((somaC[i] / linhas) + "\t");
        }
        System.out.println();

        System.out.println("Soma total: " + somaTotal);
        System.out.println("Média total: " + somaTotal / (linhas * colunas));
    }*/


    }
}