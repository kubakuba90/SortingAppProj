package com.epam;
import java.util.*;

/**
 * Sort App Project
 * Returns sorted integer numbers inputted from keyboard
 * - up to 10 elements
 */
public class App 
{
    public ArrayList<Integer> sortApp (String numbers){

        ArrayList<Integer> arrayListDigits = new ArrayList<>();
        boolean onlyDigits = numbers.matches("[0-9 ]+");

        if (onlyDigits) {
            String array[] = numbers.split("\\s+");

            //check that input numbers is up to 10 elements
            if (array.length <= 10) {
                for (String elements : array) {
                    arrayListDigits.add(Integer.parseInt(elements));
                }
                Collections.sort(arrayListDigits);
                return arrayListDigits;
            } else {
                throw new RuntimeException("Input numbers must be up to 10 elements.");
            }
        } else {
            throw new NumberFormatException("Can't parse input to int. Pass only digits, and numbers with whitespaces");
        }
    }
    public static void run(){
        Scanner scanner = new Scanner(System.in);
        App app = new App();
        System.out.println("Type numbers separated by a space - to sort (up to 10) and press enter");
        String numbers = scanner.nextLine();
        System.out.println(app.sortApp(numbers));
    }
    public static void main( String[] args ) {
        run();


    }
}
