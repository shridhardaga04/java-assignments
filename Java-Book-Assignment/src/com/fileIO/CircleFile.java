package com.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        fillArrayList(circleList);
        printCircle(circleList);
    }

    public static void fillArrayList(ArrayList<Circle> circles){
        Scanner infile;

        try{
            infile = new Scanner(new File("/home/srid/Java_Practice/POCs/Java-Book-Assignment/src/com/fileIO/circle_data.txt"));
            Circle temp;
            double radius;

            while (infile.hasNext()){
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circles.add(temp);
            }
            infile.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("Error Accessing File!!");
        }

    }

    public static void printCircle(ArrayList<Circle> circles){
        PrintWriter pw;

        try {
            pw = new PrintWriter("/home/srid/Java_Practice/POCs/Java-Book-Assignment/src/com/fileIO/circle_output.txt");
            for (Circle r : circles){
                System.out.println("Radius : " + r.getRadius());
                System.out.println("Area : " + r.area());
                System.out.println("Perimeter : " + r.circumference());
                System.out.println();


                pw.println("Radius : " + r.getRadius());
                pw.println("Area : " + r.area());
                pw.println("Perimeter : " + r.circumference());
                pw.println();
            }
            // close file, to reflect changes in output file
            pw.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File Error!");
        }
    }
}
