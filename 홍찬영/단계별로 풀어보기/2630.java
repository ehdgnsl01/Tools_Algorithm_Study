import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] divide(int[][] paper, int row, int col, int len) { //paper[row][col] = 색종이 일정부분의 시작지점(왼쪽위)
        int[] count = new int[2];
        if(len == 1) {
            count[paper[row][col]]++;
            return count;
        }

        int sum = 0;
        for(int i = row; i < row + len; i++) for(int j = col; j < col + len; j++) sum+=paper[i][j];
        if(sum == 0 || sum == len*len) {
            count[paper[row][col]]++;
            return count;
        }
        int[] temp;
        temp = divide(paper, row, col, len/2);
        count[0] += temp[0];
        count[1] += temp[1];
        temp = divide(paper, row + len/2, col, len/2);
        count[0] += temp[0];
        count[1] += temp[1];
        temp = divide(paper, row, col + len/2, len/2);
        count[0] += temp[0];
        count[1] += temp[1];
        temp = divide(paper, row + len/2, col + len/2, len/2);
        count[0] += temp[0];
        count[1] += temp[1];

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] paper = new int[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) paper[i][j] = sc.nextInt();

        int[] ans = divide(paper, 0, 0, n);

        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

}
