
import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double[] array = new double[num];

        for(int i=0; i<num; i++){
            array[i] = input.nextDouble();
        }

        Arrays.sort(array);

        for(int i=0; i<num; i++){
            array[i] = array[i]/array[num-1]*100;
        }

        double total = 0;
        for(int i=0; i<num; i++){
            total += array[i];
        }

        double average = total/num;

        System.out.println(average);
    }
}
