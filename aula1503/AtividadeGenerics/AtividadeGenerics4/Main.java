package AtividadeGenerics.AtividadeGenerics4;

public class Main {

    public static void main(String[] args) {

        Lista<String, Integer> lista = new Lista<>();

        System.out.println(lista.adicionar("key1", 1));
        System.out.println(lista.adicionar("key2", 2));
        System.out.println(lista.adicionar("key1", 3)); // vai retornar falso pq a chave já existe

        Lista<String, String> lista2 = new Lista<>();
        System.out.println(lista2.adicionar("key1", "value1"));
        System.out.println(lista2.adicionar("key1", "value2"));
        System.out.println(lista2.adicionar("key2", "value3"));

    }

}
