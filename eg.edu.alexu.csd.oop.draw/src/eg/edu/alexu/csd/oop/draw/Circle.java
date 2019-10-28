package eg.edu.alexu.csd.oop.draw;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;
public class Circle extends Shape  {
	 private double radius;
	public double getRadius(){return properties.get("1");}
	public void setProperties(Map<String, Double> properties) {
		// TODO Auto-generated method stub
		radius=properties.get("1");
	} 
	 public   java.util.Map<String, Double> getProperties(){return properties;}
	  boolean CheckBounds(java.awt.Point p) {
		  return (p.x>=getPosition().x-(radius/2)&&p.x<=getPosition().x+(radius/2)&&p.y>=getPosition().y-(radius/2)&&p.y<=getPosition().y+(radius/2));
	  }
	
	  public void draw(Graphics canvas) {
		  canvas.setColor(getFillColor());
		  canvas.fillOval(getPosition().x, getPosition().y,(int)radius,(int)radius);
		  
	    }
	    @Override
		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
	    	super.paintComponent(g);
			this.draw(g);
		}
	    public void setBoundBox() {
			  this.BoundBox[0].x=(int)(getPosition().x-radius);
			  this.BoundBox[0].y=(int)(getPosition().y-radius);
			  this.BoundBox[1].x=(int)(getPosition().x+radius);
			  this.BoundBox[1].y=(int)(getPosition().y+radius);
		  }
    
}
