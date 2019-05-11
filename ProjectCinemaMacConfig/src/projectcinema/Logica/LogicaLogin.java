/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcinema.Logica;

import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import projectcinema.Login;
import projectcinema.SelectMovie;

/**
 *
 * @author robertramirez
 */
public class LogicaLogin {

    private static Scanner x;
    
    public void Autent(String username, String password){
        
        Login log= new Login();
        
        this.txtUsuario = username;
        this.pswPass = password;
        
        //String username="Bob69";
        //String password="123";
        String filepath="/Users/robertramirez/Desktop/JavaProject-master/ProjectCinema/Users.txt";
        
        VerifyLogin(username, password, filepath);
        
        
    
    }
    
    public static void VerifyLogin(String username, String password, String filepath) {
        Login log= new Login();
        
        boolean found=false;
        String tempUsername="";
        String tempPassword="";
        
        try{
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            
            while(x.hasNext() && !found){
                
                tempUsername = x.next();
                tempPassword = x.next();
                
                if(tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found= true;
                    
                    
                }
                /*else{
                    JOptionPane.showMessageDialog(log, "Usuario o Contraseña incorrecto!. Revise las mayúsculas", "Incorrecto", JOptionPane.ERROR_MESSAGE);
                }*/
                
            }
            if(found){
                SelectMovie window = new SelectMovie();
                window.show();
                log.dispose();
            
            }else{
                JOptionPane.showMessageDialog(log, "En este momento no podemos atender la solicitud", "Error!",JOptionPane.ERROR_MESSAGE);

            }
            
            
            x.close();
            System.out.println(found);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se encuentra en archivo", "Error!", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error");
            System.out.println("No se encontro el archivo");
        }
    
    }
    
    
    private String txtUsuario;
    private String pswPass;
    
    private final String User1 = "sofia";
    private final String Pass1 = "sofia";
    private final String User2 = "carolina";
    private final String Pass2 = "carolina";
    private final String User3 = "robert";
    private final String Pass3 = "robert";
    
    public void Autentication(String User, String Password){
        
        Login log= new Login();
        //log.txtUsuario.getText();
        
        this.txtUsuario = User;
        this.pswPass = Password;
        
        //String User = this.txtUsuario.getText();
        //String Password = this.pswPass.getText();
        
        if(User.equals(User1) && Password.equals(Pass1) || User.equals(User2) && Password.equals(Pass2) || User.equals(User3) && Password.equals(Pass3)){
            
            SelectMovie window = new SelectMovie();
            window.show();
            log.dispose();
        } else{
            JOptionPane.showMessageDialog(log, "°Usuario o Contraseña incorrecto!", "Incorrecto", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
}
