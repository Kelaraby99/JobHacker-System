import java.util.Scanner;

public class Multiples {

    public static void main(String[] args){

        int A, B;
        Scanner input =new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        if (B % A == 0 || A % B == 0) {
            System.out.print("Sao Multiplos\n");
        }else {
            System.out.print("Nao sao Multiplos\n");
        }

    }

}