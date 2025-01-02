import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="myapplet" width=500 height=500></applet>*/

class myapplet extends Applet
{
	public void init(Graphics g)
	{
		g.drawString("Good Night",100,100);
	}
}