import java.util.Scanner;

public class AverageofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter three numbers");
        for(int i = 0; i < 3; i++){
            double num = sc.nextDouble();
            sum += num;
        }

        System.out.println("Average of three numbers = " + Math.round(sum / 3.0 * 100.0) / 100.0);
        sc.close();
    }
}
