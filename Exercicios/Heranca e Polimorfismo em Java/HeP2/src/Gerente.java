public class Gerente extends Usuario{
    //Variáveis
    boolean admin = true;


    //Get e Set
    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    //Contrutor
    public Gerente(boolean admin) {
        this.admin = admin;
    }

    public Gerente(String nome, String email, String senha, boolean admin) {
        super(nome, email, senha);
        this.admin = admin;
    }

    public Gerente() {
    }

    //Métodos

    public void geraRelFinanceiro(){
        System.out.println("Relatório Financeiro!");
    }

    @Override
    public void consultaVendas() {
        super.consultaVendas();
    }

    @Override
    public void realizarLogin() {
        super.realizarLogin();
    }

    @Override
    public void realizarLogoff() {
        super.realizarLogoff();
    }

    @Override
    public void alterarDados() {
        super.alterarDados();
    }

    @Override
    public void alterarSenha() {
        super.alterarSenha();
    }
}
