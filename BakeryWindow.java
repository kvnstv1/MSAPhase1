

import javax.swing.*;

public class BakeryWindow{
   public static void main(String[]args){
      JFrame frame = new JFrame("Bakery Window"); //creates a new JFrame with a title
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// Allows us to close the window

      BakeryPanel panel1 = new BakeryPanel();// Creates a new instance of our main panel
      frame.getContentPane().add (panel1);// adds the panel to the JFrame
      frame.pack(); // forces the JFrame to expand to accommodate the panel - try commenting this line out
      frame.setVisible(true);// pretty much what it says - try commenting this line out 
   }
}