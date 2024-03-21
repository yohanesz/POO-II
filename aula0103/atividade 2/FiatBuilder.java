public class FiatBuilder extends CarroBuilder {

    @Override
    public void buildPreco() {
        carro.setPreco(33000.00);
    }

    @Override
    public void buildDscMotor() {
        carro.setDscMotor("1.4 flex");
    }

    @Override
    public void builAnoDeFabricacao() {
        carro.setAnoDeFabricacao(2018);
    }

    @Override
    public void buildModelo() {
        carro.setModelo("Palio");
    }

    @Override
    public void buildMontadora() {
        carro.setMontadora("Fiat");
    }




    
}
