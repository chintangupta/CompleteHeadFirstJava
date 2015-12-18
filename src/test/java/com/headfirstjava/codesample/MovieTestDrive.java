package com.headfirstjava.codesample;

/**
 * Created by chintan on 18/12/2015.
 */
public class MovieTestDrive {

    public static void main (String[] args) {

        Movie one = new Movie();
        one.title = "Gone with the Wind";
        one.genre = "Tragedy";
        one.rating = 10;
        one.playIt();

        Movie two = new Movie();
        two.title = "Skyfall";
        two.genre = "Some Bond Film :D ";
        two.rating = 6;
        two.playIt();


    }
}
