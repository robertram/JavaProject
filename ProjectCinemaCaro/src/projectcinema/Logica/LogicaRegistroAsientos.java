
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
private JButton bt1,bt2,bt3,bt4;
private JTextField txf1,txf3,txf4,txf5;
private JLabel jl1,jl3,jl4,jl5;

private JTextField txf6,txf7,txf9,txf10,txf12;
private JLabel jl6,jl8,jl9,jl10,jl12;

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
        btButaca1[i][j].setToolTipText("N."+cont);
        btButaca1[i][j].setText((cont < 10 ? "0" : "") + cont++);
}}
cont = 41;
for(int i=0; i<7; i++){
    for(int j=0; j<3; j++){
        cont++;
        btButaca2[i][j].setToolTipText("N."+cont);
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

jl6 = new JLabel("Nombre");
jl8 = new JLabel("Asiento");
jl9 = new JLabel("Columna");
jl10 = new JLabel("Fila");
jl12 = new JLabel("Estado");

txf6 = new JTextField();
txf7 = new JTextField();
txf9 = new JTextField();
txf10 = new JTextField();
txf12 = new JTextField();

jl6.setForeground(Color.white);
jl8.setForeground(Color.white);
jl9.setForeground(Color.white);
jl10.setForeground(Color.white);
jl12.setForeground(Color.white);

txf6.setEditable(false);
txf7.setEditable(false);
txf9.setEditable(false);
txf10.setEditable(false);
txf12.setEditable(false);

txf6.setBackground(Color.white);
txf7.setBackground(Color.white);
txf9.setBackground(Color.white);
txf10.setBackground(Color.white);
txf12.setBackground(Color.white);

txf6.setForeground(Color.blue);
txf7.setForeground(Color.blue);
txf9.setForeground(Color.blue);
txf10.setForeground(Color.blue);
txf12.setForeground(Color.blue);

jl6.setFont(fuente);
jl8.setFont(fuente);
jl9.setFont(fuente);
jl10.setFont(fuente);
jl12.setFont(fuente);

txf6.setFont(fuente);
txf7.setFont(fuente);
txf9.setFont(fuente);
txf10.setFont(fuente);
txf12.setFont(fuente);

int y = 20;
int inc = 65;

jl6.setBounds(15,y,100,30);
jl8.setBounds(15,y+=inc,100,30);
jl9.setBounds(15,y+=inc,100,30);
jl10.setBounds(15,y+=inc,100,30);
jl12.setBounds(15,y+=inc,100,30);

y = 50;

txf6.setBounds(15,y,150,30);
txf7.setBounds(15,y+=inc,150,30);
txf9.setBounds(15,y+=inc,100,30);
txf10.setBounds(15,y+=inc,100,30);
txf12.setBounds(15,y+=inc,100,30);

JPanel pnl = new JPanel();
pnl.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.white), "Informacion",1,0,fuente,Color.white));
pnl.setLayout(null);
pnl.setBounds(652,0,180,491);
pnl.setOpaque(true);
pnl.setBackground(new Color(0,64,128));

pnl.add(jl6);
pnl.add(jl8);
pnl.add(jl9);
pnl.add(jl10);
pnl.add(jl12);
pnl.add(txf6);
pnl.add(txf7);
pnl.add(txf9);
pnl.add(txf10);
pnl.add(txf12);

        return pnl;
    }

