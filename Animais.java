import java.util.Scanner;

public class Animais {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String nome, cor, raca;
    double tamanho;

    System.out.println("Insira o nome do animal:   ");
    nome = sc.nextLine();

    System.out.println("Insira a cor do animal:   ");
    cor = sc.nextLine();

    System.out.println("Insira a raça do animal:   ");
    raca = sc.nextLine();

    System.out.println("Insira o tamanho do animal:   ");
    tamanho = sc.nextDouble();

    System.out.print("Nome " + nome+ "\nCor "+ cor + "\nRaca "+ raca+ "\nTamanho " + tamanho+ "M");

}
}