package precoDaPizza;

import java.util.LinkedHashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<String> todosIngredientes = new LinkedHashSet<>();

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Tomate");
        todosIngredientes.add("Queijo");
        todosIngredientes.add("Tomate");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Calabresa");
        p2.adicionaIngrediente("Cebola");
        p2.adicionaIngrediente("Picles");
        todosIngredientes.add("Calabresa");
        todosIngredientes.add("Cebola");
        todosIngredientes.add("Picles");

        Pizza p3 = new Pizza();
        p3.adicionaIngrediente("Queijo");
        p3.adicionaIngrediente("Queijo"); // exemplo de ingrediente repetido na mesma pizza
        p3.adicionaIngrediente("Presunto");
        todosIngredientes.add("Presunto");

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(p1);
        carrinho.adicionaPizza(p2);
        carrinho.adicionaPizza(p3);

        System.out.println("Quantidade de pizzas no carrinho: " + carrinho.getTamanho());
        System.out.println("Total do carrinho: R$" + carrinho.getPreco());

           System.out.println("\nQuantidade utilizada de cada ingrediente (todas as pizzas):");
        for (String ingrediente : todosIngredientes) {
            int qtd = Pizza.getQuantidadeIngrediente(ingrediente);
            System.out.println(ingrediente + ": " + qtd);
        }
    }
}
