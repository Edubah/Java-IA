void main(){
    mostraEmpregado((new Gerente()));
    mostraEmpregado(new Vendedor());



}

public static void mostraEmpregado(Empregado empregado){
    //Instanceof verifica se um objeto é uma instância de uma determinada classe
    //colocando o "gerente" após a classe Gerente, já pode setar uma variável para ela
    /*if (empregado instanceof Gerente gerente) {
        empregado.setNome("Eduardo");
        gerente.setLogin("Eduu");
        gerente.setSenha("222");


        System.out.println(empregado.getNome());
        System.out.println(((Gerente) empregado).getLogin());
        System.out.println(((Gerente) empregado).getSenha());
    }*/
    System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

    switch (empregado){
        case Gerente gerente ->{
            empregado.setCodigo("1");
            empregado.setSalario(5000);
            empregado.setNome("Eduardo");
            gerente.setLogin("Eduu");
            gerente.setSenha("222");
            gerente.setComissao(2000);


            System.out.println(empregado.getCodigo());
            System.out.println(empregado.getSalario());
            System.out.println(empregado.getNome());
            System.out.println(((Gerente) empregado).getLogin());
            System.out.println(((Gerente) empregado).getSenha());
            System.out.println(gerente.getComissao());
        }
        case Vendedor vendedor ->{
            vendedor.setCodigo("1");
            vendedor.setSalario(5000);
            vendedor.setNome("Vânia");
            vendedor.setPorcentagemPorVenda(50);
            vendedor.setValorVendido(1500);


            System.out.println(vendedor.getCodigo());
            System.out.println(vendedor.getSalario());
            System.out.println(vendedor.getNome());
            System.out.println(vendedor.getPorcentagemPorVenda());
            System.out.println(vendedor.getValorVendido());
        }
    }
    System.out.println(empregado.getSalarioCompleto());
    System.out.println("=====================");

}