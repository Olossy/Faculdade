/* ALuno: Hallan Christian Morais da Cruz

Escreva um programa em Java que solicite ao usuário que insira 10 números inteiros. 
O programa deve contar e exibir quantos desses números são pares e quantos são ímpares. 
*/

import java.util.Scanner;

public class ContagemParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contPar = 0;
        int contImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = sc.nextInt();

            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Quantidade de números pares: " + contPar);
        System.out.println("Quantidade de números ímpares: " + contImpar);

        sc.close();
    }
}
