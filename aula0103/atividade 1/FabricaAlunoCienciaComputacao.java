public class FabricaAlunoCienciaComputacao implements FabricaDeAluno{

    @Override
    public Aluno criarAluno() {
        return new CienciaComputacao();
    }


    
}
