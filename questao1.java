package Aula0302;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double num1, num2, num3, soma;

    System.out.println("Digite um número: ");
    num1 = sc.nextDouble();

    System.out.println("Digite outro número: ");
    num2 = sc.nextDouble();

    System.out.println("Digite outro número: ");
    num3 = sc.nextDouble();

    soma =num1 + num2 + num3;

    System.out.println("A soma dos 3 valores é: " + soma);
    sc.close();
}
}