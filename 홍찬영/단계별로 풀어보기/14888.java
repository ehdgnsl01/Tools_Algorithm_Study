import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger max = new BigInteger("-100").pow(11); //문제를 기준으로 나올수있는 최솟값.
    public static BigInteger min = new BigInteger("100").pow(11); //문제를 기준으로 나올수있는 최댓값.
    public static int n; //피연산자 개수
    public static String[] arr; //피연산자 배열.
    public static int[] operatorsNum; //각 연산자 개수 [+,-,*,/]
    public static int[] operatorList; //각 피연산자 사이에 삽인되는 연산자 순서.
    public static void main(String[] args) {
        // n, arr, operatorsNum 변수에 값 할당
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        arr = sc.nextLine().split(" ");
        operatorList = new int[n-1];
        operatorsNum = new int[4];
        for(int i = 0; i< 4; i++) operatorsNum[i]= sc.nextInt();

        //백르래킹 시작
        insertOperator(0);

        //정답 출력.
        System.out.println(max);
        System.out.println(min);


    }
    public static void insertOperator(int c){ //연산자를 끼워넣는 백트래킹 메서드. c는 operatorList에 삽입되있는 연산자 개수.
        if (c == n-1) { // 연산자를 다 끼워넣은경우.
            cal(); // 계산하고
            return; // 리턴
        }
        for(int i = 0; i < 4; i++) { //연산자 끼워넣기.
            if(operatorsNum[i]>0) { //해당 연산자(+,-,*,/)들중 아직 끼워넣을 수 있는게 남았다면
                operatorsNum[i]--; //개수 1개 차감하고
                operatorList[c] = i; //리스트에 끼워넣음.
                insertOperator(c+1); //이걸 재귀호출함.
                operatorsNum[i]++; //끼워넣은거 빼서 돌려놓음.
            }
        }
    }

    public static void cal() { // 연산자리스트가 완성됐을때 이에 맞춰서 연산함.
        BigInteger temp = new BigInteger(arr[0]); //맨 앞 숫자를 가져와서
        for(int i = 0; i < n-1; i++) { //그 뒤 연산자와 피연산자를 확인하고 알맞게 연산함.
            if(operatorList[i] == 0) temp = temp.add(new BigInteger(arr[i+1]));
            else if (operatorList[i] == 1) temp = temp.subtract(new BigInteger(arr[i+1]));
            else if (operatorList[i] == 2) temp =temp.multiply(new BigInteger(arr[i+1]));
            else if (operatorList[i] == 3) temp = temp.divide(new BigInteger(arr[i+1]));
        }
        // 방금 만든 연산자 리스트를 바탕으로 연산을 완료했을때 결과값이 지금 확인한 값들중 최소,최대라면 min, max  교체.
        if (temp.compareTo(max) > 0) max = temp;
        if (temp.compareTo(min) < 0) min = temp;
    }
}
