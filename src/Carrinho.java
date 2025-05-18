import java.util.ArrayList;

public class Carrinho {
    // Cria uma lista de strings para armazenar os produtos
    private ArrayList<String> produtoList = new ArrayList<>();

    // Adiciona um produto à lista
    public void adicionarProduto(String produto) {
        produtoList.add(produto);
    }

    // Remove um produto da lista, ignorando se está em maiúsculas/minúsculas
    public boolean removerProduto(String produto) {
        for (String p : produtoList) {
            if (p.equalsIgnoreCase(produto)) {
                produtoList.remove(p); // Remove o produto exato da lista
                return true; // Confirma que foi removido
            }
        }
        return false; // Produto não estava na lista
    }

    // Mostra todos os produtos da lista
    public void mostrarProduto() {
        if (produtoList.isEmpty()) {
            System.out.println("Não há produtos na sua lista de compras.");
        } else {
            System.out.println("Lista de produtos:");
            for (String produto : produtoList) {
                System.out.println("- " + produto);
            }
        }
    }
}
