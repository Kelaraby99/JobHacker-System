import java.util.Scanner;
import java.io.IOException;

public class SquaredandCubic {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for (int i = 1; i <= num; i++){
            System.out.printf("%d %d %d\n", i, (i * i), (i * i * i));
        }
    }
}
