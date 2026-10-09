void main() {
    var tocaDisco = new TocaDisco() {
        @Override
        public void tocaMusica() {
            System.out.println("Tocando Música");
        }

        @Override
        public void pausaMusica() {
            System.out.println("Pausando a Música");
        }

        @Override
        public void paraMusica() {
            System.out.println("Parando a Música");
        }
    };
    tocaDisco.tocaMusica();
}
