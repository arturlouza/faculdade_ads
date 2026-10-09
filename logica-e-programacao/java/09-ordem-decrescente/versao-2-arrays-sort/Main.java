//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Faça um algoritmo que leia três valores inteiros diferentes e imprima os valores em ordem decrescente.
void main() {

    int valor1 = Integer.parseInt(IO.readln("Escreva o valor 1: "));
    int valor2 = Integer.parseInt(IO.readln("Escreva o valor 2: "));
    int valor3 = Integer.parseInt(IO.readln("Escreva o valor 3: "));
    int [] valores = {valor1, valor2, valor3};

    Arrays.sort(valores);

    IO.println(valores[2] + ", " + valores[1] + ", " + valores[0]);

    }
