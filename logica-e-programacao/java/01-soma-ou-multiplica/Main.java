//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Problematica: Faça um algoritmo que leia dois valores inteiros, A e B. Se forem iguais, some os dois valores. Caso contrário, multiplique A por B. Atribua o resultado à variável C e imprima seu valor.
void main() {
    int a = Integer.parseInt(IO.readln("Digite o valor de A"));
    int b = Integer.parseInt(IO.readln("Digite o valor de B"));
    int c;

    if (a == b) {
        c = a + b;
    } else {
        c = a * b;
    }

    IO.println("O valor de C é: " + c);
}
