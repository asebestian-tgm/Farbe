

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Controller implements AdjustmentListener{
	private Model m;
	private View v;
	public Controller(){
		this.m = new Model();
		this.v = new View(this);
	}
	
	/**
	 * Überprüfen welche ScrollBar bewegt wurde
	 * 
	 * Neu setzen der Farb Werte (int)
	 */
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		System.out.println("Test");
		this.m.setRed(v.sbRed.getValue());
		this.m.setGreen(v.sbGreen.getValue());
		this.m.setBlue(v.sbBlue.getValue());
		this.v.p1.setFarbe(this.m.getRed(), this.m.getGreen(), this.m.getBlue());
		this.v.p1.repaint();
	}
}
