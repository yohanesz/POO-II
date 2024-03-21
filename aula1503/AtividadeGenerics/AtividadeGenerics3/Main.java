package AtividadeGenerics.AtividadeGenerics3;

public class Main {

    public static void main(String[] args) {

        ProdutoX randomProduct1 = new ProdutoX("Azeite", 5.29, 1);
        ProdutoX randomProduct2 = new ProdutoX("Detergente", 1.99, 2);

        Pedido p = new Pedido();

        p.adicionarProduto(randomProduct1);
        p.adicionarProduto(randomProduct2);

        p.mostrarProdutos();
    }

}
