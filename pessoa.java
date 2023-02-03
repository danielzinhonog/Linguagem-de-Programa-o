package Aula0302;

//CLASSE PESSOA
 
public class pessoa { //classe
    private String nome; //atributos, propriedades
    private int idade; //atributos, propriedades
    private double altura; //atributos, propriedades

    //CHAMAMOS DE ENTIDADE O PADRÃO DE ATRIBUTOS, OU CARACTERÍSTICAS

    //método constructor -> PRA CRIAR OU EXCLUIR OBJETOS
    public pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this. altura = altura;
    }

    public void imprimirDados(){ //método imprimirDados() 
        System.out.println("Nome: " + nome + "Idade: " + idade + "Altura: " + altura);
    }

    public void saudacao(){
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + "anos, e minha altura é  " + altura );
    }
    public static void main(String[] args){
        pessoa pessoa = new pessoa("Demetrius Ferreira", 27, 1.75);
        pessoa.saudacao();
    }
}