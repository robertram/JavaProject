/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcinema.Logica;

import javax.swing.JOptionPane;
import projectcinema.Bill;
import projectcinema.Change;
import projectcinema.Login;
import projectcinema.SelectMovie;
import projectcinema.TicketsMenu2;

/**
 *
 * @author robertramirez
 */
public class LogicaFactura {
    
    private String lblKidsPrice;
    private String lblAdultsPrice;
    
    private String txtMoney;
    private String lblTotalPay;
    
    
    public void EndTicketsMenu(TicketsMenu2 menu, int[] totales){
        Bill fact = new Bill(totales);
        fact.setVisible(true);
        
        menu.dispose();
    }
    
    public void Volver(Bill quit){
        TicketsMenu2 goback = new TicketsMenu2();
        goback.setVisible(true);
        
        quit.dispose();
        
    }
      
    public int[] Cambio(String MoneyPayed1, String TotalToPay1){
        
        this.txtMoney = MoneyPayed1;
        this.lblTotalPay = TotalToPay1;
        
        int MoneyPayed = Integer.parseInt(MoneyPayed1);
        int TotalToPay = Integer.parseInt(TotalToPay1);

        
        int Change= TotalToPay-MoneyPayed;
        
        
        if(TotalToPay > MoneyPayed){
        }
        else if(TotalToPay<MoneyPayed){
            
            
            //JOptionPane.showMessageDialog(obj, "No cuentas con suficiente dinero", "Cobro...", JOptionPane.WARNING_MESSAGE);
            
        }
        
        return new int[] {
            Change
            
        };
        
    }
    
    
    
}
