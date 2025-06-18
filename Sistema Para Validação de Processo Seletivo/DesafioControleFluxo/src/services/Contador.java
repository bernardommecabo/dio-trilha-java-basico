package services;

import exception.ParametrosInvalidosException;

public class Contador {
    public static void contar(int numA, int numB) throws ParametrosInvalidosException {
        if (numA > numB){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contador = numB - numA;
        for (int i = 1; i <= contador; i++) {
            System.out.println("Imprimindo o número "+i);
        }
    }
}
