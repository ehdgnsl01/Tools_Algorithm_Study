import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        int[] ans = new int[m];
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt() + arr[i-1];
        }
        for(int i = 0; i < m; i++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt();
            ans[i] =  (arr[end] - arr[start]);
        }
        for (int i = 0; i < m; i++) System.out.println(ans[i]);
    }
}