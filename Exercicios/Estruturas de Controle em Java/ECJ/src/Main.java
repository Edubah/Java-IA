/*//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número para ver a sua tabuada: ");
    int n = scanner.nextInt();

    for(int i = 1; i <= 10; i++){
        int tabuada = n*i;
        System.out.printf("%s x %s = %s \n",n, i, tabuada);
    }
}
*/

/* Exercício 2
void main(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    System.out.println("Digite seu peso: ");
    double peso = scanner.nextDouble();
    
    double imc = (peso/(altura*altura));
    
    if(imc <= 18.5){
        System.out.printf("Seu IMC é %.2f%n e você está abaixo do peso!", imc);
    } else if (imc >= 18.6 & imc <= 24.9) {
        System.out.printf("Seu IMC é %.2f%n e você está no peso ideal!", imc);
    }else if (imc >= 30.0 & imc <= 34.9){
        System.out.printf("Seu IMC é %.2f%n e você está em obesidade grau 1!", imc);
    } else if (imc >= 35.0 & imc <= 39.9) {
        System.out.printf("Seu IMC é %.2f%n e você está em obesidade grau 2 (Severa)!!", imc);
    } else if (imc >=40.0) {
        System.out.printf("Seu IMC é %.2f%n e você está em obesidade grau 3 (Mórbida)!!!", imc);
    }
}
*/

/*Exercício 3
void main(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o primeiro número: ");
    int n1 = scanner.nextInt();

    System.out.println("Informe o segundo número, que seja maior que o primeiro: ");
    int n2 = scanner.nextInt();

    System.out.println("Agora escolha entre [1] PAR ou [2] ÍMPAR: ");
    int escolha = scanner.nextInt();

    int min = Math.min(n1, n2);
    int max = Math.max(n1, n2);

    switch (escolha) {
        case 1:
            for(int i = min; i <= max; i++){
                if (i % 2 == 0){
                    System.out.println(i + " ");
                }
            }
            break;

        case 2:
            for (int i = min; i <= max; i++){
                if (i % 2 != 0) {
                    System.out.println(i + " ");
                }
            }
    }
}
*/

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o número inicial:");
    int numeroInicial = scanner.nextInt();

    List<Integer> numeros = new ArrayList<>();
    numeros.add(numeroInicial);

    while (true) {
        System.out.println("Informe outro número:");
        int n = scanner.nextInt();

        // Ignora números menores que o inicial
        if (n < numeroInicial) {
            System.out.println("Número ignorado.");
            continue;
        }

        // Se o resto for diferente de 0, encerra
        if ((n % numeroInicial) != 0) {
            System.out.println("O resto da divisão foi diferente de zero.");
            break;
        }

        numeros.add(n);
    }

    System.out.println("Números informados:");
    System.out.println(numeros);
}