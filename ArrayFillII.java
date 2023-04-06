import java.util.Scanner;
import java.io.IOException;

public class ArraychangeI{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int i;
        for (i = 0; i < 20; i++) {
            vetor[i] = scanner.nextInt();
        }
        for (i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, vetor[19 - i]);
        }

    }
}
