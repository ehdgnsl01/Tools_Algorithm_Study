
import java.util.Arrays;
import java.util.Scanner;

public class Reminder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0; i<10; i++){
            array[i] = input.nextInt();
        }

        int[] reminder = new int[10];
        for(int i=0; i<10; i++){
            reminder[i] = array[i]%42;
        }

        Arrays.sort(reminder);

        int num = 1;

        for(int i=0; i<9; i++){
            if(reminder[i] < reminder[i+1]){
                num++;
            }
        }

        System.out.println(num);
    }
}
