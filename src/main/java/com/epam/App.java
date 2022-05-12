package com.epam;
import java.util.*;

/**
 * Sort App Project
 *
 */
public class App 
{

    public ArrayList<Integer> sortApp (String numbers){
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> arrayListDigits = new ArrayList<>();
//
////        System.out.println("Type numbers to sort (up to 10) and press enter");
//        String numbers = scanner.nextLine();

        ArrayList<Integer> arrayListDigits = new ArrayList<>();

//      check if only digits and whitespaces is from keyboard
        boolean onlyDigits = numbers.matches("[0-9 ]+");

        if (onlyDigits) {
            String array[] = numbers.split("\\s+");

            for (String elements : array) {
                arrayListDigits.add(Integer.parseInt(elements));
            }
            Collections.sort(arrayListDigits);
            //System.out.println(arrayListDigits);
            return arrayListDigits;
        } else {
            throw new NumberFormatException("Can't parse input to int. Pass only digits, and numbers with whitespaces");
        }
    }
    public static void main( String[] args ) {
            Scanner scanner = new Scanner(System.in);

//        System.out.println("Type numbers to sort (up to 10) and press enter");
            String numbers = scanner.nextLine();
            App app = new App();
            app.sortApp(numbers);



//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Integer> arrayListDigits = new ArrayList<>();
//
//        System.out.println("Type numbers to sort (up to 10) and press enter");
//        String numbers = scanner.nextLine();
//
//        // check if only digits and whitespaces is from keyboard
//        boolean onlyDigits = numbers.matches("[0-9 ]+");
//
//        if (onlyDigits) {
//            String array[] = numbers.split("\\s+");
//
//            for (String elements : array) {
//                arrayListDigits.add(Integer.parseInt(elements));
//            }
//            Collections.sort(arrayListDigits);
//            System.out.println(arrayListDigits);
//        } else {
//            throw new NumberFormatException("Can't parse to int. Pass only digits, and numbers");
//        }


    }
}
