package AtividadeGenerics.AtividadeGenerics2;

public class Main {

    public static void main(String[] args) {

        Produto<String> randomProduct1 = new Produto<String>("1", 125.90, "17/03/2024", "17/04/2024");
        System.out.println("Id do tipo String: " + randomProduct1.getId());

        Produto<Integer> randomProduct2 = new Produto<Integer>(2, 130.99, "17/03/2024", "17/04/2024");
        System.out.println("Id do tipo Integer: " + randomProduct2.getId());

    }
}
