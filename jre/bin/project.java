import java.util.Vector;
import java.util.Scanner;

public class project extends Exception
	{
	public static void main(String args[]) 
	{
	try {
	Scanner s=new Scanner(System.in);
	Vector  v = new Vector();
	ab:while(true)
		{
		System.out.println("1-Push\n"+"2-Pop\n"+"3-show\n"+"4-Exit");
		System.out.println("Enter Choice");
		int ch=s.nextInt();
		switch(ch)
			{
			case 1:
	 			System.out.println("Enter Number to insert");
				int x=s.nextInt();
				v.add(x);
				break;
			case 2:
				if (v.size()==0)
					System.out.println("No element to POP");
				System.out.println("Deleted number is"+" "+v.lastElement());
				v.removeElement(v.lastElement());
				break;
			case 3:
				System.out.println(v);
				break;
			case 4:
				break ab;
			default:
				System.out.println("Invalid Choice");
			}	
		}
	    }
	catch(Exception e)
	{
	System.out.println("Exception Caught");
	}
	



	 }
}