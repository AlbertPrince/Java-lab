package com.example.helloworld;

public class Randomtry {
    public static void main(Strint[] args){
        int sum = 0, sum1 = 0, count = 0, count1 = 0;
        int turn = 0;

        Random ran = new Random();
        int flag = 0;

        while (true) {
            if (turn % 2 == 0){
                int p1 = ran.nextInt(6);
                sum += p1;
                System.out.printf("Player 1 after turn %d is : %d\n", turn, sum)
            }
            else{
                int p2 = ran.nextInt(6);
                sum1 += p2;
                System.out.printf("Player 2 after %d is : %d\n", turn, sum1);
            }
            if (sum >= 30){
                flag = 1;
                break;
            }
            if (sum1 >= 30) {
                flag = 2;
                break;
            }
            turn++;
        }
        if (flag == 1)
            System.out.println("\nPlayer 1 WON!!");
        else
            System.out.println("\nPlayer 2 WON!!");
    }
}
