import java.util.*;
public class Welcome {
	public static void main(String[] args) {
		String ghtjfk = "Java#HTML#Perl";
		String[] tokens = ghtjfk.split("#", 0);
		for (int i = 0; i < tokens.length; i++)
		System.out.print(tokens[i] + " ");
	}
}
