import java.util.*;

public class Assignment5_2 {
    public static void main(String[] args) {
        int[][] arr = new int[8][7];
        Scanner input = new Scanner(System.in);
        for(int y=0; y<arr.length; y++)
            for(int x=0; x<arr[y].length; x++)
                arr[y][x]=input.nextInt();

        HashMap<Integer, Integer> empHours = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int totalHours = 0;
            for(int j=0; j<arr[i].length; j++) {
                totalHours += arr[i][j];
            }
            empHours.put(i, totalHours);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(empHours.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<Integer, Integer> entry : list) {
            System.out.println("Employee " + entry.getKey() + ": " + entry.getValue());
        }
        
        input.close();
    }
}
