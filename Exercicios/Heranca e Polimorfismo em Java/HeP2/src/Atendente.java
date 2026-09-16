public class Atendente extends Usuario{
    //Variáveis
    double valorCaixa;
    boolean admin = false;


    //Get e Set
    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    //Contrutor
    public Atendente(double valorCaixa, boolean admin) {
        this.valorCaixa = valorCaixa;
        this.admin = admin;
    }

    public Atendente() {
    }

    //Métodos

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