private JDialog dialogo(int j, int i, String asiento){

jl1 = new JLabel("Nombre");
jl3 = new JLabel("Columna");
jl4 = new JLabel("Fila");
jl5 = new JLabel("Asiento");

txf1 = new JTextField();
txf3 = new JTextField();
txf4 = new JTextField();
txf5 = new JTextField();

bt1 = new JButton("Registrar asiento(s)");
bt2 = new JButton("Cancelar");

txf1.setEditable(false);
txf3.setEditable(false);
txf4.setEditable(false);
txf5.setEditable(false);

txf1.setBackground(Color.white);
txf3.setBackground(Color.white);
txf4.setBackground(Color.white);
txf5.setBackground(Color.white);

// txf1.setText(usuarios);
txf3.setText(""+i);
txf4.setText(""+j);
txf5.setText(asiento);

jl1.setBounds(30,30,70,30);
jl3.setBounds(30,110,70,30);
jl4.setBounds(30,150,70,30);
jl5.setBounds(30,190,70,30);

txf1.setBounds(100,30,130,30);

txf3.setBounds(100,110,60,30);
txf4.setBounds(100,150,60,30);
txf5.setBounds(100,190,60,30);

bt1.setBounds(5,230,160,30);
bt2.setBounds(170,230,88,30);

bt1.addActionListener(this);
bt2.addActionListener(this);

jl1.setFont(fuente);
jl3.setFont(fuente);
jl4.setFont(fuente);
jl5.setFont(fuente);

txf1.setFont(fuente);

txf3.setFont(fuente);
txf4.setFont(fuente);
txf5.setFont(fuente);

bt1.setFont(fuente);
bt2.setFont(fuente);

dialg = new JDialog(this,"Datos de la compra", true);
dialg.setLayout(null);
dialg.setSize(270,310);
dialg.setLocationRelativeTo(null);
dialg.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
dialg.dispose();  
}});
dialg.add(jl1);
dialg.add(jl3);
dialg.add(jl4);
dialg.add(jl5);
dialg.add(txf1);
dialg.add(txf3);
dialg.add(txf4);
dialg.add(txf5);
dialg.add(bt1);
dialg.add(bt2);
return dialg;
}
private void cambiarColor(int j, int i, String asiento){
String ast = asiento.substring(0, 5);
  if(ast.equals("EC.B1")){
btButaca1[i][j].setBackground(Color.red);
}
if(ast.equals("EC.B2")){
}}
class Raton extends MouseAdapter{
 public void mouseEntered(MouseEvent e){
     Object f = e.getSource();
     for(int i=0; i<7; i++){
                for(int j=0; j<3; j++){
if(f.equals(btButaca1[i][j])){
    if(tabla.buscar(btButaca1[i][j].getToolTipText(), 2) == true){
 txf6.setText((String)tabla.darDato(1));
 txf7.setText((String)tabla.darDato(0));
 txf9.setText("" + tabla.darDato(4));
 txf10.setText("" + tabla.darDato(3));
 txf12.setText("Ocupado");
}else{
 txf6.setText("Butaca Disponible");
 txf7.setText("Butaca Disponible");
 txf12.setText("Desocupado");
 }
}
   if(f.equals(btButaca2[i][j])){
        if(tabla.buscar(btButaca2[i][j].getToolTipText(), 2) == true){
txf6.setText((String)tabla.darDato(1));
txf7.setText((String)tabla.darDato(0));
txf9.setText("" + tabla.darDato(4));
 txf10.setText("" + tabla.darDato(3));
txf12.setText("Ocupado");
 }
   else{
   txf6.setText("Butaca Disponible");
   txf7.setText("Butaca Disponible");
  txf12.setText("Desocupado");
}}}}}
 public void mouseExited(MouseEvent e){
   Object f = e.getSource();
    for(int i=0; i<7; i++){
     for(int j=0; j<3; j++){
     if(f.equals(btButaca1[i][j])){
txf6.setText("");
txf7.setText("");
txf9.setText("");
txf10.setText("");
txf12.setText("");
 }
    if(f.equals(btButaca2[i][j])){
txf6.setText("");
txf7.setText("");
txf9.setText("");
txf10.setText("");
txf12.setText("");
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
if(f.equals(bt1)){
     if(!txf5.getText().equals("") && !txf1.getText().equals("")){
         Object [] reg = {txf1.getText(),txf5.getText(),
  Integer.parseInt(txf3.getText()),Integer.parseInt(txf4.getText())};
    tabla.add(reg);
    txf1.setText("");
    txf3.setText("");
    txf4.setText("");
    txf5.setText("");
    dialg.dispose();
   }else{
 JOptionPane.showMessageDialog(this, "ERROR", "ATENCION",JOptionPane.WARNING_MESSAGE);
  } }
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
 }
 for(int i=0; i<tabla.datosColumna(0).length; i++){            
    this.cambiarColor((Integer)tabla.datosColumna(3)[i],
(Integer)tabla.datosColumna(4)[i],
(String)tabla.datosColumna(2)[i]);
 }}}