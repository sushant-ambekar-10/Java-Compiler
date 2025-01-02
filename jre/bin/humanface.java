// humanface //

import java.applet.*;
import java.awt.*;

// <applet code="humanface" width=400 height=400></applet> //	

public class humanface extends Applet 
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.pink);
		g.fillOval(40,40,120,150);
		g.setColor(Color.black);
		g.fillArc(51,40,101,66,0,180);
		g.setColor(Color.white);
		g.fillOval(57,75,30,20);
		g.fillOval(110,75,30,20);
		g.setColor(Color.black);
		g.fillOval(68,83,10,10);	
		g.fillOval(121,83,10,10);
		g.setColor(Color.pink);
		g.fillOval(30,92,15,30);
		g.fillOval(155,92,15,30);
		g.setColor(Color.red);
		g.fillArc(60,125,80,40,180,180);
		g.setColor(Color.black);
		g.drawLine(99,105,88,130);
		g.drawLine(88,130,110,130);
		g.drawLine(110,130,99,105);
	}
}	
