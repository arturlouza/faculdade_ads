//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double parafuso = 1;
    double tabua = 2.50;
    double regua = 0.50;

    double quantParafuso = Double.parseDouble(IO.readln("Quantidade Parafuso: "));
    double quantTabua = Double.parseDouble(IO.readln("Quantidade tabua: "));
    double quantRegua = Double.parseDouble(IO.readln("Quantidade régua: "));

    double valorparafuso = parafuso * quantParafuso;
    double valortabua = tabua * quantTabua;
    double valorregua = regua * quantRegua;

    double valortotal = valorparafuso + valortabua + valorregua;

    IO.println("Quantidade parafuso: " + quantParafuso + " | Valor de R$" + valorparafuso);
    IO.println("Quantidade tabua: " + quantTabua + " | Valor de R$" + valortabua);
    IO.println("Quantidade regua: " + quantRegua + " | Valor de R$" + valorregua);
    IO.println("Valor da compra: " + valortotal);

    if (quantParafuso == 5 && quantTabua == 2 & quantRegua == 1) {
        IO.println("Desconto de 15%: " + valortotal * 0.85);

    }else if (valortotal >= 50) {
        IO.println("Desconto de 10%: " + valortotal * 0.90);

    }else {
        IO.println("Sem desconto! Compre mais R$" + (50 - valortotal) + " para completar R$50,00 e ter seu desconto de 10%!");

    }
}
