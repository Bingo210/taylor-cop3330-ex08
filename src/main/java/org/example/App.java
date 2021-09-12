/*
 * UCF COP3330 Fall 2021 Assignment 8 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "How many people?" );
        int people = input.nextInt();
        System.out.println( "How many pizzas do you have?" );
        int pizzas = input.nextInt();
        System.out.println( "How many slices per pizza?" );
        int slicesPerPizza = input.nextInt();

        int slices = pizzas * slicesPerPizza;

        System.out.println( people + " people with " + pizzas + " pizzas "  +
                "(" + slices + " slices)");

        int slicesPerPerson = slices / people;
        int leftover = slices % people;

        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}