package ordenacao;

import java.util.*;

class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + preco;
    }
}

public class BubbleSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Preço do produto " + (i + 1) + ": ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); 
            produtos.add(new Produto(nome, preco));
        }

        for (int i = 0; i < produtos.size() - 1; i++) {
            for (int j = 0; j < produtos.size() - 1 - i; j++) {
                if (produtos.get(j).preco < produtos.get(j + 1).preco) {
                    // Troca
                    Produto temp = produtos.get(j);
                    produtos.set(j, produtos.get(j + 1));
                    produtos.set(j + 1, temp);
                }
            }
        }

        System.out.println("\nMais caro para o mais barato:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        scanner.close();
    }
}
