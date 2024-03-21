package Atividade1;

public class Main {

    public static void main(String[] args) {

        // Generic2 comp = new Generic2();

        Integer[] anArray = new Integer[10];
        Integer elem = 5;

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = i;
        }

        System.out.println(Generic2.countGreaterThan(anArray, elem));
    }

}
