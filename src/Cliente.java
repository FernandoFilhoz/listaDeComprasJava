public class Cliente {
    private String nome; // Armazena o nome do cliente

    // Construtor: define o nome do cliente ao criar o objeto
    public Cliente(String nome) {
        this.nome = nome;
    }

    // Sobrescreve o método toString para retornar o nome diretamente
    @Override
    public String toString() {
        return nome;
    }
}
