package eg.edu.alexu.csd.oop.draw;

import java.awt.Graphics;
import java.util.Map;

public class Square2 extends Shape {
	private double x1,y1,x2,y2,c;
	 public void setProperties(Map<String, Double> properties) {
			x1 = properties.get("X1");
			y1 = properties.get("Y1");
			x2 = properties.get("X2");
			y2 = properties.get("Y2");
			if(x1>x2) {
				c=x1;
				x1=x2;
				x2=c;
			}
			if(y1>y2) {
				c=y1;
				y1=y2;
				y2=c;
			}
			
	 }
	
	    public void draw(Graphics canvas) {
			  canvas.fillRect((int)(x1),(int)(y1),(int)(x2-x1),(int)(y2-y1));
			
		    }
		    @Override
			public void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
		    	super.paintComponent(g);
				this.draw(g);
			}
		  public void setBoundBox() {
			  this.BoundBox[0].x=(int)(x1);
			  this.BoundBox[0].y=(int)(y1);
			  this.BoundBox[1].x=(int)(x2);
			  this.BoundBox[1].y=(int)(y2);
		  }
}
