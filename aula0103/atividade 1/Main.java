public class Main {

    public static void main(String[] args) {
        
        FabricaDeAluno fabrica = new FabricaAlunoCienciaComputacao();
        Aluno aluno = fabrica.criarAluno();
        System.out.println(aluno.exibitInfo());

        fabrica = new FabricaAlunoFisica();
        aluno = fabrica.criarAluno();
        System.out.println(aluno.exibitInfo());

        fabrica = new FabricaAlunoMecatronica();
        aluno = fabrica.criarAluno();
        System.out.println(aluno.exibitInfo());
    }
    
}
