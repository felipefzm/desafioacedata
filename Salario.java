import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo ao Sistema de cálculo de salário");
        System.out.println("Por favor, coloque o valor da hora trabalhada:");
        int valorHora = entrada.nextInt();
        System.out.println("Agora, coloque a quantidade de horas trabalhadas no mês:");
        int numeroHoras = entrada.nextInt();
        System.out.println("Por favor, digite a quantidade de filhos menores que 14 anos:");
        int numeroFilhos = entrada.nextInt();
        double salarioBruto = numeroHoras * valorHora;

        double salarioFamilia = 0;
        if (salarioBruto <= 788.00) {
            salarioFamilia = numeroFilhos * 30.50;
        } else if (salarioBruto > 788.00 && salarioBruto <= 1100.00) {
            salarioFamilia = numeroFilhos * 18.50;
        } else if (salarioBruto > 1100.00) {
            salarioFamilia = numeroFilhos * 11.90;
        }

        double salarioLiquido = salarioBruto + salarioFamilia;

        System.out.println("O valor do salário bruto é de: R$ " + salarioBruto);
        System.out.println("O valor do salário família é de: R$" + salarioFamilia);
        System.out.println("Então, o valor do salário líquido total é de: R$" + salarioLiquido);

        System.out.println("Obrigado por usar nosso sistema!");
    }

}