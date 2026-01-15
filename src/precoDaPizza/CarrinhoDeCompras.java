package precoDaPizza;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public Integer getTamanho() {
        return pizzas.size();
    }

    public Integer getPreco() {
        int total = 0;
        for (Pizza p : pizzas) {
            total += p.getPreco();
        }
        return total;
    }

    public void adicionaPizza(Pizza pizza) {
        if (pizza == null || pizza.ingredientes.isEmpty()) {
           throw new IllegalArgumentException("Pizza vazia não pode ser adicionada ao carrinho!");
        }
        pizzas.add(pizza);
    }

}
