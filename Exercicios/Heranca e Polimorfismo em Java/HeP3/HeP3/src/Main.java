void main() {
    Relogio relogioB = new RelogioBrasileiro();
    Relogio relogioA = new RelogioAmericano();

    relogioB.setSegundos(20);
    relogioB.setMinutos(10);
    relogioB.setHora(14);

    System.out.println(relogioB.getTempo());

    System.out.println(new RelogioAmericano().conversor(relogioB).getTempo());
}
