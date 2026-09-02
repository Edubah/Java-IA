import java.util.Scanner;


void main() {
    var scanner = new Scanner(System.in);

    var codigoInformado = scanner.nextLine();
    var codigoEsperado = scanner.nextLine();

    //String[] codigoEsperado = {"AG123 AG123", "#CX9 #CX9"};

    if(codigoInformado.equals(codigoEsperado)){
        System.out.println("ACESSO LIBERADO");
    } else {
        System.out.println("ACESSO NEGADO");
    }
}




































    /*Segunda forma
    for (var i = 1; i <= 100; i++){
        if (i == 100) {
            System.out.println("Fim da execução!");
            break;
        }
        System.out.println(i);
    }*/


    /*Primeira forma
    for (;;){
        System.out.println("Digite um nome: ");
        var nome = scanner.next();

        if (nome.equalsIgnoreCase("exit")) break;
        {
            System.out.println(nome);
        }
    }*/


/* Estuturas Condicionais IF/ELSE/ELSE-IF
void main() {
    var scanner = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    var name = scanner.next();

    System.out.println("Informe sua idade: ");
    var idade = scanner.nextInt();

    System.out.println("Você é emancipado? ");
    var eEmanciapado = scanner.next().equalsIgnoreCase("s");

    if (idade >= 18) {
        System.out.printf("%s tem %s anos, você pode dirigir! \n", name, idade);
    } else if (idade >= 16 && eEmanciapado){
        System.out.printf("%s, apesar de ter %s anos, você é emancipado(a) e pode dirigir. \n", name, idade);
        ;
    } else {
        System.out.printf("%s, você não pode dirigir \n", name);
    }
    System.out.println("Fim da execução!! <3");
}
*/


