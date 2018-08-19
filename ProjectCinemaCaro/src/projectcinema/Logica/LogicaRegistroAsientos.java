
package projectcinema.Logica;

import projectcinema.Logica.LogicaInformacionTablaButacas;
import projectcinema.Logica.LogicaFondoButacas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import projectcinema.Bill;
import projectcinema.TicketsMenu2;

public class LogicaRegistroAsientos extends JFrame implements ActionListener{
private LogicaFondoButacas fondo;
private LogicaInformacionTablaButacas tabla;
private Font fuente;

private JButton [][] btButaca1;
private JButton [][] btButaca2;

private JDialog dialg;
private JButton bt2,bt3,bt4;
private JTextField txf3,txf4,txf5;
private JLabel jl3,jl4,jl5;

private JTextField txf6,txf7;
private JLabel jl6,jl8;

public LogicaRegistroAsientos(){
super("Reserva de Butacas");
fondo = new LogicaFondoButacas();
tabla = new LogicaInformacionTablaButacas(4);
fuente = new Font("Calibri", Font.BOLD, 15);
this.getContentPane().setLayout(null);
this.add(this.pnlPuestos());
this.add(this.pnlInformacion());
this.add(fondo);

this.setSize(842, 524);
this.setResizable(false);
this.setLocationRelativeTo(null);
this.addWindowListener(new WindowAdapter(){
                        public void windowClosing(WindowEvent e){
                            dispose();
   }});
    }

    private JPanel pnlPuestos(){

bt3 = new JButton("Anterior");
bt3.setFont(fuente);
bt3.setBounds(200,450,95,30);
bt3.addActionListener(this);
bt4 = new JButton("Pagar");
bt4.setFont(fuente);
bt4.setBounds(400,450,80,30);
bt4.addActionListener(this);
btButaca1 = new JButton[7][3];
btButaca2 = new JButton[7][3];
for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
btButaca1[i][j] = new JButton();
btButaca2[i][j] = new JButton();
btButaca1[i][j].setBackground(Color.GREEN);
btButaca2[i][j].setBackground(Color.GREEN);
    }
}
int cont = 1;
cont = 0;
for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
        cont++;
        btButaca1[i][j].setToolTipText("N.B1-"+cont);
        btButaca1[i][j].setText((cont < 10 ? "0" : "") + cont++);
}}
cont = 41;
for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
        cont++;
        btButaca2[i][j].setToolTipText("N.B2-"+cont);
        btButaca2[i][j].setText((cont < 10 ? "0" : "") + cont++);
 }}
int xe1 = 215;
int xe2 = 375;
int ye = 60;
        
 int x1 = 110;
 int x2 = 340;
int y = 135;
for(int i=0; i<3; i++){            
     for(int j=0; j<7; j++){
         btButaca1[j][i].setBounds(x1,y+=40,55,20);
         btButaca2[j][i].setBounds(x2,y,55,20);
 }
x1+=50;
x2+=50;
y=135;
 }
JPanel pnl = new JPanel();
pnl.setLayout(null);
pnl.setBounds(0,0,500,500);
pnl.setOpaque(false);

pnl.add(bt3);
pnl.add(bt4);

for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
        pnl.add(btButaca1[i][j]);
        pnl.add(btButaca2[i][j]);
    }
}

for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
        btButaca1[i][j].addActionListener(this);
        btButaca1[i][j].addMouseListener(new Raton());
        btButaca2[i][j].addActionListener(this);
        btButaca2[i][j].addMouseListener(new Raton());
    }
}

return pnl;
}

private JPanel pnlInformacion(){

jl6 = new JLabel("Hora Actual");
jl8 = new JLabel("Asiento(s)");


txf6 = new JTextField();
txf7 = new JTextField();


jl6.setForeground(Color.white);
jl8.setForeground(Color.white);


txf6.setEditable(true);
txf7.setEditable(true);


txf6.setBackground(Color.white);
txf7.setBackground(Color.white);


txf6.setForeground(Color.blue);
txf7.setForeground(Color.blue);


jl6.setFont(fuente);
jl8.setFont(fuente);


txf6.setFont(fuente);
txf7.setFont(fuente);


int y = 20;
int inc = 65;

jl6.setBounds(15,y,100,30);
jl8.setBounds(15,y+=inc,100,30);


y = 50;

txf6.setBounds(15,y,150,30);
txf7.setBounds(15,y+=inc,150,30);


JPanel pnl = new JPanel();
pnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Informacion",1,0,fuente,Color.white));
pnl.setLayout(null);
pnl.setBounds(652,0,180,491);
pnl.setOpaque(true);
pnl.setBackground(new Color(0,64,128));

pnl.add(jl6);
pnl.add(jl8);

pnl.add(txf6);
pnl.add(txf7);


        return pnl;
    }

