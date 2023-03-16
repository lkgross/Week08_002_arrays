package bsu.comp152;

public class Main {
    public static void main(String[] args) {
        /*
         * Inline initialization of an array with prescribed elements.
         */
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        /*
         * We can declare and define an array with default values.
         */
        String[] names = new String[1000];
        /*
         * Names is an array with 1000 values of null because null is default object, and strings are objects in Java.
         */
        /*
         * Arrays in Java are objects.
         * Arrays do not change size!
         */
        /*
         * We can access the public field length of an array.
         */
        System.out.println(SUITS.length);
        System.out.println(names.length);

        System.out.println();

        /*
         * If we print the array directly, we se a hexidecimal memory address.
         */
        System.out.println(SUITS);
        System.out.println(names);
        System.out.println();
        /*
         * We can loop through an array element-by-element or index-by-index.
         */
        for (String suit : SUITS){
            System.out.println(suit);
        }

        System.out.println();

        for (int i = 0; i < SUITS.length; i++){
            System.out.println(SUITS[i]);
        }

        /*
         * numberArray is an array of 100 values of 0.0.
         */
        double[] numberArray = new double[100];
        /*
         * intArray is an array of 100 values of 0.
         */
        int[] intArray = new int[100];
        /*
         * booleanArray is an array of 100 values of false.
         */
        boolean[] booleanArray = new boolean[100];

        for (double x : numberArray){
            System.out.println(x);
        }

        for (int item : intArray){
            System.out.println(item);
        }

        for (boolean bool : booleanArray){
            System.out.println(bool);
        }

        for (String element : names){
            System.out.println(element);
        }
    }
}