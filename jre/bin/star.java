// star //

import java.applet.*;
import java.awt.*;

// <applet code="star" width=400 height=400></applet> //	

public class star extends Applet 
{
	public void paint(Graphics g)
	{
		int x[]={100,200,120,160,170,100};
		int y[]={100,90,200,80,210,100};
		g.drawPolygon(x,y,6);
	}
}
