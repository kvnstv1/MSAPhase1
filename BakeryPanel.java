import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;

public class BakeryPanel extends JPanel{
   Cake[][] cakes2 = new Cake[5][4];
   Cake[] cakes;
   int count;

   /** Creates a panel wide enough for one cake and high enough for the  number 
       of shelves specified in the local variable numShelves. The number of shelves 
       is used to set the length of the Cake array. The space between 
       shelves is specified in shelfHeight. If the array is only partially filled with cake,
       so are the shelves.
   */
   public BakeryPanel(){     
      int numShelves = 6; // change the values of this variable, optional -  try setting with user input
      int shelfHeight = 90;
      cakes = new Cake[numShelves];
      
      
      int x = 20;
      int y = shelfHeight;
      count = 0;
      int row = 0;
      int column = 0;
      
      setPreferredSize(new Dimension(Cake.WIDTH + 40, numShelves * shelfHeight));
      setBackground(Color.white);
      
      try{
         Scanner fileScan = new Scanner(new File("C:\\Users\\Dell G15\\Desktop\\Lab16\\Lab16\\bakery\\CakeSpecifications.txt"));
         
         while(fileScan.hasNextLine() && count < 20){
            String fileLine = fileScan.nextLine();
            try{
               
               Scanner sc = new Scanner(fileLine);
               int layers = sc.nextInt();
               boolean cherry = sc.nextBoolean();
               int rSponge = sc.nextInt();
               int gSponge = sc.nextInt();
               int bSponge = sc.nextInt();
               int rFilling = sc.nextInt();
               int gFilling = sc.nextInt();
               int bFilling = sc.nextInt();
               x= (0 + 70*(count%5));
               y= (0 + shelfHeight*(count/5));
               row = count%5;
               column = count/5;
               Color sponge = new Color(rSponge, gSponge, bSponge);
               Color filling = new Color(rFilling,gFilling,bFilling);
               Cake myCake = new Cake(x,y,layers,cherry,sponge,filling);
               cakes2[row][column] = myCake;
              
               //y += shelfHeight;
               count++;
            }catch(InputMismatchException e){
               System.out.println("Input does not match tehe.");
            }catch(IllegalArgumentException col){
               System.out.println("Colors must be in the right range.");
            }catch(NoSuchElementException again){
               System.out.println("Yeah we found this too.");
            }

         }
       
      }catch(FileNotFoundException e){
         System.out.println("File not found.");
      }
   }
   
   /** takes a reference to a Graphics object and passes it to draw method
       which is called on each valid Cake object in the array, cakes.
       @param g a reference to a Graphics object
   */
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      try{
         for(Cake[] i:cakes2){
            for(Cake j: i){
               j.draw(g);
            }
         }
      }catch(NullPointerException r){
         System.out.println("The cake is a lie.");
      }
      // Loop through the array and call the draw method on each valid Cake in the array
      // Optional  Use a loop to draw shelving for each cake
   }
}