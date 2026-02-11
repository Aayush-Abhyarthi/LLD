package DesignPatterns.factory_pattern;

import DesignPatterns.factory_pattern.shapes.*;
import java.util.Scanner;

public class main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();

        shape s = shapeFactory.getShape(x);
        s.draw();
    }
}