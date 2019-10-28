package eg.edu.alexu.csd.oop.draw;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.*;


public class DrawingEngine_I  {
ArrayList<Shape> arraylisy = new ArrayList<>();
Stack S=new Stack();
static int index=0;
	
    /* redraw all shapes on the canvas */
    public void refresh(java.awt.Graphics canvas)
    {
    	
    }

    public void addShape(Shape shape)
    {
    	arraylisy.add(shape);
    	index++;
    	if(index%3!=1){arraylisy.remove(arraylisy.get(arraylisy.size()-1));}
    	
    	
    }
    public void removeShape(Shape shape)
    {
    	arraylisy.remove(shape);
    	
    	
    }
    public void updateShape(Shape oldShape, Shape newShape)
    {
    	
    }

    /* return the created shapes objects */
    public Shape[] getShapes()
    {
        Shape[] arrayshape = new Shape[arraylisy.size()];
        arraylisy.toArray(arrayshape);
        return arrayshape;
    }
    
    /* return the classes (types) of supported shapes already exist and the
     * ones that can be dynamically loaded at runtime (see Part 3) */
    public java.util.List<Class<? extends Shape>> getSupportedShapes()
    {
    	return getSupportedShapes();
    }
  
    /* add to the supported shapes the new shape class (see Part 3) */
    // public void installPluginShape(String jarPath);

    /* limited to 20 steps. Only consider in undo & redo 
     * these actions: addShape, removeShape, updateShape */
    public void undo()
    {
    	
    	Shape sh=arraylisy.get(arraylisy.size()-1);
    	arraylisy.remove(sh);
    	S.push(sh);
    	
    }
    public void redo()
    {
    	Shape sh=(Shape)S.peek();
    	S.pop();
    	arraylisy.add(sh);  	
    }

    /* use the file extension to determine the type, 
     * or throw runtime exception when unexpected extension */
    public void save(String path)
    {
    	
    }
    public void load(String path)
    {
    	
    }
 

}
