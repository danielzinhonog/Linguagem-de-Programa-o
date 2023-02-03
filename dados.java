import java.util.Scanner;

public class dados {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String nome, endereco, data, genero, nacionalidade, profissao, idade, cpf, rg, cnh;

    System.out.println("Insira o seu nome:   ");
    nome = sc.nextLine();

    System.out.println("Insira o seu endereço:   ");
    endereco = sc.nextLine();

    System.out.println("Insira a sua data de nacimento:   ");
    data = sc.nextLine();

    System.out.println("Insira o seu gênero:   ");
    genero = sc.nextLine();

    System.out.println("Insira a sua nacionalidade:   ");
    nacionalidade = sc.nextLine();

    System.out.println("Insira a sua profissão:   ");
    profissao = sc.nextLine();

    System.out.println("Insira a sua idade:   ");
    idade = sc.nextLine();

    System.out.println("Insira o seu cpf:   ");
    cpf = sc.nextLine();

    System.out.println("Insira o seu rg:   ");
    rg = sc.nextLine();

    System.out.println("Insira o seu cnh:   ");
    cnh = sc.nextLine();

    System.out.print("Nome " + nome+ "\nEndereço "+ endereco+ "\nData de Nacimento " + data+ "\nGênero " + genero+ "\nNacionalidade " + nacionalidade+ "\nProfissão " + profissao + "\nIdade " + idade + "\nCPF " + cpf+ "\nRG " + rg+ "\nCNH " + cnh);
sc.close();
}
}
