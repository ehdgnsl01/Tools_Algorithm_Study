import java.util.Scanner;

public class B_1085_직사각형에서탈출 {
	public static void main(String[] args) {
		
		// 왼쪽 아래 꼭짓점(0,0) | 오른쪽 위 꼭짓점(w,h)
		int x, y, w, h;
		// x = w or y = h 가 되도록
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		y = scan.nextInt();
		w = scan.nextInt();
		h = scan.nextInt();
		scan.close();
		
		// 위아래 중에서 가까운 변 찾기
		int y_min = Math.min(y, h-y);
		// 좌우 중에서 가까운 변 찾기
		int x_min = Math.min(x, w-x);
		
		System.out.print(Math.min(y_min, x_min));
	}

}
