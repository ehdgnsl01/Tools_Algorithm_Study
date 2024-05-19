import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String[] s = sc.nextLine().split(" ");
        for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
        Arrays.sort(arr);
        int m = sc.nextInt();
        sc.nextLine();
        int[] x = new int[m];
        s = sc.nextLine().split(" ");
        for(int i = 0; i < m; i++) x[i] = Integer.parseInt(s[i]);


        for(int i = 0; i < m; i++) {
            int front = 0, mid = n/2, back = n-1;
            while(true) {
                if(arr[mid] == x[i]){
                    System.out.println(1);
                    break;
                }
                if(front == back) {
                    System.out.println(0);
                    break;
                }
                if(arr[mid] > x[i]) {
                    back = mid - 1;
                    mid = (back+front) / 2;
                }
                else {
                    front = mid + 1;
                    mid = (back+front) / 2;
                }
            }
        }
    }
}
