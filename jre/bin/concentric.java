// concentric circle //

import java.applet.*;
import java.awt.*;

// <applet code="concentric" width=400 height=400></applet> //	

public class concentric extends Applet 
{
	public void paint(Graphics g)
	{	
		int x=100,y=100,d=200;
		for (int i=1;i<=5;i++)
		{
			g.drawOval(x,y,d,d);
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
