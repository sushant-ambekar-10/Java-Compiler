// Bar Graph //

import java.applet.*;
import java.awt.*;

// <applet code="Bar_Graph" width=900 height=700></applet> //	

public class Bar_Graph extends Applet 
{
	public void paint(Graphics g)
	{
		g.drawLine(100,75,100,500);
		g.drawLine(100,500,750,500);
		g.drawRect(600,255,60,245);
		g.fillRect(500,115,60,385);
		g.setColor(Color.lightGray);
		g.fillRect(200,230,60,270);
		g.setColor(Color.gray);
		g.fillRect(300,200,60,300);
		g.setColor(Color.darkGray);
		g.fillRect(400,160,60,340);
		g.drawString("POPULATION IN",5,330);
		g.drawString("CRORE",20,342);
		g.drawString("0",90,490);
		g.drawString("0",110,513);
		g.drawString("YEARS IN DECADES",350,560);
		g.drawString("1980",215,515);
		g.drawString("1990",315,515);
		g.drawString("2000",415,515);
		g.drawString("2010",515,515);
		g.drawString("2020",615,515);
		g.drawString("60",225,225);
		g.drawString("66",325,195);
		g.drawString("74",425,155);
		g.drawString("112",525,110);
		g.drawString("55",625,250);
	}
}
