import java.util.Scanner;
import java.io.*;

public class Main {
	 	private static Scanner file;
		public static void main(String args[]) throws IOException 
	 	{	  
	 		file = new Scanner (new File("datos.txt"));	 		
	 		System.out.println(file.nextLine());
	 	}
}