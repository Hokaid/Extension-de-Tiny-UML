package org.tinyuml.ui.commands;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class ColorPalette extends JFrame
{
	private JButton chgCor;
	private Color color = Color.lightGray;
	private Container c;
	public ColorPalette()
	{
		super("Using JColorChosser");
		c=getContentPane();
		c.setLayout(new FlowLayout());
		chgCor=new JButton("Change Color");
		chgCor.addActionListener(new ActionListener()
		
		{
		public void actionPerformed(ActionEvent e)
		{
			color=JColorChooser.showDialog(ColorPalette.this,"Choose a color",color);
			if(color==null)
				color= color.lightGray;
			c.setBackground(color);
			c.repaint();
		}
		}
		);
		c.add(chgCor);
		setSize(400,130);
	}

}
