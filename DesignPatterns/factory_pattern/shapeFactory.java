package DesignPatterns.factory_pattern;

import DesignPatterns.factory_pattern.shapes.*;

public class shapeFactory{
    public static shape getShape(String x){
        if(x.equals("circle")){
            return new circle();
        }
        else if(x.equals("rectangle")){
            return new rectangle();
        }
        else if(x.equals("triangle")){
            return new triangle();
        }
        else{
            return null;
        }
    }
}