public class Usuario {
    String nome;
    String email;
    String senha;

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Contrutor

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario() {
    }

    //Métodos
    public void consultaVendas(){
        System.out.println("Vendas Consultadas!");
    }

    public void realizarLogin(){
        System.out.println("Login Realizado!");
    }

    public void realizarLogoff(){
        System.out.println("Logoff Realizado!");
    }

    public void alterarDados(){
        System.out.println("Dados Alterados!");
    }

    public void alterarSenha(){
        System.out.println("Senha Alterada!");
    }
}
