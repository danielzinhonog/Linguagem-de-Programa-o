public class shoppingsg extends shoppingsrj {
    public shoppingsg(String nome, String rua, int numero, String bairro, String cidade){
    super(nome, rua, numero, bairro, cidade );
    }
    public static void main(String[] args){
        shoppingsrj shopping1 = new shoppingsrj("São Gonçalo Shopping", "Av. São Gonçalo", 100, "Boa Vista", "São Gonçalo");
        shopping1.imprimirDados();
    }
}