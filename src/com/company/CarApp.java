package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class CarApp {
    public static void main(String[] args){
        ArrayList<Car> carArray = new ArrayList<>();

        /*Scanner keybd = new Scanner(System.in);
        System.out.println("enter your name: ");
        Scanner.nextLine();
        keybd.nextLine();
*/

        Car c1 = new Car();
        c1.setColor("red");
        c1.setCarName("Porsche");

        Car c2 = new Car("blue", "Jetta");

        /*
        *The red Porsche is starting
The red Porsche is accelerating
The red Porsche is going 50 mph
The red Porsche is stopped */

        System.out.println("The " + c1.getColor() + " " + c1.getCarName() + c1.starting());
        System.out.println(c1.displayText() + c1.starting());
//        System.out.println(dispayText(c1) + c1.starting());
        System.out.println("The " + c1.getColor() + " " + c1.getCarName() + c1.accelerating());
        System.out.println("The " + c1.getColor() + " " + c1.getCarName() + c1.setSpeed(50));
        System.out.println("The " + c1.getColor() + " " + c1.getCarName() + c1.stopped());

        /*
        * The red Porsche is starting
The blue Jetta is starting
The red Porsche is accelerating
The blue Jetta is accelerating
The blue Jetta has stopped to have its emissions checked
The blue Jetta passes its emission test
The red Porsche is going 50 mph
The red Porsche is stopped
The blue Jetta just passed the red Porsche*/

        System.out.println(c1.getColor() + c1.getCarName() + c1.starting());
        System.out.println(c2.getColor() + c2.getCarName() + c2.starting());
        System.out.println(c1.getColor() + c1.getCarName() + c1.accelerating());
        System.out.println(c2.getColor() + c2.getCarName() + c2.accelerating());
        System.out.println(c2.displayText() + " has stopped to ...");
        System.out.println(c2.displayText() + " passed its ...");
        System.out.println(c1.displayText() + c1.setSpeed(50));

    }

    // new method
//    public static String dispayText(Car c){
//        return "The " +c.getColor() + " " + c.getCarName();
//    }
}
