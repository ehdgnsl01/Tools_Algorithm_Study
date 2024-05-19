import java.io.*;
import java.util.*;
public class Assignment10_2 {
	public static void main(String []args)throws Exception {
		String removalString = "John";
        StringBuilder arr = new StringBuilder();

        try(
            Scanner input = new Scanner(new File("practice2.txt"));
        ) {
            while(input.hasNext()) {
                String line = input.nextLine(); 
                if (line.indexOf(removalString) != -1) 
                {
                    line.replace(removalString, "");
                    arr.append(line.replace(removalString, ""));
                    arr.append("\r\n");
                }
                else 
                {
                    arr.append(line);
                    arr.append("\r\n");
                }
            }
            System.out.print(arr);
            PrintWriter file_remove = new PrintWriter(new File("practice2.txt"));
            file_remove.append(arr.toString());
            file_remove.close();
        }		
	}
}
