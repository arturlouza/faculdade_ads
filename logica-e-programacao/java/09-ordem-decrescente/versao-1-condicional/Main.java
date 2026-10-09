//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Faça um algoritmo que leia três valores inteiros diferentes e imprima os valores em ordem decrescente.
void main() {
    int valor1 = Integer.parseInt(IO.readln("Escrava o 1º Valor: "));
    int valor2 = Integer.parseInt(IO.readln("Escrava o 2º Valor: "));
    int valor3 = Integer.parseInt(IO.readln("Escrava o 3º Valor: "));

    if (valor1 > valor2 && valor1 > valor3) {

        if (valor2 > valor3) {
            IO.println(valor1 + ", " + valor2 + ", " + valor3);
        } else {
            IO.println(valor1 + ", " + valor3 + ", " + valor2);
        }

    } else if (valor2 > valor1 && valor2 > valor3) {

        if (valor1 > valor3) {
            IO.println(valor2 + ", " + valor1 + ", " + valor3);
        } else {
            IO.println(valor2 + ", " + valor3 + ", " + valor1);
        }

    } else {

        if (valor3 > valor1) {
            IO.println(valor3 + ", " + valor1 + ", " + valor2);
        } else {
            IO.println(valor3 + ", " + valor2 + ", " + valor1);
        }

    }
}
