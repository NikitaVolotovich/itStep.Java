import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MainClass 
{
	public static void main(String[] args) 
	{
        JFrame pe = new PaintEditor();
        pe.addWindowListener(new WindowAdapter() 
			{
                public void windowClosing(WindowEvent ev) 
				{
                    System.exit(0);
                }
            });
        pe.setBounds(400, 400, 400, 400);
        pe.setTitle("MyPaint");
        pe.setVisible(true);
    }
}
