package eg.edu.alexu.csd.oop.draw;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

import javax.swing.JPanel;

public class Square  extends Shape {
	private double length, width;
	 public void setProperties(Map<String, Double> properties) {
		 length=properties.get("Height");
		 width=properties.get("Width");
	 }
	 boolean CheckBounds(java.awt.Point p) {
		  return (p.x>=getPosition().x-(length/2)&&p.x<=getPosition().x+(length/2)&&p.y>=getPosition().y-(width/2)&&p.y<=getPosition().y+(width/2));
	  }
	    public void draw(Graphics canvas) {
			  canvas.fillRect(getPosition().x, getPosition().y,(int)length,(int)width);
			
		    }
		    @Override
			public void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
		    	super.paintComponent(g);
				this.draw(g);
			}
		  public void setBoundBox() {
			  this.BoundBox[0].x=(int)(getPosition().x-length/2);
			  this.BoundBox[0].y=(int)(getPosition().y-width/2);
			  this.BoundBox[1].x=(int)(getPosition().x+length/2);
			  this.BoundBox[1].y=(int)(getPosition().y+width/2);
		  }
	    
}
