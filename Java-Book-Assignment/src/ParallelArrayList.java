import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParallelArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        List<Integer> ages = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a name:\t");
            names.add(sc.nextLine());
            System.out.print("Enter an age:\t");
            ages.add(sc.nextInt());
            sc.nextLine();
            System.out.println();
        }

        for(int i = 0; i < 5; i++){
            System.out.println(names.get(i) + " is "+ages.get(i)+" years old");
        }
    }
}
