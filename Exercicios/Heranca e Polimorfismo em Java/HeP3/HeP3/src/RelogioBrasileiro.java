public non-sealed class RelogioBrasileiro extends Relogio{



    @Override
    public Relogio conversor(Relogio relogio) {
        this.segundos = relogio.getSegundos();
        this.minutos = relogio.getMinutos();
        switch (relogio){
             case RelogioAmericano relogioAmericano -> this.hora = (relogioAmericano.getIndicadorPeriodo().equals("PM")) ?
                        relogioAmericano.getHora() +12 :
                        relogioAmericano.getHora();
            case RelogioBrasileiro relogioBrasileiro -> this.hora = relogioBrasileiro.getHora();

        }
        return this;
    }
}
