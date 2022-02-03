package br.com.caracoroa;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Leitura do teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("\t\t--- Jogo Cara ou Coroa ---");
        System.out.println("\t\tDigite 1- Cara 2-Coroa");

        //String que armazena o dado inputado
        String caraCoroa = sc.next();

        //gerador aleatorio de 1 ou 2
        Random gerador = new Random();
        int verifica = gerador.nextInt(2) + 1;

            if (verifica == 1 && caraCoroa.equals("1") || verifica == 2 && caraCoroa.equals("2")) {
                System.out.println("Você ganhou!" + verifica);

            } else if (verifica == 2 && caraCoroa.equals("1") || verifica == 1 && caraCoroa.equals("2")) {
                System.out.println("Você perdeu!" + verifica);

            } else {
                System.out.println("Digite um valor válido");
            }

        sc.close();

    }

}
