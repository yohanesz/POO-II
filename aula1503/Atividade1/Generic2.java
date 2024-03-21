package Atividade1;

import java.lang.Comparable;

public class Generic2 {

    public static <T extends Comparable<T>> int

            countGreaterThan(T[] anArray, T elem) {

        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0) // compareTo verifica se um objeto é maior, menor ou igual ao outro, retorna um
                                       // inteiro (negativo = objeto atual é menor que o comparado), (zero = iguais),
                                       // (positivo = maior que o comparado)
                count++;
        return count;
    }

}
