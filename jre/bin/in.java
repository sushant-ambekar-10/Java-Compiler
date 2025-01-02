// w.a.p to read data from file and print on screen //

import java.io.*;

class in
{
	public static void main(String ar[]) throws IOException
	{
		FileInputStream in= new FileInputStream("Stadium.java");	
		int n=in.available();
		byte a[]=new byte[n];
		in.read(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print((char)a[i]);
		}
	}
}		