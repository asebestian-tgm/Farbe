

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class View extends JPanel {
	private Controller c;
	JScrollBar sbRed, sbBlue,sbGreen;
	private JFrame f1;
	private JPanel sbPanel;
	private Color farbe;
	public Drawing p1;
	
	public View(Controller c){
		this.c = c;
		this.f1 = new JFrame("Farbwahl");
		this.sbPanel = new JPanel();
		
		this.p1 = new Drawing();
		
		this.sbPanel.setLayout(new GridLayout(3, 1));
		
		/*
		 * Erstellen der ScrollBars
		 * 4te zahl gibt an wie weit sich die Scrollbar bewegen kann
		 */
		this.sbRed = new JScrollBar(JScrollBar.HORIZONTAL, 0,0,0,255);
		this.sbRed.setBackground(Color.RED);
		
		this.sbGreen = new JScrollBar(JScrollBar.HORIZONTAL, 0,0,0,255);
		this.sbGreen.setBackground(Color.GREEN);
		
		this.sbBlue = new JScrollBar(JScrollBar.HORIZONTAL, 0,0,0,255);
		this.sbBlue.setBackground(Color.BLUE);
		
		this.sbPanel.add(this.sbRed);
		this.sbPanel.add(this.sbGreen);
		this.sbPanel.add(this.sbBlue);
		
		/**
		 * Hinzufügen eines Listeners um zu Prüfen ob eine ScrollBar bewegt wurde
		 */
		
		this.sbRed.addAdjustmentListener(this.c);
		this.sbGreen.addAdjustmentListener(this.c);
		this.sbBlue.addAdjustmentListener(this.c);
		
		this.f1.add(this.p1); //Addet das Paint Component in der Mitte des Layouts
		this.f1.add(this.sbPanel, BorderLayout.SOUTH);
		
		
		
		this.f1.setResizable(false);
		this.f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.f1.setSize(350,270);
		this.f1.setVisible(true);
	}
	
	/**public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		farbe = new Color(this.m.getRed(),this.m.getGreen(),this.m.getBlue());
		this.setBackground(farbe);
		
		System.out.println(
				"Red:" + this.m.getRed() +
				" Green:" + this.m.getGreen() +
				" Blue:" + this.m.getBlue()
				);
	}*/
}
