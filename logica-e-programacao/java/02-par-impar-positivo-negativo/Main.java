import javax.swing.text.DefaultStyledDocument;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Problematica: Faça um algoritmo que receba um número qualquer e informe se ele é par ou ímpar, positivo ou negativo.
void main() {
    int valor = Integer.parseInt(IO.readln("Digite seu número "));

    IO.println("Seu número especial é: " + valor);

    if (valor % 2 == 0) {
        IO.println("Seu número especial é Par");
    } else {
        IO.println("Seu número especial é Impar");
    }

    if (valor > 0) {
        IO.println("Seu número especial é Positivo");
    } else if (valor < 0) {
        IO.println("Seu número especial é Negativo");
    } else {
        IO.println("Seu seu valor é Zero/Neutro");
    }
}

