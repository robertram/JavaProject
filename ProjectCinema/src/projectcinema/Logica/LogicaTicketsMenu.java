/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcinema.Logica;

import projectcinema.Bill;
import projectcinema.SelectMovie;
import projectcinema.TicketsMenu2;

/**
 *
 * @author robertramirez
 */
public class LogicaTicketsMenu {

    String txtKids;
    String txtAdults;
    String txtSeniors;
    String lblMovieType;
    
    public int[] Prices(String numkids, String numadults, String numseniors, String movieType){
        
        this.txtKids = numkids;
        this.txtAdults = numadults;
        this.txtSeniors = numseniors;
        this.lblMovieType= movieType;
        
        int kids = Integer.parseInt(numkids);
        int adults = Integer.parseInt(numadults);
        int seniors = Integer.parseInt(numseniors);
        
        int kidsPrice = 0;
        int adultsPrice = 0;
        int seniorsPrice = 0;
        
        if (movieType.compareTo("2D") == 0) {
            kidsPrice = kids*1200;
            adultsPrice = adults*2500;
            seniorsPrice = seniors*1200;
        } else if (movieType.compareTo("3D") == 0) {
            kidsPrice=kids*2100;
            adultsPrice=adults*3500;
            seniorsPrice = seniors*2100; 
        } else {
            kidsPrice=kids*4700;
            adultsPrice=adults*6500;
            seniorsPrice = seniors*4700;
        }
        
        return new int[] {
            kidsPrice,
            adultsPrice,
            seniorsPrice,
            kidsPrice + adultsPrice + seniorsPrice
        };
    }
    
    
    
    
    public void back(){
        SelectMovie goback = new SelectMovie();
        goback.setVisible(true);
        
        TicketsMenu2 quit = new TicketsMenu2();
        quit.dispose();
    }
}
