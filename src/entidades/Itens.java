import java.util.ArrayList;

public class Itens {
    private ArrayList<Produto> itens;

    public ArrayList<Produto> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Produto> itens) {
        this.itens = itens;
    }

    public void addItem(Produto produto){
        itens.add(produto);
    }

    public void removeItem(Produto produto){
        itens.remove(produto);
    }
}
