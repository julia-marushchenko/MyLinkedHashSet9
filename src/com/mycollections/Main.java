/**
 *  Java program to find a hashcode of LinkedHashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an empty LinkedHashSet.
        LinkedHashSet<Long> mySet = new LinkedHashSet<>();

        // Adding elements to mySet.
        mySet.add(77L);
        mySet.add(13L);
        mySet.add(81L);
        mySet.add(93L);
        mySet.add(54L);

        // Finding hashcode of mySet and printing to console.
        System.out.print(mySet.hashCode()); // Output: 318

    }
}