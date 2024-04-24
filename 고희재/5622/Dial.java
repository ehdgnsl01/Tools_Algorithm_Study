package String;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("input string");
        String inputString = input.nextLine();

        char[] inputChar = inputString.toCharArray();

        int time = 0;

        for (char c : inputChar) {
            if (c > 64 && c <= 67) {
                time += 3;
            } else if (c > 67 && c <= 70) {
                time += 4;
            } else if (c > 70 && c <= 73) {
                time += 5;
            } else if (c > 73 && c <= 76) {
                time += 6;
            } else if (c > 76 && c <= 79) {
                time += 7;
            } else if (c > 79 && c <= 83) {
                time += 8;
            } else if (c > 83 && c <= 86) {
                time += 9;
            } else {
                time += 10;
            }
        }

        System.out.println(time);
    }
}
