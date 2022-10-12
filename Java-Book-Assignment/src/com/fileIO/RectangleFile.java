package com.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList = new ArrayList<>();
        fillArrayList(rectangleList);
        printRectangle(rectangleList);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectangles){
        Scanner infile;

        try{
            infile = new Scanner(new File("/home/srid/Java_Practice/POCs/Java-Book-Assignment/src/com/fileIO/rectangle_data.txt"));
            Rectangle temp;
            double l, b;

            while (infile.hasNext()){
                l = infile.nextDouble();
                b = infile.nextDouble();
                temp = new Rectangle(l,b);
                rectangles.add(temp);
            }
            infile.close();

        }
        catch (FileNotFoundException e) {
            System.out.println("Error Accessing File!!");
        }

    }

    public static void printRectangle(ArrayList<Rectangle> rectangles){
        for (Rectangle r : rectangles){
            System.out.println("Length : " + r.getLength());
            System.out.println("Breadth : " + r.getBreadth());
            System.out.println("Area : " + r.area());
            System.out.println("Perimeter : " + r.perimeter());
            System.out.println();
        }
    }
}
