import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculate {

    public static void main(String[] args) {

        int x;
        int y;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero!");
        x = input.nextInt();
        System.out.println("Digite o segundo numero!");
        y = input.nextInt();

        System.out.println("Soma: "+(x+y));
        System.out.println("Subtração: "+(x-y));
        System.out.println("Divisão: "+(x/y));
        System.out.println("Multiplicação: "+(x*y));
    }
}
