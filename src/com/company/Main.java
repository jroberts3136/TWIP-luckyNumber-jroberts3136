package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        int randomChoice = (int)(Math.random()*2);  //Generates 0 or 1
        int luckyNum;
        boolean done = false;
        boolean promptAgain;

        while(!done){
            System.out.println("What is your name?");
            String name = stringInput.nextLine();
            perfectRandom user = new perfectRandom(name);

            if (randomChoice == 0){
                luckyNum = user.perfectSquare();
            }
            else{
                luckyNum = user.randomPrime();
            }
            System.out.println("Nice to meet you " + user.getName() + "! Your lucky number is " + luckyNum + ".");

            promptAgain = true;

            while(promptAgain){
                System.out.println("Press 0 to exit. Press 1 to display your name and number again. Press 2 to enter a new name and receive a new number.");
                int response = keyInput.nextInt();
                switch (response){
                    case 0:
                        promptAgain = false;        //Program finishes
                        done = true;
                        break;
                    case 1:
                        System.out.println("Nice to meet you " + name + "! Your lucky number is " + luckyNum + ".");    //Prints, then prompts again
                        break;
                    case 2:
                        promptAgain = false;        //Starts from beginning
                        break;
                }
            }
        }
    }
}
