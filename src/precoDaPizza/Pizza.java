package precoDaPizza;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
   public static HashMap<String, Integer> ingredientesUsados = new HashMap<>();

    public ArrayList<String> ingredientes = new ArrayList<>();

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public int getPreco() {
        int qtdIngredientes = ingredientes.size();
        if (qtdIngredientes <= 2) {
            return 15;
        } else if (qtdIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }


    private static void contabilizaIngrediente(String ingrediente) {
        ingredientesUsados.put(ingrediente, ingredientesUsados.getOrDefault(ingrediente, 0) + 1);
    }

    public static int getQuantidadeIngrediente(String ingrediente) {
        return ingredientesUsados.getOrDefault(ingrediente, 0);
    }
}
