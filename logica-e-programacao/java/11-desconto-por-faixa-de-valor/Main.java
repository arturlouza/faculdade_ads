//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double valor = Double.parseDouble(IO.readln("Escreva o valor do produto: "));

    if (valor > 80) {
        IO.println("Compra acima de R$80,00. Desconto de 15%: R$" + valor * 0.85);
    } else if (valor >= 40) {
        IO.println("Valor entre RS40,00 e R$80.00. Desconto de 10% R$" + valor * 0.90);
    } else {
        IO. println("Valor abaixo de R$40,00. Sem desconto");
    }
}
