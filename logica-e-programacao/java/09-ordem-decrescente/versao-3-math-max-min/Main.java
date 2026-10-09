//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int a = Integer.parseInt(IO.readln("Escolha o valor de A: "));
    int b = Integer.parseInt(IO.readln("Escolha o valor de B: "));
    int c = Integer.parseInt(IO.readln("Escolha o valor de C: "));

    if (a == b || a==c || b == c) {
        IO.println("Os três valores precisam ser diferentes.");
        return;
    }

    int maior = Math.max(a, Math.max(b, c));
    int menor = Math.min(a, Math.min(b, c));
    int meio = a + b + c - maior - menor;

    IO.println("Os valores em ordem decrescente são: " + maior + ", " + meio + ", " + menor);
}