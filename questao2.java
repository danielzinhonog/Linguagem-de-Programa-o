package Aula0302;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double num1, num2, num3, media;

    System.out.println("Digite um número: ");
    num1 = sc.nextDouble();

    System.out.println("Digite outro número: ");
    num2 = sc.nextDouble();

    System.out.println("Digite outro número: ");
    num3 = sc.nextDouble();

    media =(num1 + num2 + num3) / 3;

    System.out.println("A média dos 3 valores é: " + media);
    sc.close();
}
}