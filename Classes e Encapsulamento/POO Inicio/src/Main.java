//Classes
void main() {

    var homem = new Pessoa("Eduardo");

    var mulher = new Pessoa("Caroline");

    System.out.printf("Nome do Homem : " + homem.getNome() + " e sua idade de: " + homem.getIdade() + " anos. \n");
    System.out.printf("Nome do Homem : " + mulher.getNome() + " e sua idade de: " + mulher.getIdade() + " anos.");
}
