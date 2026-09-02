import java.time.OffsetDateTime;

public class Pessoa {

    private String nome;
    private int idade;
    private int ultimoAnoIncremento = OffsetDateTime.now().getYear(); //OffsetDateTime para puxar o horário/data atual usando o NOW e o get.YEAR para o ano

    //Construtor
    public Pessoa(String nome){
        this.nome = nome;
        this.idade = 1;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void incAno(){
        if (this.ultimoAnoIncremento >= OffsetDateTime.now().getYear()) return;;

        this.idade +=1;
        this.ultimoAnoIncremento = OffsetDateTime.now().getYear();
    }
}
