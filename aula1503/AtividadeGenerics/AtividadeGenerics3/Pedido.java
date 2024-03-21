package AtividadeGenerics.AtividadeGenerics3;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ProdutoX> produtos;

    public Pedido() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(ProdutoX produto) {
        produtos.add(produto);
    }

    public void mostrarProdutos() {

        for (ProdutoX p : produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade());
        }

    }

}
