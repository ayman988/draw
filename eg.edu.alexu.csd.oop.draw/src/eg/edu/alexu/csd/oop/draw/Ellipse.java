package eg.edu.alexu.csd.oop.draw;
import java.util.Map;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Ellipse extends Shape  {
	 HashMap<String, Double> properties  = new HashMap<>(2); 
	 private double Height,Width;
	 int[] boundingBox= new int[4];
	@Override
	public void setProperties(Map<String, Double> properties) {
		// TODO Auto-generated method stub
		Height=properties.get("Height");
		Width=properties.get("Width");
	}
	@Override
	public Map<String, Double> getProperties() {
		// TODO Auto-generated method stub
		properties.put("Height", Height);
		properties.put("Width", Width);
		return properties;
	}
	@Override
	public void draw(Graphics canvas) {
		canvas.setColor(this.getColor());
		canvas.drawOval(this.getPosition().x, this.getPosition().y, (int)Width,(int)Height);
		canvas.setColor(this.getFillColor());
		canvas.fillOval(this.getPosition().x, this.getPosition().y,(int)Width,(int)Height);
	
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
		System.out.println("hello");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}
	private void setBoundingBox()
	{
		//x1
		this.boundingBox[0]= this.getPosition().x-(int)Width/2;
		//y1
		this.boundingBox[1]= this.getPosition().x-(int)Height/2;
		//x2
		this.boundingBox[2]= this.getPosition().x+(int)Width/2;
		//y2
		this.boundingBox[3]= this.getPosition().x+(int)Height/2;
	}
}