import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 100000 * -100;
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String[] s = sc.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);

        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = arr[i] + sum[i];
        }
        for (int i = k; i <= n; i++) {
            long temp = sum[i] - sum[i-k];
            if (ans < temp) ans = temp;
        }
        System.out.println(ans);
    }
}
