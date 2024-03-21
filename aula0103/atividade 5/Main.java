public class Main {

    public static void main(String[] args) {
        
        
        Conexao conn = new Conexao()
        .conectarEm(null)
        .naPorta(0)
        .comASenha(null)
        .usandoOUsuario(null);
        
    System.out.println(conn);   
        
    }
    
}
