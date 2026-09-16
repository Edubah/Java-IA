public non-sealed class Vendedor extends Empregado{
    private double porcentagemPorVenda;
    private double valorVendido;

    public Vendedor(String codigo, String nome, String endereco, int idade, double salario, double porcentagemPorVenda, double valorVendido) {
        super(codigo, nome, endereco, idade, salario); //Super = Aciona algum comportamento da classe pai
        this.porcentagemPorVenda = porcentagemPorVenda;
        this.valorVendido = valorVendido;
    }

    @Override
    public String getCodigo(){
        return "VD" + super.getCodigo(); //Cria um sufixo e o super puxando o comportamento de outra classe
    }

    @Override
    public double getSalarioCompleto() {
        return this.salario + ((valorVendido * porcentagemPorVenda) /100);
    }

    public Vendedor() {
    }

    public double getPorcentagemPorVenda() {
        return porcentagemPorVenda;
    }

    public void setPorcentagemPorVenda(double porcentagemPorVenda) {
        this.porcentagemPorVenda = porcentagemPorVenda;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
}
