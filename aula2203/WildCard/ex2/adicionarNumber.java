import java.util.ArrayList;
import java.util.List;

public class adicionarNumber {

    public static void adicionarNumeros(List<? extends Number> numeros, Number value) {
        numeros.add(value);
    }

    public static void main(String[] args) {

        List<Float> numeros = new ArrayList<Float>();
        List<Integer> numeros2 = new ArrayList<Integer>();

        adicionarNumeros(numeros, 1.0);
        adicionarNumeros(numeros2, 39);

        for (Float n : numeros) {
            System.out.println(n);
        }

        for (Integer n : numeros2) {
            System.out.println(n);
        }
    }
}
