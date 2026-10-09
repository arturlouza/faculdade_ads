//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Problematica: Faça um algoritmo que leia os valores de A, B e C. Em seguida, imprima a soma entre A e B e informe se essa soma é menor que C.
void main() {
    int a = Integer.parseInt(IO.readln("Digite o valor de A"));
    int b = Integer.parseInt(IO.readln("Digite o valor de B"));
    int c = Integer.parseInt(IO.readln("Digite o valor de C"));
    int soma = a + b;

    IO.println ("O valor de A+B é: " + soma);

    if (soma > c) {
        IO.println("O valor é maior que C!");
    } else {
        IO.println("O valor é menor que C!");
    }
}
