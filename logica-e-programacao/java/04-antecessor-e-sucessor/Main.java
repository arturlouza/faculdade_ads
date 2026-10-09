//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Problematica: Faça um algoritmo que receba um número inteiro e imprima seu antecessor e seu sucessor.
void main() {

int a = Integer.parseInt(IO.readln("Escreva o número: "));
int b = a - 1;
int c = a + 1;

    IO.println("Seu numero é: " + a);
    IO.println(" O antecessor do seu número é: " + b);
    IO.println(" O sucessor do seu número é :" + c);
}