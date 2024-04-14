package homework_nr_4;

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;

        // Display the area on the console
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}

