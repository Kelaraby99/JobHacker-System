import java.util.Scanner;
import java.io.IOException;

public class BelowTheMainDiagonal {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        double[][] a = new double[12][12];
        char c = scanner.next().charAt(0);
        double sum = 0;
        for(int i = 0 ; i < 12; i++){
            for(int j = 0 ; j < 12; j++){
                a[i][j] = scanner.nextDouble();
            }
        }
        int u = 0;
        for(int i = 0 ; i < 12; i++){
            for(int j = 0 ; j < u; j++){
                sum += a[i][j];
            }
            u++;
        }
        if(c == 'S') System.out.printf("%.1f\n" , sum);
        else if(c == 'M') System.out.printf("%.1f\n" , sum/66);
    }
}
