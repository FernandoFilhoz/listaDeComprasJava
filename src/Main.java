import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria um cliente com o nome "José"
        Cliente cliente = new Cliente("José");

        // Exibe uma mensagem de boas-vindas
        System.out.println("Olá, cliente " + cliente + "!");
        System.out.println("Adicione os produtos que você deseja comprar.");

        Carrinho carrinho = new Carrinho(); // Cria um novo carrinho de compras
        Scanner entrada = new Scanner(System.in); // Cria um scanner para entrada do teclado

        // Permite adicionar vários produtos até digitar "fim"
        while (true) {
            System.out.print("Digite o nome do produto (ou 'fim' para terminar): ");
            String produto = entrada.nextLine();

            if (produto.equalsIgnoreCase("fim")) {
                break; // Sai do loop se o usuário digitar "fim"
            }

            carrinho.adicionarProduto(produto); // Adiciona o produto ao carrinho
        }

        carrinho.mostrarProduto(); // Exibe os produtos adicionados

        // Pergunta se o usuário quer remover algum produto
        System.out.print("Deseja remover algum produto? (S/N): ");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("S")) {
            // Solicita o nome do produto a ser removido
            System.out.print("Digite o nome do produto que deseja remover: ");
            String produtoRemover = entrada.nextLine();

            // Tenta remover o produto (sem diferenciar maiúsculas/minúsculas)
            if (carrinho.removerProduto(produtoRemover)) {
                System.out.println("Produto removido.");
            } else {
                System.out.println("Produto não encontrado.");
            }

            // Mostra a lista atualizada
            carrinho.mostrarProduto();
        }

        entrada.close(); // Fecha o Scanner (boa prática)
        System.out.println("Obrigado por utilizar o sistema!");
    }
}
