// color concentric circle //

import java.applet.*;
import java.awt.*;

// <applet code="color_concentric" width=400 height=400></applet> //	

public class color_concentric extends Applet 
{
	public void paint(Graphics g)
	{	
		int x=100,y=100,d=200;
		for (int i=1;i<=5;i++)
		{
			if(i%2==0)
				{g.setColor(Color.white);
				 g.fillOval(x,y,d,d);}
			else 
				{g.setColor(Color.red);
				 g.fillOval(x,y,d,d);}
			x=x+20;
			y=y+20;
			d=d-40;
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{}	
		}
	}
}	
