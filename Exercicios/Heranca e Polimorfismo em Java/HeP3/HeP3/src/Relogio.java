public sealed abstract class Relogio permits RelogioAmericano, RelogioBrasileiro {
    protected int hora;
    protected int minutos;
    protected int segundos;


    //Get e Set
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 24) {
            this.hora = hora;
            return;
        }
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 60) {
            this.minutos = minutos;
            return;
        }
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos >= 60){
            this.segundos = segundos;
            return;
        }
        this.segundos = segundos;
    }

    //Métodos

    public String formatacao(int valor){
        return valor < 9 ? "0" + valor : String.valueOf(valor);
    }

    public String getTempo(){
        return formatacao(hora) + ":" + formatacao(minutos) + ":" + formatacao(segundos);
    }

    //Conversor
    abstract Relogio conversor(Relogio relogio);
}
