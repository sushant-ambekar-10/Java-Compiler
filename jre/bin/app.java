import java.applet.Applet;
import java.awt.Graphics;

/*<applet code="app.class" width=200 height=200> </applet>*/

public class app extends Applet
{
	public void paint(Graphics g)
		{
		g.drawLine(100,100,150,150);
		}
}