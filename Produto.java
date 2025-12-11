public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
  
    void exibirDados() {
        System.out.println(nome + " | R$" + preco + " | Quant: " + quantidade);
    }

    double valorTotalEmEstoque() {
        return preco * quantidade;
    }
}
