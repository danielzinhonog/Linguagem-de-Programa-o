import java.util.Scanner;

public class index{

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double nota1, nota2, nota3, media;

    System.out.println("Informe a 1 nota");
    nota1 = sc.nextDouble();

    System.out.println("Informe a 2 nota");
    nota2 = sc.nextDouble();

    System.out.println("Informe a 3 nota");
    nota3 = sc.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    System.out.println("A media das notas é: " + media);
}
}