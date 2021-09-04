package parte2;

import java.util.Scanner;

//Escreva um algoritimo em java quw leia dois números inteiros e determine qual é o meonos:

public class exercicio03 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Digite 1 número");
        int primeiroNumero= in.nextInt();

        System.out.println("Digite 2 número");
        int segundoNumero= in.nextInt();
        if(primeiroNumero==segundoNumero){
            System.out.println("os dois números são iguais");
        }else if (primeiroNumero > segundoNumero){
            System.out.println("o primeiro número é maior");
        }else{
            System.out.println("O segundo número é maior");
        }
        in.close();
    }
}
