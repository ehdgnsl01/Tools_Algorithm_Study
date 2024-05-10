import java.util.Scanner;

public class NumOfWords {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
        }

        String[] string = s.split(" ");

        int totalWords = 0;

        for (String strings : string) {
            if (!s.isEmpty()) {
                totalWords++;
            }
        }
        System.out.println(totalWords);
    }
}
