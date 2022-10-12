import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int packageNumber = 0, numberofCourses = 0, cost = 0, costPerCourse = 0, numIncluded = 0, totalCost = 0;

        System.out.println("Which package do you want? 1, 2 or 3?");
        packageNumber = sc.nextInt();

        System.out.println("How any courses did you enrolled in this month?");
        numberofCourses = sc.nextInt();

        switch (packageNumber){
            case 1:
                cost = 10;
                costPerCourse = 6;
                numIncluded = 2;
                break;
            case 2:
                cost = 12;
                costPerCourse = 4;
                numIncluded = 4;
                break;
            case 3:
                cost = 15;
                costPerCourse = 3;
                numIncluded = 6;
                break;
            default:
                System.out.println("Wrong choice, package not found");
        }

        if(numberofCourses > numIncluded){
            totalCost = cost + (numberofCourses - numIncluded) * costPerCourse;
        }
        else
            totalCost = cost;

        System.out.println("Total cost = "+ totalCost);
    }
}
