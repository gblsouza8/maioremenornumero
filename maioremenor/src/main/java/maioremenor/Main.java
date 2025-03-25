package maioremenor;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lista[] = new int[10];
        int x = 1;
        int z = 100;
        System.out.println("Mostra o maior valor em uma lista com 10 valores inseridos pelo usuário");

        for (int i = 0; i < lista.length; i++)
        {
            System.out.println("Insira um número: ");
            int numero = input.nextInt();
            lista[i] = numero;
        }

        for (int i = 0; i < lista.length; i++)
        {
            if (x < lista[i])
            {
                x = lista[i];
            }
        }

        for (int i = 0; i  < lista.length; i++)
        {
            if (z > lista[i])
            {
                z = lista[i];
            }
        }


        System.out.println("Maior valor armazenado na lista: " + x + "\nMenor valor armazenado na lista: " + z);

    }
}