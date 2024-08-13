package list.OperacoesBasicas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItem;

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, BigDecimal preco, Integer quantidade) {
        listaItem.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome) {
        for(Item item : listaItem) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                listaItem.remove(item);
            }
        }
    }

    public BigDecimal calcularValorTotal(){

        return listaItem.stream()
                .map(item -> item.getPreco().multiply(new BigDecimal(item.getQuantidade())))
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }
}
