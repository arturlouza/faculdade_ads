//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Faça um algoritmo que leia um valor qualquer e imprima esse valor com um reajuste de 5%.

void main() {
    double valor = Double.parseDouble(IO.readln("Escreva o Valor "));
    double valorrea = valor * 0.95;
    double valormais = valor * 1.05;

    IO.println("O reajuste de menos 5% do seu valor deu " + valorrea);
    IO.println("O reajuste de mais 5% do seu valor deu " + valormais);
}