ic class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Meu Livro");

        livro.addCapitulo("Introdução");
        livro.addCapitulo("Capítulo 1");
        livro.addCapitulo("Capítulo 2");

        // Exibindo informações do livro e de seus capítulos
        System.out.println("Título do Livro: " + livro.getTitle());
        System.out.println("Capítulos:");

        for (String chapter : livro.getCapitulo()) {
            System.out.println(" - " + chapter);
        }
    }
}