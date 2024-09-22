package list.CarrinhoDeCompras;


import java.math.BigDecimal;

public class Item {
    private String nomeDoItem;
    private BigDecimal preco;
    private Integer quantidade;

    public Item(String nomeDoItem, BigDecimal preco, Integer quantidade) {
        this.nomeDoItem = nomeDoItem;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeDoItem() {
        return nomeDoItem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return  "nomeDoItem='" + nomeDoItem + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade;
    }
}
