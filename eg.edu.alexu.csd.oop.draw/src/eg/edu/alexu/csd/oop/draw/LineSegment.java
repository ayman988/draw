package eg.edu.alexu.csd.oop.draw;
import java.awt.Color;
import java.awt.*;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class LineSegment extends Shape {
	 HashMap<String, Double> properties  = new HashMap<>(4); 
	 private double X1,Y1,X2,Y2;
	 
	 public void setBoundBox() {
		
		 if(X1 <= X2)
		 {
			 this.BoundBox[0].x =(int) X1;
			 this.BoundBox[1].x =(int) X2;
		 }
		 else
		 {
			 this.BoundBox[0].x =(int) X2;
			 this.BoundBox[1].x =(int) X1;
		 }
		 if(Y1<=Y2)
		 {
			this.BoundBox[0].y =(int) Y1;
			this.BoundBox[1].y =(int) Y2;	
		 }
		 else
		 {
			this.BoundBox[0].y =(int) Y2;
			this.BoundBox[1].y =(int) Y1;	
		 }

	}

	@Override
	public void setProperties(Map<String, Double> properties) {
		X1 = properties.get("X1");
		Y1 = properties.get("Y1");
		X2 = properties.get("X2");
		Y2 = properties.get("Y2");
	}
	@Override
	public Map<String, Double> getProperties() {
		return this.properties;
	}
	@Override
	public void draw(Graphics canvas) {
		canvas.setColor(this.getColor());
		canvas.drawLine((int)X1,(int)Y1,(int) X2,(int) Y2);
		canvas.setColor(this.getFillColor());
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
//	public Boolean CheckBoundsOfShape (Point P)
//	{
//		if( ( (X1 <P.x && P.x < X2) || (X2 <P.x && P.x < X1) ) &&  ( (Y1 <P.y && P.y < Y2) || (Y2 <P.y && P.y < Y1) ) )
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}

}
