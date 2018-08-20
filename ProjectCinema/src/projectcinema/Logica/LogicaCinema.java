
package projectcinema.Logica;

import Data.Data;
import javax.swing.ImageIcon;
import Data.DataSelectMovie;
import Data.DataRoomType;
import projectcinema.SelectMovie;
import projectcinema.TicketsMenu2;


public class LogicaCinema {

    public String lblMoviesName;
    
    
    
    Data dat= new Data();
    public String Movie(int movieIndex){
        switch (movieIndex){
            case 1:
                return dat.spiderman();
            case 2:
                return dat.IronMan();
            case 3:
                return dat.Batman();
        }
        return "";
    }
    
    DataSelectMovie data = new DataSelectMovie();
    public ImageIcon Picture (int movieIndex){
        switch (movieIndex){
            case 1:
                return data.spiderman();
                
            case 2:
                return data.ironman();
                
            case 3:
                return data.batman();
                
        }
        DataSelectMovie data4 = new DataSelectMovie();
        return data4.empty();
    }
    
    DataRoomType room = new DataRoomType();
    public String sndD (){
        
        return room.sndD();
    }
    public String trdD (){
        return room.trdD();
    }
    public String vip (){
        return room.vip();
    }
    
    public String MovieType(int movieIndex){
        switch (movieIndex){
            case 1:
                lblMoviesName = "SpiderMan";
                
            case 2:
                lblMoviesName = "IronMan";
                
            case 3:
                lblMoviesName = "Batman";
              
        }
        return lblMoviesName;
    }
}

