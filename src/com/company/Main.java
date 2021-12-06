package com.company;
public class Main {

    public static void main(String[] args) {
        kook(4, 44);
        kook(50, 4);
        kook(22, 45);
        kook(56, 4);
        kook(8, 56);
    }

    public static String kook(int age, int temperature) {
        if ((age > 0 && age < 45) && (temperature > -20 && temperature < 40)) {
            System.out.println("Lets walk");
        } else if ((age < 20) && (temperature > 0 && temperature < 25)) {
            System.out.println("We can walk");
        } else if ((age > 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("We can walk");
        } else {
            System.out.println("Stay at home");
        }
        return age + " " + temperature;
    }
}