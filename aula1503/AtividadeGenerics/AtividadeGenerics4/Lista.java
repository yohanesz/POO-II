package AtividadeGenerics.AtividadeGenerics4;

import java.util.ArrayList;
import java.util.List;

public class Lista<K, V> {

    private List<Pair<K, V>> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public boolean adicionar(K key, V value) {

        for (Pair<K, V> pair : lista) {
            if (pair.getKey().equals(key)) {
                return false;
            }
        }

        Pair<K, V> newPair = new Pair<>(key, value);
        lista.add(newPair);
        return true;

    }

    public V getValue(K key) {
        for (Pair<K, V> pair : lista) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        return null;
    }

}
