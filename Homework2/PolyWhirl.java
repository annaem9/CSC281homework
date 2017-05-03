/*
 * 
 * Name: Chalirina
 * 
 * Grading: 70 points for correct completion of all tasks and 30 points for style, creativity, and
 * following instructions. Up to 10 points can be recovered if you successfully complete the bonus.
 * 
 * Tasks:
 * 
 * -Read in shape specifications that consist of 3 numbers: number of sides of the shape, the left
 * coordinate of the center in pixels, and the right coordinate of the center in pixels. There will
 * be one shape per line of input text via standard input.
 * 
 * -Make a list per shape to store instances of that shape.
 * 
 * -Read through each shape specification from the input and add a new instance of that shape to the
 * appropriate shape list. For example, the input of 3 100 100 would result in code like the
 * following in the readAndGenerateShapes method of the Surface class: this.tris.add(new Tri(100,
 * 100));
 * 
 * -Create a set of classes that extend BasicShape with the following number of sides: Tri - 3
 * sided, Quad - 4 sided, Pent - 5 sided, and Hex - 6 sided. Note that these shapes do not need to
 * be regular; each shape can have sides of non-uniform length (e.g. both squares and rectangles are
 * valid Quads.
 * 
 * -Pick a fill and stroke color for each class. Let your inner graphic designer or color theorist
 * shine through!
 * 
 * -Each shape should be ~50 pixels wide (i.e. all of the points should be roughly 25 pixels from
 * the center of the shape).
 * 
 * -Document the classes and methods you create.
 * 
 * -Document the functions that are declared after comments that contain TODO: document.
 * 
 * Bonus: Create an additional class that inherits BasicShape that can draw a regular shape with any
 * number of sides.
 */

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame; //this is the content window
import javax.swing.JPanel; //this is a lightweight component container, in this case, a drawing panel.

import shapes.*;

/**
 * The entry point for the PolyWhirl program. This class inherits JFrame and acts as a window in the
 * graphical user interface.
 * .
 */
public class PolyWhirl extends JFrame {
	public static final int WINDOW_WIDTH = 720; //size of window
	 public static final int WINDOW_HEIGHT = 640;

	private Surface surface;

 	public PolyWhirl() {
   		 initUI();
		}

  /**
   * Initializes the graphics window (a JFrame) and adds the drawing surface (a JPanel).
   */
	private void initUI() {
		this.surface = new Surface();
		setTitle("PolyWhirl");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // set the resolution of the window to be glorious 720p, as indicated above
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		add(this.surface);
		}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
        				PolyWhirl polyWhirl = new PolyWhirl(); //creates a new window, called polywhirl
        				// polyWhirl.drawShapes();
       				polyWhirl.surface.readAndGenerateShapes();
        				polyWhirl.setVisible(true);
      				}
   			 });
 		 }


 /*
   *
   * The Surface class inherits JPanel and acts as a drawing surface. It is the core of this program
   * and does the following:
   * 
   * -Reads input through the scanner, creates instances of the shapes designated by that input, and adds them to the list of shapes to be drawn.
   * this occurs via the readAndGenerateShapes method, which is recursive, meaning it calls itself. It's recursive because we want to be able to add
   * more than one shape to our list of shapes to draw!
   * 
   * -Then Manages the lists of shapes and is responsible for rendering them via the drawShapes method.
   * 
   */

	class Surface extends JPanel {

 		ArrayList<BasicShape> crystals=new ArrayList<BasicShape>();

		@Override
    		public void paintComponent(Graphics g) {
      			super.paintComponent(g);
      			this.drawShapes(g);
      			// this.readAndGenerateShapes();
    			}
 
	Scanner katz= new Scanner(System.in);
 
	public void readAndGenerateShapes() {

		if (katz.hasNextInt()==false) {  
 			System.out.println("you're out of pretty shapes--don't forget to close the window before trying again"); //exit the loop
    			} else{ 
 
			int numSides=katz.nextInt();
			int x=0;
			int y=0;

				if (numSides==3) { //if it should have three sides
 				x=katz.nextInt();
  				y=katz.nextInt();

  				Tri wetri=new Tri(x, y); //a triangle is added to our list of shapes to draw
  				crystals.add(wetri);
				} 

				else if (numSides==4) {    
  				x=katz.nextInt();
   				y=katz.nextInt();

 				Quad wequad=new Quad(x, y);
				crystals.add(wequad);
  				} 

				else if (numSides==5) {
 				x=katz.nextInt();
  				y=katz.nextInt();

 				Pent wepent=new Pent(x, y);
 				crystals.add(wepent);
				} 

				else if (numSides==6){
   				x=katz.nextInt();
   				y=katz.nextInt();

				Hex wehex=new Hex(x, y);
				crystals.add(wehex);
				}

				readAndGenerateShapes(); //after adding the shape to the list, start back up at the top. (recursion)
			}

		}
	public void drawShapes(Graphics g) {      
      		((Graphics2D) g).setColor(java.awt.Color.WHITE); // this sets the color for the background
      		((Graphics2D) g).fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);  // this creates that background

      		for (BasicShape c : this.crystals) {
      			 c.draw(g);
      			}
/*
*I think below does what the for loop above does right?
*int drawCounter=0;
*if (drawCounter<crystals.size()) {
*drawShapes();
*drawCounter=drawCounter++;
*}
*/
  		}
	}
}
