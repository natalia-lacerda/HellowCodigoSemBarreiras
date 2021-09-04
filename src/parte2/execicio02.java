package parte2;

import java.util.Scanner;

public class execicio02 {

    public static void main(String[] args){

            Scanner in = new Scanner(System.in);

            System.out.println("Digite uma idade");
              int idade = in.nextInt();
            if (idade > 4 && idade < 7) {
                System.out.println("Infantil A");
            } else if (idade > 8 && idade < 12) {
                System.out.println("Infantil B");
            } else if (idade > 11 && idade < 14) {
                System.out.println("Juvenil A");
            } else if (idade > 13 && idade < 17) {
                System.out.println("Juvenil B");
            } else if (idade > 1820) {
                System.out.println("Adultos");
            } else {
                System.out.println("Pessoa menor de 5 anos");
            }


            in.close();
        }
    }