private JDialog dialogo(int j, int i, String asiento){


jl3 = new JLabel("Columna");
jl4 = new JLabel("Fila");
jl5 = new JLabel("Asiento");


txf3 = new JTextField();
txf4 = new JTextField();
txf5 = new JTextField();


bt2 = new JButton("Devolver");


txf3.setEditable(false);
txf4.setEditable(false);
txf5.setEditable(false);


txf3.setBackground(Color.white);
txf4.setBackground(Color.white);
txf5.setBackground(Color.white);


txf3.setText(""+i);
txf4.setText(""+j);
txf5.setText(asiento);


jl3.setBounds(30,40,70,30);
jl4.setBounds(30,80,70,30);
jl5.setBounds(30,120,70,30);



txf3.setBounds(100,40,60,25);
txf4.setBounds(100,80,60,25);
txf5.setBounds(100,120,60,25);

bt2.setBounds(90,230,110,30);


bt2.addActionListener(this);


jl3.setFont(fuente);
jl4.setFont(fuente);
jl5.setFont(fuente);



txf3.setFont(fuente);
txf4.setFont(fuente);
txf5.setFont(fuente);


bt2.setFont(fuente);

dialg = new JDialog(this,"Datos del asiento", true);
dialg.setLayout(null);
dialg.setSize(270,310);
dialg.setLocationRelativeTo(null);
dialg.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
dialg.dispose();  
}});

dialg.add(jl3);
dialg.add(jl4);
dialg.add(jl5);

dialg.add(txf3);
dialg.add(txf4);
dialg.add(txf5);

dialg.add(bt2);
return dialg;
}

class Raton extends MouseAdapter{
 public void mouseEntered(MouseEvent e){
     Object f = e.getSource();
     for(int i=0; i<7; i++){
                for(int j=0; j<3; j++){
if(f.equals(btButaca1[i][j])){
    if(tabla.buscar(btButaca1[i][j].getToolTipText(), 2) == true){
 txf6.setText((String)tabla.darDato(1));
 txf7.setText((String)tabla.darDato(0));
 
 }
}
   }}}
 public void mouseExited(MouseEvent e){
   Object f = e.getSource();
    for(int i=0; i<7; i++){
     for(int j=0; j<3; j++){
     if(f.equals(btButaca1[i][j])){
txf6.setText("");
txf7.setText("");

 }
    if(f.equals(btButaca2[i][j])){
txf6.setText("");
txf7.setText("");

  }}}}}
    public void actionPerformed(ActionEvent e){
        Object f = e.getSource();
        for(int i=0; i<7; i++){
            for(int j=0; j<3; j++){
        if(f.equals(btButaca1[i][j])){
             if(btButaca1[i][j].getBackground() == Color.red){

  JOptionPane.showMessageDialog(this, "El asiento ya esta ocupado", "Lo sentimos",JOptionPane.WARNING_MESSAGE);
}else{
this.dialogo(i,j,btButaca1[i][j].getToolTipText());
this.dialogo(i,j,btButaca1[i][j].getToolTipText()).setVisible(true);
 }
}
if(f.equals(btButaca2[i][j])){
 if(btButaca2[i][j].getBackground() == Color.red){
JOptionPane.showMessageDialog(this, "El asiento ya esta ocupado", "Lo sentimos",JOptionPane.WARNING_MESSAGE);
 } else{
        this.dialogo(i,j,btButaca2[i][j].getToolTipText());
        this.dialogo(i,j,btButaca2[i][j].getToolTipText()).setVisible(true);
 }}}}      

    if(f.equals(bt2)){
            dialg.dispose();
        }
  if(f.equals(bt3)){ 
TicketsMenu2 a= new TicketsMenu2();
a.setVisible(true);
 this.setVisible(false);
}
 if(f.equals(bt4)){ 
  Bill a= new Bill();
  a.setVisible(true);
  this.setVisible(false);
  
  Bill.txtAsiento.setText(txf7.getText());
  Bill.txthora.setText(txf6.getText());
 }
 }}