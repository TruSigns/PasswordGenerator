package cademy.training;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);

        System.out.println("How many random password do you need?");

        int total = in.nextInt();
        System.out.println("How many characters do you want ?");

        int length = in.nextInt();

        String[] randomPasswords = new String[total];

        for (int i = 0; i < total; i++) {
            String randomPassword = "";
            for (int j = 0; j < length; j++) {
                randomPassword += randomCharacter();


            }

            randomPasswords[i] = randomPassword;

        }


        printPasswords(randomPasswords);


    }

    public static void printPasswords(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    //0-9 => 48-57 in ASCII
    //A-Z => 65-90 in ASCII
    //a-z => 97-122 in ASCII

    public static char randomCharacter() {

        //generation a random number that aspect all possible character

        int rand = (int) (Math.random() * 62);

        //break up rand into some time of interval into numbers and letters

        //rand is between 0-61 inclusive
        //
        if (rand <= 9) {

            int ascii = rand + 48;
            return (char) (ascii);

        } else if (rand <= 35) {
            //uppercase
            int ascii = rand + 55; //65-10
            return (char) (ascii);
        } else {
            //lowercase

            int ascii = rand + 61;
            return (char) (ascii);
        }


    }
}
