//Interfaces são obrigatoriamente PÚBLICAS, ESTÁTICAS e FINAIS
public interface TocaDisco {

    String musica = "And I'm Telling You";

    //Interfaces só permitem métodos abstratos
    void tocaMusica();
    void pausaMusica();
    void paraMusica();
}
