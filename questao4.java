package Aula0302;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double num1, quadrado;

    System.out.println("Digite um número: ");
    num1 = sc.nextDouble();

    quadrado = num1 * num1;

    System.out.println("O quadrado desse valor é: " + quadrado);
    sc.close();
}
}