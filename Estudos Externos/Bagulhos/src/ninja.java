public class ninja {
    private String nome;
    private String aldeia;
    private int idade;
    private String rank;

    // Criar um Getter para criar algo para mostrar ao usuário
    public String getNome(){
        return nome;
    }

    // Criar um Setter para dar valor à variável
    public void setNome(String nome){
        this.nome = nome;
    }

    public void ataqueBasico(){
        System.out.println("Ataque básico, toma uma kunai!");
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
