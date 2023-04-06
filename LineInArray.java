import java.util.Scanner;
import java.io.IOException;

public class LineInArray {
    public static  void main(String[] args) throws IOException{
        int N, lineNo;
        float sum = 0, avg = 0;
        Scanner sc = new Scanner(System.in);
        float M[][] = new float[12][12];
        String option ;

        lineNo = sc.nextInt();
        option = sc.next();

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 12; j++) {
                M[i][j] = sc.nextFloat();
            }

        }

        for (int j = 0; j < 12; j++) {
            sum +=  M[lineNo][j];
        }

        avg = sum / 12;

        if(option.equals("S")){
            System.out.printf("%.1f\n", sum);
        }else if(option.equals("M")){
            System.out.printf("%.1f\n", avg);
        }

    }

}
