import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listaNumbers = new ArrayList<Integer>();

        listaNumbers.add(2);
        listaNumbers.add(2);
        listaNumbers.add(2);
        listaNumbers.add(2);

        Calculadora.calculate(listaNumbers);

    }

}
