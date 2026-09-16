public class Vendedor extends Usuario{
    //Variáveis
    int qtdVendas;
    boolean admin = false;


    //Get e Set
    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    //Contrutor

    public Vendedor(int qtdVendas, boolean admin) {
        this.qtdVendas = qtdVendas;
        this.admin = admin;
    }

    public Vendedor() {
    }

    //Métodos
    public int realizarVenda(int nVendas){
        System.out.println("Venda incrementada: " + nVendas);
        return + nVendas;
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
