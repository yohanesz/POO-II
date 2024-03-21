public class Pizza {
    
    private int tamanho = 10;
    private boolean queijo = false;
    private boolean tomate = false;
    private boolean bacon = false;
    
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public boolean isQueijo() {
        return queijo;
    }
    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }
    public boolean isTomate() {
        return tomate;
    }
    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }
    public boolean isBacon() {
        return bacon;
    }
    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }
}