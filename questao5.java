package Aula0302;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double num1, num2;

    System.out.println("Digite um número: ");
    num1 = sc.nextDouble();

    System.out.println("Digite outro número: ");
    num2 = sc.nextDouble();

    if(num1 > num2){
        System.out.println("O menor valor é: " + num2);
}
    else if(num2 > num1){
        System.out.println("O menor valor é: " + num1);
}

    else{
        System.out.println("Os dois números são iguais");
}
    sc.close();
}
}