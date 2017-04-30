  /*
   *
   * The Surface class inherits JPanel and acts as a drawing surface. It is the core of this program
   * and does the following:
   * 
   * -Reads input, creates appropriate instances of shapes, and adds them to the correct list via
   * the readAndGenerateShapes method.
   * 
   * -Manages the lists of shapes and is responsible for rendering them via the drawShapes method.
   * 
   * You are responsible for editing and adding capabilities to this class for the assignment.
   */

  class Surface extends JPanel {
@Override
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.drawShapes(g);
      // this.readAndGenerateShapes();
    }
  
  Scanner katz= new Scanner(System.in);
  ArrayList<BasicShape> crystals=new ArrayList<BasicShape>();

public void readAndGenerateShapes() {

int numSides=katz.NextInt();
}

if numSides==3 {
  x=katz.NextInt();
  y=katz.NextInt();

  Tri wetri=new Tri(int x, int y);
  crystals.add(wetri);

  } else if numSides==4 {    
   x=katz.NextInt();
   y=katz.NextInt();

  Quad wequad=new Quad(int x, int y);
crystals.add(wequad);
  } else if numSides==5 {
  
  sides=numSides;
  x=katz.NextInt();
  y=katz.NextInt();

  Pent wepent=new Pent(int x, int y);
  crystals.add(wepent);

  } else if numSides==6{
   x=katz.NextInt();
   y=katz.NextInt();

  Hex wehex=new Hex(int x, int y);
crystals.add(wehex);
}

if katz.hasNextLine()=true{
readAndGenerateShapes();
    }

public void drawShapes(Graphics g) {      
      ((Graphics2D) g).setColor(java.awt.Color.WHITE); // this draws a white background
      ((Graphics2D) g).fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);  // this fills that background with a certain gradient

      for (BasicShape c : this.crystals) {
        c.draw(g);
      }
   int drawCounter=0;
   if drawCounter<crystal.length {
     drawShapes();
     drawCounter=drawCounter++;
    }

  }
}