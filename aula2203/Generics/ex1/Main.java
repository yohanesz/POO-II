
public class Main {

    public static void main(String[] args) {

        Apartament<String> ap = new Apartament<>();

        ap.adicionarItens("Sofá");
        ap.adicionarItens("Cama");
        ap.adicionarItens("Mesa");
        ap.listarItens();

    }

}
