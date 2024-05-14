
import java.util.Scanner;

public class YourAverage {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] name = new String[20];
        double[] num = new double[20];
        String[] score = new String[20];
        double totalnum = 0;
        double totalscore = 0;
        double result;

        for(int i=0; i<20; i++){
            name[i] = input.next();
            num[i] = input.nextDouble();
            score[i] = input.next();
            input.nextLine();
        }

        for(int i=0; i<20; i++){
            if(score[i].equals("P")){
                continue;
            }else{
                totalnum += num[i];
            }
        }

        for (int i = 0; i < 20; i++) {
            switch (score[i]) {
                case "A+": totalscore += num[i] * 4.5;
                            break;
                case "A0": totalscore += num[i] * 4.0;
                            break;
                case "B+": totalscore += num[i] * 3.5;
                            break;
                case "B0": totalscore += num[i] * 3.0;
                            break;
                case "C+": totalscore += num[i] * 2.5;
                            break;
                case "C0": totalscore += num[i] * 2.0;
                            break;
                case "D+": totalscore += num[i] * 1.5;
                            break;
                case "D0": totalscore += num[i];
                            break;
                case "F": totalscore += num[i] * 0;
                            break;
                default:
                            break;
            }
        }

        result = totalscore / totalnum;
        System.out.printf("%.6f", result);
    }
}
