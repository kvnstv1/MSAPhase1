

import java.awt.*;

/** Represents a layered cake that may or may not have a cherry on top*/
public class Cake{
   int x;
   int y;
   public final static int WIDTH = 60;
   private int numLayers;
   private boolean cherry;
   private Color spongeColour;
   private Color fillingColour;

   /** Takes parameters used to initialise the instance datafields. 
       The number of layers has an upper limit of 7.
       @param x the x coordinate of the bottom left corner of the cake base
       @param y the y coordinate of the bottom left corner of the cake base
       @param numLayers the number of layers in the cake
       @param cherry whether or not the cake has a cherry
       @param spongeColour the colour of the cake's sponge layers
       @param fillingColour the colour of the cake's filling
   */
   public Cake(int x, int y, int numLayers, boolean cherry, Color spongeColour,Color fillingColour){
      this.x = x;
      this.y = y;
      if(numLayers > 7){
         this.numLayers = 7;
      }else{
         this.numLayers = numLayers;
      }
      this.cherry = cherry;
      this.spongeColour = spongeColour;
      this.fillingColour = fillingColour;
   }

   /** takes a reference to a Graphics object and calls methods on it to draw the cake
       SpongeLayers are hardcoded to be 6 pixels high.
       Filling layers are hardcoded to be 3 pixels high.
       @param g a reference to a Graphics object
   */
   public void draw(Graphics g){
      int tempY = y;
      for (int i = 0; i< numLayers;i++){
         g.setColor(spongeColour);
         g.fillRect(x, tempY - 6, WIDTH, 6);       
         g.setColor(fillingColour);
         g.fillRect(x,  tempY - 9, WIDTH, 3); 
         tempY -= 9;
      }
      if(cherry){
         g.setColor(Color.red);
         g.fillOval(x + WIDTH/2 - 4, tempY - 8, 8, 8);//cherry
      }
   }
}