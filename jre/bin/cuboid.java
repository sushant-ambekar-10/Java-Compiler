// cuboid //

import java.applet.*;
import java.awt.*;

// <applet code="cuboid" width=400 height=400></applet> //	

public class cuboid extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawRect(100,100,50,50);
		g.drawRect(125,125,50,50);
		g.drawLine(100,100,125,125);
		g.drawLine(100,150,125,175);
		g.drawLine(150,100,175,125);
		g.drawLine(150,150,175,175);
	}
}
