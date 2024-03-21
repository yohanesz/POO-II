package WildCards.UpperBoundedExtends;

import java.util.ArrayList;
import java.util.List;

public class Numeros {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        printNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

}
