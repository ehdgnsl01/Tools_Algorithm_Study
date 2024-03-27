import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void hanoi(int n, int start, int mid, int end) throws IOException {
        if(n == 1) {
            bw.write(start+ " " + end + "\n");
            return;
        }
        hanoi(n-1, start, end, mid);
        bw.write(start + " " + end + "\n");
        hanoi(n-1, mid, start, end);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bw.write((int)Math.pow(2,n) - 1 + "\n");
        hanoi(n, 1, 2, 3);
        bw.flush();
        bw.close();
    }
}
