package eg.edu.alexu.csd.oop.draw;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Triangle extends Shape {	
	HashMap<String, Double> properties  = new HashMap<>(2); 
	double x1,y1,x2,y2,x3,y3;
	int[] xs = new int[3]; int[] ys=new int[3];
	
	
	 public void setBoundBox() {
		
		int minX =Integer.MAX_VALUE ,minY =Integer.MAX_VALUE ,maxX= Integer.MIN_VALUE, maxY =Integer.MIN_VALUE;
		for(int i = 0 ; i < 3 ; i++)
		{
			if(xs[i] < minX)
			{
				minX=xs[i];
			}
			if(xs[i] > maxX)
			{
				maxX=xs[i];
			}
			if(ys[i] < minY)
			{
				minY=ys[i];
			}
			if(ys[i] > maxY)
			{
				maxY=ys[i];
			}
		}
		this.BoundBox[0].x =(int) minX;
		this.BoundBox[0].y =(int) minY;
		this.BoundBox[1].x =(int) maxX;
		this.BoundBox[1].y =(int) maxY;	
	}
	@Override
	public void setProperties(Map<String, Double> properties) {		
		x1 = properties.get("x1");
		y1 = properties.get("y1");
		x2 = properties.get("x2");
		y2 = properties.get("y2");
		x3 = properties.get("x3");
		y3 = properties.get("y3");
		xs[0]=(int)x1;
		ys[0]=(int)y1;
		xs[1]=(int)x2;
		ys[1]=(int)y2;
		xs[2]=(int)x3;
		ys[2]=(int)y3;
	}
	@Override
	public Map<String, Double> getProperties() {
		return this.properties;
	}
	@Override
	public void draw(Graphics canvas) {
		canvas.setColor(this.getColor());
		canvas.drawPolygon(xs,ys,3);
		canvas.setColor(this.getFillColor());
		canvas.fillPolygon(xs, ys, 3);
		
		
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.draw(g);
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return null;
	}	
}
