package lista2java;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        int a, b, c;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor de A : ");
        a = leia.nextInt();

        System.out.println("Digite o valor de B : ");
        b = leia.nextInt();

        System.out.println("Digite o valor de C : ");
        c = leia.nextInt();

        if (a>c && a>b) {
            System.out.println("O maior n�mero � : "+ a);
        } else if (b>c && b>a) {
            System.out.println("O maior n�mero � : "+ b);
        } else if (c>b && c>a) {
            System.out.println("O maior n�mero � : "+ c);
        } else {
            System.out.println("Os n�meros s�o iguais");
        }

    }

}
