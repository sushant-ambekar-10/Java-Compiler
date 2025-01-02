import java.util.Scanner;

class password_reader
{
	public static void main(String ar[])
	{
		Scanner s= new Scanner (System.in);
		String pin=null;
		System.out.println("Enter Password");
		pin=s.next();
		char c=65;
		boolean a1=true;
		boolean a2=true;
		boolean a3=true;
		int i=0;
		if(pin.length()<8)
			System.out.println("Enter Password having atleast 8 digit");
		else
			
			a:for ( i=0;i<pin.length();i++)
			{
				for(c=65;c<91;c++)
				{
					if(pin.charAt(i)==c){
						a1=false;
						break ;}
				}
				for(c=48;c<57;c++)
				{
					if(pin.charAt(i)==c){
						a2=false;
						break ;}
				}
				for(c=33;c<=47;c++)
				{
					if(pin.charAt(i)==c)
						{
						a3=false;
						break ;
						}
				}
				for(c=58;c<=64;c++)
				{
					if(pin.charAt(i)==c)
						{
						a3=false;
						break ;
						}
				}
			}
			if (a1){
				System.out.println("Enter password having atleast 1 Uppercase alphabet");}
			
			
			if (a2){
				System.out.println("Enter password having atleast 1 digit");}

			if(a3){
					System.out.println("Enter Password having atleast 1 symbol such as !,@,#,$,%,&,*,?");}
	
				if (a3==false && a2==false && a1==false)
					{System.out.println("All Correct");}

	}			
}