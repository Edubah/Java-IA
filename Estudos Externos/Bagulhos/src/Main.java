void main(){
    uzumaki naruto = new uzumaki();
    naruto.setNome("Naruto");
    naruto.temBiju = true;
    naruto.getNome();
    System.out.println("Meu nome é: " + naruto.getNome());
    naruto.ataqueBasico();


    uchiha sasuke = new uchiha();
    sasuke.setNome("Sasuke");
    sasuke.getNome();
    System.out.println("Meu nome é: " + sasuke.getNome());
    sasuke.sharinganAtivado();
    sasuke.ataqueBasico();
    sasuke.ataqueBasico(35);
}