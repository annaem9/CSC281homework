package shapes;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame; //this is the content windo
import javax.swing.JPanel; //this is a lightweight component container, in this case, a drawing panel.

/**
 * BacisShape acts as a base class for all shapes. Each shape will inherit this class.
 */

public class BasicShape {

  // the x and y position of the center of the shapes.
  public int x;
  public int y;

  public BasicShape(int x, int y) {
    this.x = x;
    this.y = y;
  }

// The other shapes will @Override this function when they inherit this class.
  public void draw(Graphics g) {}
}