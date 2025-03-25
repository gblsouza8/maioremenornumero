package maioremenor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lista[] = new int[10];
        System.out.println("Mostra o maior valor em uma lista com 10 valores inseridos pelo usuário");

        for (int i = 0; i < lista.length; i++)
        {
            System.out.println("Insira um número: ");
            int numero = input.nextInt();
            lista[i] = numero;
        }

    }
}