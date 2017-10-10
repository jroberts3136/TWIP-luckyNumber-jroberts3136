package com.company;

/**
 * Created by jroberts3136 on 10/10/17.
 */
public class perfectRandom {
    public String name;
    private int rawRandom;
    private int perfectRandom;

    public perfectRandom(String n){
        name = n;                   //takes user's name
    }

    public int perfectSquare(){
        rawRandom = (int)(Math.random() * 101); //Generates random integer from 0 to 100, inclusive of both
        perfectRandom = (int)Math.pow(rawRandom, 2);    //Squares integer -> Results in all perfect squares from 0 to 10000
        return perfectRandom;
    }
}
