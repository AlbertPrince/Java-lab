package com.example.helloworld;

import java.util.Random;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        new HelloWorld().getRandom0_N(25);
    }

    public void helloFunc () {
        String hw = "Hello ";
        hw += "World";
        int len = hw.length();
        int position = hw.indexOf('W');
        String lower = hw.toLowerCase();

        System.out.println(len + " " + position + " " + lower);
    }

    public void getRandom () {
        Random random = new Random();
        int rand = random.nextInt(100 - 1 ) + 1;
        System.out.println("Number " + rand);
        if (rand % 2 == 0) {
            System.out.println("Even ");
            String temp = categorize(rand);
            System.out.println("Temp: " + temp);
        } else {
            System.out.println("Odd");
            String temp = categorize(rand);
            System.out.println("Temp: " + temp);
        }
    }

    public String categorize (int randNumber) {
        if (randNumber == 0) {
            return "Frozen";
        } else if ( randNumber >= 1 && randNumber <= 14 ) {
            return  "Cold";
        } else if (randNumber >= 15 && randNumber <= 24 ) {
            return "Cool";
        } else if ( randNumber >= 25 && randNumber <= 40) {
            return "Warm";
        } else if (randNumber >= 41 && randNumber <= 60) {
            return  "Hot";
        } else if (randNumber >= 61 && randNumber <= 80 ) {
            return "Very Hot";
        } else if (randNumber >= 81 && randNumber <= 99 ) {
            return  "Extremely Hot";
        } else {
            return "Boiling";
        }
    }

    public void getRandom0_10 () {
        Random random = new Random();
        int rand = random.nextInt(9 - 1 ) + 1;

        switch (rand) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }

    public void randomNumberRange () {
        Random random = new Random();
        int rand;
        rand = random.nextInt(3 + 3 ) -3;

//        do {
//            rand = random.nextInt(3 -(- 3) ) -3;
//        } while (rand != 0);
//        System.out.println(rand);

        while(rand != 0) {
            rand = random.nextInt(3 + 3 ) -3;
        }
    }

    public void multiplication () {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12 ; j++) {
                System.out.println( i+" * "+j+" = "+ i*j);
            }
        }
    }

    public void getRandom0_49(){
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int rand = random.nextInt(49 - 1 ) + 1;
            System.out.println(rand);
        }
    }

    public void getRandom0_N(int n) {
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int rand = random.nextInt(n - 1 ) + 1;
            System.out.println(rand);
        }
    }


}
