public class FabricaAlunoFisica implements FabricaDeAluno{

    @Override
    public Aluno criarAluno() {
        return new Fisica();
    }


    
}
