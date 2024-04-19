import java.util.Scanner;

public class boj2562 {
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
        int[] arr = new int[9];

        int max=0;
        int max_i=0;

        for(int i=0;i<9;i++){
            arr[i]=input.nextInt();
            if(max<arr[i]){
                max = arr[i];
                max_i = i+1;
            }
        }

        System.err.println(max);
        System.err.println(max_i);
        input.close();
}
}