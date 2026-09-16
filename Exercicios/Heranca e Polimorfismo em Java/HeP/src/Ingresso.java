public class Ingresso {
    String nomeFilme;
    double valorFilme;
    String idioma;
    int quantidade;
    double percentual = 5.0 / 100.0;

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getValorFilme() {
        return valorFilme;
    }

    public void setValorFilme(double valorFilme) {
        this.valorFilme = valorFilme;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double ingressoMeia(){
        return valorFilme / 2;
    }

    public double ingressoFamilia(){
        if (quantidade > 3){
            double valorQuantidade = valorFilme * quantidade;
            double desconto = valorQuantidade * percentual;
            double valorIngresso = valorQuantidade - desconto;
            return  valorIngresso;

        }else {
            return valorFilme * quantidade;
        }
    }
}
