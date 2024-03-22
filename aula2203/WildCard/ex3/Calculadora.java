import java.util.List;

public abstract class Calculadora {

    public static void calculate(List<? extends Number> listaNumbers) {
        double media = 0;
        double sum = 0;

        for (Number n : listaNumbers) {
            sum += n.doubleValue();
        }

        media = sum / listaNumbers.size();
        System.out.println(media);
    }

}
