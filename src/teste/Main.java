package teste;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1) ");
        exe1();
        System.out.print("------------------------\n\n");
        // informar um número ao executar o programa
        System.out.println("2) ");
        System.out.print("Informe um número: ");
        exe2(sc.nextInt());

        System.out.print("------------------------\n\n");
        System.out.println("3) ");
        exe3();

        System.out.print("-------------------------------\n\n");
        System.out.println("4) ");
        // informar um texto ao executar o programa
        System.out.print("Informe um texto: ");
        exe5(sc.next());

        System.out.print("\n");
        System.out.println("5) ");
        exe4();

        System.out.print("\n");
    }

    public static void exe1() {
        // Ao final do processamento, qual será o valor da variável SOMA?
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            SOMA += K;
            K++;
        }
        System.out.printf("Valor da variável soma = %d\n", SOMA); // soma == 78;
    }

    public static void exe2(int num) {
        /*
           2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
           (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar
           onde, informado um número, ele calcule a sequência de Fibonacci
           e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
        */

        int a = 0, b = 1, aux = 0, n = 0;

        System.out.printf("%d %d ", a, b);
        for (int i = 0; i < num; i++) {
            aux = a + b;
            a = b;
            b = aux;
            System.out.printf("%d ", aux);
            if (num == aux) n = aux;
        }
        String result = (n == num) ? "\nO número informado pertence a sequência de Fibonacci :)" :
                "\nO número não pertence a sequência de Fibonacci :(";

        System.out.println(result);
    }

    public static void exe3() {
        // 3) Descubra a lógica e complete o próximo elemento:

        // a) 1, 3, 5, 7, 9 // sequência de dois em dois
        System.out.println("a) sequência de dois em dois: 1, 3, 5, 7, 9");

        // b) 2, 4, 8, 16, 32, 64, 128 // números multiplicados por 2
        System.out.println("b) números multiplicados por 2: 2, 4, 8, 16, 32, 64, 128");

        // c) 0, 1, 4, 9, 16, 25, 36, 49// soma com o próximo número impar
        //         3, 5, 7, 9,  11, 13
        System.out.println("c) soma com o próximo número impar: 0, 1, 4, 9, 16, 25, 36, 49");

        // d) 4, 16, 36, 64, 100
        //     12, 20, 28, 36 // somando 8 ao próximo número
        System.out.println("d) somando 8 ao próximo número: 4, 16, 36, 64, 100");

        // e) 1, 1, 2, 3, 5, 8, 13 // sequência de fibonacci
        System.out.println("e) sequência de fibonacci: 1, 1, 2, 3, 5, 8, 13");

        // f) 2, 10, 12, 16, 17, 18, 19, 200 // números que iniciam com D
        System.out.println("f) números que iniciam com D: 2, 10, 12, 16, 17, 18, 19, 200");
    }

    public static  void exe4() {
//        O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se cruzarem,
//        eles se encontram a 60,9 km de Ribeirão Preto.
        System.out.println("Para resolução foi usado a formula de movimento uniforme.");

    }


    public static void exe5(String str) {
        String invertida = "";
        for (int i = str.length()-1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        System.out.printf("texto invertido = %s\n", invertida);
    }
}



