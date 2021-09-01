import java.util.Scanner;

public class excercicio02 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        double base, altura, area;

        base = 10.34;
        altura= 20;
        area= base*altura;

        System.out.println(" a area é" + area);

        scanner.close();



    }
}
