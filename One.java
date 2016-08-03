import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {

	public static void main(String [] args) throws NumberFormatException, IOException{
		
		System.out.println("Select Option: \n1. Find Next \n2. Find Previous \n3. Find Difference between reading \n4. Find reading at position "); 
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		int sCase= Integer.parseInt(inp.readLine());

		
		switch(sCase){
			case 1: 
				System.out.println("Enter the reading-");
				int i1= Integer.parseInt(inp.readLine());
				System.out.println("The Next Reading is: " + Two.next(i1));
				break;
			case 2: 
				System.out.println("Enter the reading-");
				int i2= Integer.parseInt(inp.readLine());
				System.out.println("The Previous Reading is: " + Two.prev(i2));
				break;
			case 3: 
				System.out.println("Enter first reading-");
				int i3= Integer.parseInt(inp.readLine());
				System.out.println("Enter second reading-");
				int i4= Integer.parseInt(inp.readLine());
				System.out.println("The Difference is: " + Three.difference(i3,i4));
				break;
			case 4: 
				System.out.println("Enter first reading-");
				int i5= Integer.parseInt(inp.readLine());
				System.out.println("Enter the positive displacement-");
				int i6= Integer.parseInt(inp.readLine());
				System.out.println("The Nextnth is: " + Three.nextnth(i5,i6));
				break;
			case 5: 
				System.out.println("Enter first reading-");
				int i7= Integer.parseInt(inp.readLine());
				System.out.println("Enter the negative displacement-");
				int i8= Integer.parseInt(inp.readLine());
				System.out.println("The Prevnth is: " + Three.prevnth(i7,i8));
				break;	
				
		}
		
	}
	
}
