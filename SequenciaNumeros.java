import java.util.Arrays;
import java.util.Scanner;

public class SequenciaNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo à sequência de números.");

        int arrayNumeros[];
        int maior = 0;
        int menor = 0;

        System.out.println("Por favor, digite a quantidade de números que você pretende ter na sua sequência.");
        int qtdNumeros = entrada.nextInt();
        arrayNumeros = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Informe o número " + (i + 1) + " e clique em Enter pra continuar");
            arrayNumeros[i] = entrada.nextInt();

            maior = arrayNumeros[i];
            menor = arrayNumeros[i];
        }

        for (int i = 0; i < qtdNumeros; i++) {
            if (arrayNumeros[i] > maior) {
                maior = arrayNumeros[i];
            } else if (arrayNumeros[i] < menor) {
                menor = arrayNumeros[i];
            }
        }

        System.out.println("A sequência é:" +Arrays.toString(arrayNumeros));
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }

}
