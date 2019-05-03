import java.util.*;
import java.applet.*;
import java.awt.*;
import java.text.*;
public class DigitalClock extends Applet implements Runnable
{
Thread t;
Calendar c;
Date d;
DateFormat df;
public void init()
{
t=new Thread(this,"Time Thread");
t.start();
df=DateFormat.getInstance();
}
public void run()
{
for(;;)
{
	try
	{
	c=Calendar.getInstance();
	d=c.getTime();
	Thread.sleep(1000);
	}
	catch(Exception e)
	{
	}
	repaint();
}
}

public void paint(Graphics g)
{
g.setFont(new Font("Courier New ",Font.ITALIC,20));
g.drawString(d.toString(),30,20);
g.drawString("Diffrent Format"+df.format(d),30,40);
}
}
/*<APPLET CODE="DigitalClock.class" WIDTH=300
HEIGHT=200>
</APPLET>*/
