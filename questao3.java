package Aula0302;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double num1, divisao;

    System.out.println("Digite um número: ");
    num1 = sc.nextDouble();

    divisao = num1 / 5;

    System.out.println("A divisão do valor é: " + divisao);
    sc.close();
}
}