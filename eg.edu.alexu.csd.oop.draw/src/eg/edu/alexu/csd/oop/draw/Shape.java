package eg.edu.alexu.csd.oop.draw;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public   class Shape extends JPanel implements IShape  {
	static java.awt.Point position = new java.awt.Point();
	private java.awt.Color color = new java.awt.Color(0,0,0);
	private java.awt.Color fillcolor = new java.awt.Color(0,0,0);
    static	Map<String, Double> properties = new LinkedHashMap<>();
	Point [] BoundBox=new Point[2];
    public void setPosition(java.awt.Point position)
    {
    	this.position.x=position.x;
    	this.position.y=position.y;
    }
    
    public java.awt.Point getPosition()
    {
    	return this.position;
    }

    // update shape specific properties (e.g., radius)
    @Override
    public void setProperties(java.util.Map<String, Double> properties)
    {
    	//this.properties=properties;
    }

    public   java.util.Map<String, Double> getProperties(){return properties;}



    public void setColor(java.awt.Color color)
    {
    	this.color=color;
    }
    public java.awt.Color getColor()
    {
    	return color;
    }

    public void setFillColor(java.awt.Color color)
    {
    	this.fillcolor=color;
    }
    public java.awt.Color getFillColor()
    {
    	return fillcolor;
    }
    
    
    // redraw the shape on the canvas
    public void draw(java.awt.Graphics canvas)
    {    
    	//canvas.fillOval(50, 50, 50, 50);
    	
    }
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
	}


    // create a deep clone of the shape
   // @Override
    //public   Object clone() throws CloneNotSupportedException{}
}
