public class Conexao {

    private String host;
    private int porta;
    private String user;
    private String pass;

    public Conexao conectarEm (String host) {
        this.host = host;
        return this;
    }

    public Conexao naPorta(int porta) {
        this.porta = porta;
        return this;
    }

    public Conexao usandoOUsuario(String user) {
        this.user = user;
        return this;
    }

    public Conexao comASenha(String pass) {
        this.pass = pass;
        return this;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Conexao [host=" + host + ", porta=" + porta + ", user=" + user + ", pass=" + pass + "]";
    }

}