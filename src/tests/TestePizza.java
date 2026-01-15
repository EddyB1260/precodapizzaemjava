package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import precoDaPizza.CarrinhoDeCompras;
import precoDaPizza.Pizza;

class TestePizza {

    Pizza p;

    @BeforeEach
    void criaNovaPizza() {
        Pizza.ingredientesUsados.clear();
        p = new Pizza();
    }

    @Test
    void testeGetPreco() {
        p.adicionaIngrediente("Calabresa");
        p.adicionaIngrediente("Queijo");
        assertEquals(15, p.getPreco());
        assertEquals(2, p.ingredientes.size());
    }

    @Test
    void testePizzaQuatroIngredientes() {
        p.adicionaIngrediente("Calabresa");
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Azeitona");
        p.adicionaIngrediente("Picles");
        assertEquals(4, p.ingredientes.size());
        assertEquals(20, p.getPreco());
    }

    @Test
    void testPizzaSeisIngredientes() {
        p.adicionaIngrediente("Calabresa");
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Azeitona");
        p.adicionaIngrediente("Picles");
        p.adicionaIngrediente("Sardinha");
        p.adicionaIngrediente("Gorgonzola");
        assertEquals(6, p.ingredientes.size());
        assertEquals(23, p.getPreco());
    }

    @Test
    void testContabilizaIngrediente() {
        p.adicionaIngrediente("Queijo");
        p.adicionaIngrediente("Queijo");
        assertEquals(2, Pizza.getQuantidadeIngrediente("Queijo"));
    }

    @Test
    void testCarrinhoTresPizzas() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        Pizza pizzaUm = new Pizza();
        pizzaUm.adicionaIngrediente("Queijo");
        pizzaUm.adicionaIngrediente("Calabresa");

        Pizza pizzaDois = new Pizza();
        pizzaDois.adicionaIngrediente("Picles");
        pizzaDois.adicionaIngrediente("Cebola");
        pizzaDois.adicionaIngrediente("Palmito");

        Pizza pizzaTres = new Pizza();
        pizzaTres.adicionaIngrediente("Queijo");
        pizzaTres.adicionaIngrediente("Queijo");
        pizzaTres.adicionaIngrediente("Queijo");
        pizzaTres.adicionaIngrediente("Sardinha");
        pizzaTres.adicionaIngrediente("Presunto");

        c.adicionaPizza(pizzaUm);
        c.adicionaPizza(pizzaDois);
        c.adicionaPizza(pizzaTres);

        assertEquals(3, c.getTamanho());
        assertEquals(55, c.getPreco());
    }
}
