import java.util.*;
public class Assignment5_1 {
	public static void main(String[] args) {
		System.out.print("Enter tje number of elements: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] arr = new int[8];
		System.out.print("Enter a list: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = input.nextInt();
		}
		partition(arr);
		System.out.print("After the partition, the list is ");
		for(int value: arr)
			System.out.print(value + " ");
	}
	
	public static int partition(int[] list) {
	    int pivot = list[0];
	    int temp;
	    int left = 1;
	    int right = list.length - 1;
	    while (left < right) {
	        while (pivot > list[left]) {
	            left++;
	        }
	        while (pivot <= list[right]) {
	            right--;
	        }
	        if (left < right) {
	            temp = list[left];
	            list[left] = list[right];
	            list[right] = temp;
	        }
	    }
	    temp = list[0];
	    list[0] = list[right];
	    list[right] = temp;

	    return right;
	}
}
