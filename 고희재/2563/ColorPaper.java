
import java.util.Scanner;

public class ColorPaper {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[][] arr = new int[num][2];
        int[][] area = new int[100][100];
        int total = 0;

        for(int i=0; i<num; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<num; i++) {
            for(int j=arr[i][0]; j<arr[i][0]+10; j++){
                for(int k=arr[i][1]; k<arr[i][1]+10; k++){
                    area[j][k] = 1;
                }
            }
        }

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(area[i][j] == 1){
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
