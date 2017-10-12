package com.company;

/**
 * Created by jroberts3136 on 10/10/17.
 */
public class perfectRandom {
    private String name;
    private int rawRandom;
    private int perfectRandom;
    private int primeRandom;

    public perfectRandom(String n){
        name = n;                   //takes user's name
    }

    public String getName(){
        return name;
    }

    public int perfectSquare(){
        rawRandom = (int)(Math.random() * 101); //Generates random integer from 0 to 100, inclusive of both
        perfectRandom = (int)Math.pow(rawRandom, 2);    //Squares integer -> Results in all perfect squares from 0 to 10000
        return perfectRandom;
    }

    public int randomPrime(){
        int [] primeNums =                              //Array of primes between 1 and 1000    168 numbers
                {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,

                71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149,

                151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229,

                233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311,

                313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401,

                409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487,

                491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593,

                599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677,

                683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773,

                787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881,

                883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997
                };

        rawRandom = (int)(Math.random() * 168); //Generates random integer from 0 to 167, inclusive of both     Used to reference indexes of primeNums
        primeRandom = primeNums[rawRandom];
        return primeRandom;
    }
}
