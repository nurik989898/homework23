package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generateRandomAge());
        System.out.println(kook(generateRandomAge(), 44));
        System.out.println(kook(generateRandomAge(), 4));
        System.out.println(kook(generateRandomAge(), 45));
        System.out.println(kook(generateRandomAge(), 4));
        System.out.println(kook(generateRandomAge(), 56));
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
    public static int generateRandomAge(){
        Random random = new Random();
        int randomNumber = random.nextInt(50);
        return randomNumber;
    }
}