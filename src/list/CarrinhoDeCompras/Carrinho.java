package list.CarrinhoDeCompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> carrinhoDeCompras;

    public Carrinho(List<Item> carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public void adicionarItem(String nome, BigDecimal preco, Integer quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item i : carrinhoDeCompras){
            if (i.getNomeDoItem().equalsIgnoreCase(nome)){
                itemParaRemover.add(i);
            }
        }
        carrinhoDeCompras.removeAll(itemParaRemover);
    }

    public BigDecimal calcularValorTotal(){

        return null;
    }

}
