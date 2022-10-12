import java.util.Scanner;

public class ArraysPOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a integer number : ");
            arr[i] = sc.nextInt();
            System.out.println();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("result is: " + arr[i] * 2);
        }
    }
}
