// Football Gorund //

import java.applet.*;
import java.awt.*;

// <applet code="Football_Gorund" width=600 height=500></applet> //	

public class Football_Gorund extends Applet 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.green);
		g.fillRect(100,100,400,300);
		g.setColor(Color.white);
		g.drawRect(100,175,100,150);
		g.drawRect(100,213,62,74);
		g.setColor(Color.black);
		g.fillRect(100,230,19,40);
		g.fillRect(481,230,19,40);
		g.setColor(Color.white);
		g.drawRect(400,175,100,150);
		g.drawRect(438,213,62,74);
		g.drawLine(300,100,300,400);
		g.drawOval(290,240,20,20);
		g.setColor(Color.black);
		g.drawLine(100,100,500,100);
		g.drawLine(100,400,500,400);
		g.drawLine(100,100,100,400);
		g.drawLine(500,100,500,400);
	}
}
