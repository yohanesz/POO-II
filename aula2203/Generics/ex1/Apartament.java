import java.util.ArrayList;
import java.util.List;

public class Apartament<T> {

    private List<T> itens;

    public Apartament() {
        this.itens = new ArrayList<T>();
    }

    public void adicionarItens(T item) {
        this.itens.add(item);
    }

    public List<T> getItens() {
        return this.itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    public void listarItens() {
        System.out.println("Itens no apartamento:");
        for (T item : this.itens) {
            System.out.println(item);
        }
    }

}
