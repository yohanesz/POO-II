package AtividadeGenerics.AtividadeGenerics2;

public class Produto<T> {

    private T id;
    private double valor;
    private String dataFabricacao;
    private String dataVencimento;

    public Produto(T id, double valor, String dataFabricacao, String dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", valor=" + valor + ", dataFabricacao=" + dataFabricacao + ", dataVencimento="
                + dataVencimento + "]";
    }

}
