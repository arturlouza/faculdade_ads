//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Problematica: Faça um algoritmo que leia o salário mínimo e o salário de um usuário. Calcule quantos salários mínimos esse usuário ganha e imprima o resultado. Use R$ 1.293,20 como base.
void main() {
double Salario = Double.parseDouble(IO.readln("Digite seu salário: "));
double Salario_min = 1293.20;
double Riqueza = Salario / Salario_min;

IO.println("O salário mínimo é R$" + Salario_min);
IO.println("Seu salário é: R$" + Salario);
IO.println(String.format("Seu salário equivale a %.2f salários mínimos.", Riqueza));

if (Salario < Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Muito baixa");
}else if (Salario == Salario_min || Salario <= 2 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Renda baixa");
}else if (Salario <= 4 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Classe média baixa");
}else if (Salario <= 7 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Classe média");
}else if (Salario <= 12 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Classe média alta");
}else if (Salario <= 20 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Classe alta");
}else if (Salario <= 50 * Salario_min){
        IO.println("Sua classe econômica está catalogada como: Alta renda");
}else if (Salario <= 100 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Muito alta renda");
}else if (Salario > 100 * Salario_min) {
    IO.println("Sua classe econômica está catalogada como: Renda extremamente alta");
}
}
