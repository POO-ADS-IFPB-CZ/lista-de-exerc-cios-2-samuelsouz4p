package view;
import model.Produto;

public class Main {
    public static void main(String[] args){

        Produto p1 = new Produto(1,"Arroz",-6.70,99);
        Produto p2 = new Produto(2,"Feijão",5.50,115);

        p1.exibirInfo();
        p2.exibirInfo();

        //mudando o preço
        p1.setPreco(6.70);
        p1.exibirInfo();

        //testando preço negativo
        p1.setPreco(-6.70);
    }
}