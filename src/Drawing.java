import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawing extends JPanel{
	
	Color farbe = new Color(0,0,0);
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		this.setBackground(farbe);
	
	}
	
	
	public void setFarbe(int r, int g, int b) {
		this.farbe = new Color(r,g,b);
	}
}
	
