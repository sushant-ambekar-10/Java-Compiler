// Stadium //

import java.applet.*;
import java.awt.*;

// <applet code="Stadium" width=700 height=700> </applet> //

public class Stadium extends Applet
{
	public void paint(Graphics g)
	{
		Color c= new Color(00,00,60);
		g.setColor(c);	
		g.fillOval(100,100,600,600);
		Color c2= new Color(0,100,0);
		g.setColor(c2);
		g.fillOval(200,200,400,400);
		g.setColor(Color.white);
		g.drawOval(225,225,350,350);
		g.drawOval(300,300,200,200);
		g.setColor(Color.pink);
		g.fillRect(390,375,20,45);
	}
}		