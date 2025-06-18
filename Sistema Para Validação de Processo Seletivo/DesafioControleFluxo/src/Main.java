import java.util.Scanner;

import services.Contador;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.println("Digite um número inteiro: ");
        int numA = input.nextInt();
        System.out.println("Digite outro número: ");
        int numB = input.nextInt();
        
        contador.contar(numA, numB);
    }
}
