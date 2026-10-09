//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Problematica: Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são verdadeiros ou falsos.
void main() {

    boolean senhacorreta = Boolean.parseBoolean(IO.readln("A senha está correta? Digite true (sim/verdadeiro) ou false (não/falso): "));
    boolean podeentrar = Boolean.parseBoolean(IO.readln("A usuário pode entraa? Digite true (sim/verdadeiro) ou false (não/falso): "));

    // Fiz um pouco além do necessário, pois queria simular possiveis falhas no sistema, mesmo que de forma manual. Talvez eu escreva um novo código onde o sistema obriga o usuário a escrever novamente.)
    if(senhacorreta && podeentrar) {
        IO.println("A senha está correta e o usuário pode entrar. Ambas são verdadeiras");
    } else if (!senhacorreta && podeentrar) {
        IO.println("BUG! A senha está incorreta, mas o usuário entrou no sistema. Falso e Verdadeiro");
    } else if (senhacorreta && !podeentrar) {
        IO.println("BUG! A senha está correta, mas o usuário não pode entrar. Verdadeiro e Falso");
    } else {
        IO.println("A senha está errada, então o usuário não pode entrar. Ambas são falsas");
    }
}
