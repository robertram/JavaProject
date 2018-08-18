
package projectcinema.Logica;

import javax.swing.*;
import java.awt.*;

public class LogicaFondoButacas extends JPanel{

public LogicaFondoButacas(){

this.setSize(652,491);
}

public void paintComponent(Graphics g){

Dimension tam = getSize();
ImageIcon img = new ImageIcon("butacas.jpg");

g.drawImage(img.getImage(), 0, 0, tam.width,tam.height, null);
setOpaque(false);

super.paintComponent(g);
}

}
