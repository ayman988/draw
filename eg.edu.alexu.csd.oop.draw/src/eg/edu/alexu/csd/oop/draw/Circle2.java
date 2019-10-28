package eg.edu.alexu.csd.oop.draw;

import java.awt.Graphics;
import java.util.Map;
import java.lang.Math;
public class Circle2 extends Shape {
	private double x1,y1,x2,y2,c,diameter;
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
			
			diameter=Math.hypot(x2-x1, y2-y1);
			x1-=(x2-x1)/2;
			y1-=(y2-y1)/2;
			x2-=(x2-x1)/2;
			y2-=(y2-y1)/2;
		
	 }
	
	    public void draw(Graphics canvas) {
			  canvas.fillOval((int)((x1+x2)/2),(int)((y1+y2)/2),(int)(diameter),(int)(diameter));
			
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
