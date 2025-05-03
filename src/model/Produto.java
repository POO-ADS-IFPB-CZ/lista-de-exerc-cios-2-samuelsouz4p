package model;

public class Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        setPreco(preco);
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque(){
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco>=0){
            this.preco = preco;
        }
        else System.out.println("EERO: O preço não pode ser negativo!");
    }

    public void exibirInfo(){
    System.out.println("Código: " +codigo+ " | Nome: " +nome+ " | Preço: " +preco+ " | Estoque: " +estoque);
    }
}
