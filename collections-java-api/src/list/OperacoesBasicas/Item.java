package list.OperacoesBasicas;

import java.math.BigDecimal;

public class Item {

    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

    public Item(String nome, BigDecimal preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
