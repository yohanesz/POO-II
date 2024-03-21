package AtividadeGenerics.AtividadeGenerics1;

public class Main {

    public static void main(String[] args) {

        Generico<Integer> generic = new Generico<Integer>(5);
        System.out.println("Integer type: " + generic.getObject());

        Generico<String> str = new Generico<String>("Lorem Ipsum");
        System.out.println("String type: " + str.getObject());

        Generico<Boolean> bool = new Generico<Boolean>(true);
        System.out.println("Boolean type: " + bool.getObject());

        Pessoa p = new Pessoa("Yohanês", 19);
        Generico<Pessoa> person = new Generico<Pessoa>(p);
        System.out.println("Nome: " + person.getObject().getNome());
        System.out.println("Idade: " + person.getObject().getidade());
    }

}
