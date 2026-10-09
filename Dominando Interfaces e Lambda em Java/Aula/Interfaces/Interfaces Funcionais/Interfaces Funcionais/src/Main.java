void main(){
    //Declaração da Lista
    List<Usuario> usuarios = List.of(new Usuario("Eduardo", 28), new Usuario("Joyce", 24),
            new Usuario("Vânia", 56));


    //Consumer é uma Interface Funcional,
    // Ela representa uma operação que aceita um argumento de entrada e não retorna resultado
    // (tipo de retorno void).

    // "accept(T t)": Este é o método abstrato principal da interface.
    // Ele executa a operação definida na implementação (via lambda ou método)
    //  sobre o argumento de entrada fornecido.

    var consumidor = new Consumer<Usuario>() {
        @Override
        public void accept(Usuario usuario) {

        }
    };
}