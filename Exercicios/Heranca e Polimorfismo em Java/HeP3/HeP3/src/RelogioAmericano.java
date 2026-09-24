public non-sealed class RelogioAmericano extends Relogio{

    private String indicadorPeriodo;

    //Get e Set


    public String getIndicadorPeriodo() {
        return indicadorPeriodo;
    }

    public void setIndicadorPeriodo(String indicadorPeriodo) {
        this.indicadorPeriodo = indicadorPeriodo;
    }

    public void aposMeioDia(){
        this.indicadorPeriodo = "PM";
    }

    public void antesMeioDia(){
        this.indicadorPeriodo = "AM";
    }

    //Métodos
    public void setHora(int hora) {
        antesMeioDia();
        if ((hora >= 12) && (hora <= 23)) {
            aposMeioDia();
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        }else {
            this.hora = hora;
        }
    }

    @Override
    Relogio conversor(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getMinutos();
        switch (relogio){
            case RelogioAmericano relogioAmericano -> {
                this.hora = relogioAmericano.getHora();
                this.indicadorPeriodo = relogioAmericano.getIndicadorPeriodo();
            }
            case RelogioBrasileiro relogioBrasileiro -> this.setHora(relogioBrasileiro.getHora());

        }
        return this;
    }

    @Override
    public String getTempo() {
        return super.getTempo() + " " + this.indicadorPeriodo;
    }
}
