package com.epam;

import java.util.*;

/**
 * Sort App Project
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Type numbers to sort (each in new line) - to end press 0");
        Integer number = scanner.nextInt();

        while (number != 0) {
            arrayList.add(number);
            number = scanner.nextInt();
        }

        Collections.sort(arrayList);
        System.out.println("Sorted: " + arrayList);


    }
}
