import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListsPOC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> numbList = new ArrayList<>();
        double num;

        while(true){
            System.out.println("Enter number to add into arrayList. Enter -1 to exit");
            num = sc.nextDouble();
            if(num < 0)
                break;
            numbList.add(num);
        }

        for(int i = numbList.size() - 1; i >= 0; i--){
            System.out.println(numbList.get(i));
        }
    }
}
