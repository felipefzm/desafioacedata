import java.util.Scanner;

public class Fibonacci {
    public static int calculadora(int numero1) {
        if (numero1 < 2) {
            return numero1;
        }

        return calculadora(numero1 - 1) + calculadora(numero1 - 2); // fórmula de fibonacci

    }

    public static boolean isFibonacci(int c) {
        if (c < 2) { // 0 e 1 são parte da sequência
            return true;
        }
        int a = 0;
        int b = 1;
        int aux;

        while (b < c) {
            aux = a + b; // lógica alternativa para fazer a sequência de fibonacci
            a = b;
            b = aux;

            if (b == c) {
                return true;

            }

        }
        return false;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo aos números de Fibonnaci. Quantos números da sequência você gostaria de imprimir?");
        int n = entrada.nextInt();

        System.out.println("Os números são: ");
        for (int i = 0; i < n; i++) {
            System.out.println(calculadora(i));

        }
        if (isFibonacci(n)) {
            System.out.println("Sim, o número "+n+" está na sequência de Fibonacci.");
        } else{
            System.out.println("Não, o número "+n+" não está na sequência de Fibonacci.");
        }

    }

}