import java.util.Scanner;

public class Stars {
    public static void main(String[] args){
        int num;
        System.out.print("enter the number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=num-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=i-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=num-1; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=num-i; j>0; j--){
                System.out.print("*");
            }
            for(int j=num-1-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
