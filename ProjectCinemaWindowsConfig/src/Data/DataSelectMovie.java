
package Data;

import javax.swing.ImageIcon;

public class DataSelectMovie {
   public ImageIcon spiderman(){
       ImageIcon spiderman = new ImageIcon(this.getClass().getResource("/MoviesPics/Spiderman.jpg"));
       return spiderman;
   } 
   
   public ImageIcon ironman(){
       ImageIcon ironman = new ImageIcon(this.getClass().getResource("/MoviesPics/Ironman.jpg"));
       return ironman;
   }
   
   public ImageIcon batman(){
       ImageIcon batman = new ImageIcon(this.getClass().getResource("/MoviesPics/batman.jpg"));
       return batman;
   }
   
   public ImageIcon empty(){
       ImageIcon empty = new ImageIcon(this.getClass().getResource("/MoviesPics/film.jpg"));
       return empty;
   }
}