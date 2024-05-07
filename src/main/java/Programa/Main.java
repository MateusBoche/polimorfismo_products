package Programa;

import entidades.Importado;
import entidades.Produto;
import entidades.Usado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    private void start() {
        List<Produto>lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o numero de products: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("o produto é importado(i), o produto é comum(c) ou usado(u)");
            String opcao = sc.nextLine();



            if (opcao.equals("i")){
                System.out.println("nome: ");
                String nome = sc.nextLine();
                System.out.println("Preço: ");
                double preco = sc.nextDouble();
                System.out.println("digite a taxa: ");
                double taxa = sc.nextDouble();
                Produto produto = new Importado(nome,preco,taxa);
                lista.add(produto);
            }else if(opcao.equals("c")){
                System.out.println("nome: ");
                String nome = sc.nextLine();
                System.out.println("Preço: ");
                double preco = sc.nextDouble();
                Produto produto = new Produto(nome,preco);
                lista.add(produto);
            }else if(opcao.equals("u")) {
                System.out.println("nome: ");
                String nome = sc.nextLine();
                System.out.println("Preço: ");
                double preco = sc.nextDouble();
                System.out.println("Data: ");
                sc.nextLine();
                String data = sc.nextLine();
                Produto produto = new Usado(nome,preco,data);
                lista.add(produto);
            }

        }
        for(Produto produto:lista){
            System.out.println(produto.precotag());
        }
    }
}
