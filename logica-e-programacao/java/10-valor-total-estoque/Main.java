//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String produto = IO.readln("Digite seu produto: ");
    double valor = Double.parseDouble(IO.readln("Digite o valor: "));
    double quantidade = Double.parseDouble(IO.readln("Digite a quantidade: "));
    double valorTotal = (valor * quantidade);

    if (quantidade < 10) {
        IO.println("Valor total : " + valorTotal + " Estoque baixo.");
    } else {
        IO.println("Valor total : " + valorTotal + " Estoque suficiente.");
    }

}

