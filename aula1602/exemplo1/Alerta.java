package aula1602.exemplo1;

public class Alerta {

    protected Notificacao notificacao;

    public Alerta(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public String dispararAlerta() {
        return this.notificacao.enviar();
    }
    
}
