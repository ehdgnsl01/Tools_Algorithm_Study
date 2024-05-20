
import java.util.Scanner;

public class BeeHive {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();

        long now = 1;
        long add = 6;
        long count = 1;

        if(num == 1){
            System.out.println(count);
            return;
        }

        while(num > now){
            now += add * count;
            count++;
        }

        System.out.println(count);
    }
}

