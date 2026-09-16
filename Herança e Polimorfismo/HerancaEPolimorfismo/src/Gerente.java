public non-sealed class Gerente extends Empregado{
    private String login;
    private String senha;
    private double comissao;

    public String getCodigo(){
        return "GR" + super.getCodigo();
    }

    @Override //Sobreescrever o método!
    public double getSalarioCompleto() {
        return this.salario + this.comissao;
    }



    public Gerente(String codigo, String nome, String endereco, int idade, double salario, String login, String senha, double comissao) {
        super(codigo, nome, endereco, idade, salario); //Super = Aciona algum comportamento da classe pai
        this.login = login;
        this.senha = senha;
        this.comissao = comissao;
    }

    public Gerente() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
