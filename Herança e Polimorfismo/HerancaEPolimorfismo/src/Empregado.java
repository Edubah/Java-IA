//Abstract = Classes abstratas não podem ser instanciadas.
//Sealed = Classes que não pode ser herdada por outras classes, impedindo assim a extensão de sua hierarquia
//Final = Não permite "extender" a classe
public sealed abstract class Empregado permits Gerente, Vendedor {
    protected String codigo;
    protected String nome;
    protected String endereco;
    protected int idade;
    protected double salario;

    //Construtor
    public Empregado(String codigo, String nome, String endereco, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.salario = salario;
    }

    public Empregado() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract double getSalarioCompleto();
}
