import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> fName = new ArrayList<>();
        List<String> lName = new ArrayList<>();
        String fullName;

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a full name:\t");
            fullName = sc.nextLine();

            String [] temp = fullName.split(" ");

            fName.add(temp[0]);
            lName.add(temp[1]);
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++)
                System.out.println(fName.get(i) + " "+ lName.get(j));
        }
    }
}
