package Exemplo1;

public class Banana {

    private String tipo;
    private String origem;

    public Banana() {
    }

    public Banana(String tipo, String origem) {
        setTipo(tipo);
        setOrigem(origem);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return "Banana [tipo=" + tipo + ", origem=" + origem + "]";
    }
}