package com.codewithash;

import java.util.Random;

import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper & Scissor Game ");
        Random rand = new Random();
        int rand_a = rand.nextInt(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Select any number 0 for Rock , 1 for Paper & 2 for Scissor = ");
        int b = sc.nextInt();

        System.out.println("The computer choose = " + rand_a);

        if(rand_a==0&&b==1){
            System.out.println("You Won");
        }

        else if(rand_a==0&&b==2){
            System.out.println("You Lose");
        }

        else if(rand_a==0&&b==0){
            System.out.println("Match Tied");
        }

        else if(rand_a==1&&b==1){
            System.out.println("Match Tied");
        }

        else if(rand_a==1&&b==0){
            System.out.println("You Lose");
        }

        else if(rand_a==1&&b==2){
            System.out.println("You Win");
        }

        else if(rand_a==2&&b==2){
            System.out.println("Match Tied");
        }

        else if(rand_a==2&&b==0){
            System.out.println("You Won");
        }

        else if(rand_a==2&&b==1){
            System.out.println("You Lose");
        }

    }
}
