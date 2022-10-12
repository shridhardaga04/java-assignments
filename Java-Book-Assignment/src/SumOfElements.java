import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();

        numList.add(5);
        numList.add(16);
        numList.add(548);
        numList.add(164);
        numList.add(48);

        System.out.println("Sum is : "+ SumOfElements.findSum(numList));
    }

    private static Integer findSum(List<Integer> numList) {
        return numList.stream().reduce(0, Integer::sum);
    }
}
