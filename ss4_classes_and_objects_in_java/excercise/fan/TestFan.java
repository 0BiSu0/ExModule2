package ss4_classes_and_objects_in_java.excercise.fan;

import ss4_classes_and_objects_in_java.excercise.fan.Fan;

public class TestFan {
    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setMaxSpeed();
        f1.setRadius(3);
        f1.setColor("yellow");
        f1.setOn(true);

        Fan f2= new Fan();
        f2.setMediumSpeed();
        f2.setRadius(4);

        System.out.println("Fan1: "+ f1);
        System.out.println("Fan2 "+ f2);
    }
}

