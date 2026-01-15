package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import precoDaPizza.CarrinhoDeCompras;
import precoDaPizza.Pizza;

class CarrinhoDeComprasTeste {

    
    @Test
    void testePizzaVazia() {
    	CarrinhoDeCompras c = new CarrinhoDeCompras();
    	Pizza p = new Pizza();
    	assertThrows(IllegalArgumentException.class, () -> c.adicionaPizza(p));

    }

    @Test
    void testeCarrinhoVazio() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();
        assertEquals(0, c.getTamanho());
        assertEquals(0, c.getPreco());
    }
    
    @Test
    void testeAdicionaMultiplasPizzas() {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        Pizza p1 = new Pizza();
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("Calabresa");

        Pizza p2 = new Pizza();
        p2.adicionaIngrediente("Cebola");
        p2.adicionaIngrediente("Picles");

        c.adicionaPizza(p1);
        c.adicionaPizza(p2);

        assertEquals(2, c.getTamanho());
        assertEquals(p1.getPreco() + p2.getPreco(), c.getPreco());
    }
    


    
}
