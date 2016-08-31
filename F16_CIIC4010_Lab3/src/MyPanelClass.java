import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;
		
	

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
//                        //Draw outer border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw inner border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1 + 10, y1 + 10, width - 20, height - 20);
//                    
//                        //Draw negative slope line 
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw positive slope line 
//                        g.setColor(Color.CYAN);
//                        g.drawLine(x2, y1, x1, y2);
                       
//                        // Draw an oval
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((width-55)/2, (height-55)/2, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                      
                       //draw rectangle1
                       g.setColor(Color.WHITE);
                       g.fillRect(x1, height - 210 , width, 50);
                       
                       //draw rectangle2
                       g.setColor(Color.WHITE);
                       g.fillRect(x1, height - 100 , width, 50);
                       
                        
                        
                        //Draw triangle
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1 , y1);
                        triangle.addPoint(width/2 - 30, height/2);
                        triangle.addPoint(x1 , y1 + height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        // star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 35, y1 + 113);
                        p2.addPoint(x1 + 51, y1 + 113);
                        p2.addPoint(x1 + 57, y1 + 98);
                        p2.addPoint(x1 + 63, y1 + 113);
                        p2.addPoint(x1 + 79, y1 + 113);
                        p2.addPoint(x1 + 66, y1 + 123);
                        p2.addPoint(x1 + 71, y1 + 138);
                        p2.addPoint(x1 + 57, y1 + 128);
                        p2.addPoint(x1 + 44, y1 + 138);
                        p2.addPoint(x1 + 48, y1 + 123);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                       
                        
                        		
                        
                        
                        
            }
}