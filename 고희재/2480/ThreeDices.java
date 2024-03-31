public class ThreeDices {
    public static void main(String[] main){

        int[] number = new int[3];
        for(int i=0; i<3; i++){
            number[i] = (int)(Math.random() * 6) + 1;
        }

        for(int i=0; i<3; i++){
            System.out.print(number[i] + " ");
        }

        Arrays.sort(number);
        int max = number[2];

        if(number[0] == number[1] && number[1] == number[2]){
            System.out.println("상금은 " + (10000 + max * 1000) + "원입니다.");
        }else if(number[0] == number[1] || number[1] == number[2] || number[0] == number[2]){
            if(number[0] == number[1]){
                System.out.println("상금은 " + (1000 + number[0] * 100) + "원입니다.");
            }else if(number[0] == number[2]){
                System.out.println("상금은 " + (1000 + number[0] * 100) + "원입니다.");
            }else{
                System.out.println("상금은 " + (1000 + number[1] * 100) + "원입니다.");
            }
        }else{
            System.out.println("상금은" + (max * 100) + "원 입니다.");
        }
    }
}
