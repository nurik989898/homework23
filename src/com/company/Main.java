package com.company;
public class Main {

    public static void main(String[] args) {
        System.out.println(kook(4, 44));
        System.out.println(kook(50, 4));
        System.out.println(kook(22, 45));
        System.out.println(kook(56, 4));
        System.out.println(kook(8, 56));
    }

    public static String kook(int age, int temperature) {
        if ((age > 0 && age < 45) && (temperature > -20 && temperature < 40)) {
            return"go";
        } else if ((age < 20) && (temperature > 0 && temperature < 25)) {
            return"go";
        } else if ((age > 45) && (temperature > -10 && temperature < 25)) {
            return "go";
        } else {
            return "dont go";
        }
    }
}