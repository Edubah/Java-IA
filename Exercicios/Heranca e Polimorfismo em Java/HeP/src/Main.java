void main(){
    Ingresso ingresso = new Ingresso();
    Ingresso ingresso2 = new Ingresso();

    ingresso.setNomeFilme("Blade");
    ingresso.setIdioma("Português");
    ingresso.setValorFilme(12);

    ingresso2.setNomeFilme("Vingadores");
    ingresso2.setIdioma("Legendado");
    ingresso2.setValorFilme(12);
    ingresso2.setQuantidade(7);

    System.out.println("Nome do Filme: " + ingresso.getNomeFilme());
    System.out.println("Idioma selecionado: " + ingresso.getIdioma());
    System.out.println("Valor do ingresso = " + ingresso.ingressoMeia());

    System.out.println("\n");

    System.out.println("Nome do Filme: " + ingresso2.getNomeFilme());
    System.out.println("Idioma selecionado: " + ingresso2.getIdioma());
    System.out.println("Valor do ingresso = " + ingresso2.ingressoFamilia());
}