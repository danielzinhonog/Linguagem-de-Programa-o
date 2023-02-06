public class shoppingcapital extends shoppingsrj {
    public shoppingcapital(String nome, String rua, int numero, String bairro, String cidade){
    super(nome, rua, numero, bairro, cidade );
    }
    public static void main(String[] args){
        shoppingsrj shopping2 = new shoppingsrj("Shopping Rio Sul", "Rua Lauro Müller", 116, "Botafogo", "Rio de Janeiro");
        shopping2.imprimirDados();
    }
}