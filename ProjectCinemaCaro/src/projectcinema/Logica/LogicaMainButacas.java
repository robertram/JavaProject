
package projectcinema.Logica;

import projectcinema.Logica.LogicaRegistroAsientos;
import javax.swing.*;

public class LogicaMainButacas {

    public static void main(String[] args) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    JDialog.setDefaultLookAndFeelDecorated(true);

    LogicaRegistroAsientos vent = new LogicaRegistroAsientos();
    vent.setVisible(true);

    }

}
