import java.util.Scanner;
import java.io.IOException;

public class ArrayFillII{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int k = 0;
        while (true) {
            for (int x = 0; x < T; x++) {
                System.out.printf("N[%d] = %d\n", k, x);
                k += 1;
                if (k == 1000) {
                    break;
                }
            }
            if (k == 1000) {
                break;
            }
        }

    }
}
