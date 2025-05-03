package view;
<<<<<<< HEAD
import java.util.Scanner;
import model.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaCorrente conta1 = new ContaCorrente(123321, "Joao da Silva");

        int n=0;
        System.out.println("Bem vindo! Menu:");

        //loop
        while(n!=4) {
            System.out.println("\n1 - Sacar\n2 - Depositar\n3 - Consultar Saldo\n4 - Sair");
            System.out.print("Digite o número: ");
            n = scanner.nextInt();

            if (n == 1) {
                System.out.print("Informe o valor do saque: R$");
                float dinheiro = scanner.nextFloat();
                System.out.println(conta1.sacar(dinheiro));
            }

            if(n == 2){
                System.out.print("Informe o valor do depósito: R$");
                float dinheiro = scanner.nextFloat();
                System.out.println(conta1.depositar(dinheiro));
            }

            if(n == 3) System.out.println("Saldo: " + conta1.getSaldo());

            if(n == 4) System.out.println("Saindo...");
        }

=======
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
>>>>>>> c45010a4cc3d1cb9c01fafb7e26a211265039c77
    }
}