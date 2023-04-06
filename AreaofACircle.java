import java.util.Scanner;
import java.io.IOException;


public class AreaofACircle {
    public static void main(String[] args) throws IOException{
        double R,A;
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
        A = 3.14159 * R * R;
        System.out.printf("A=%.4f\n",  A);
    }
}

