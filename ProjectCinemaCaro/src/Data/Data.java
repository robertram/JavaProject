
package Data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Data {
    public String spiderman(){
        File file = new File("C:\\Users\\Sofi\\Documents\\GitHub\\JavaProject\\ProjectCinemaCaro\\Data\\SpiderMan.txt");
        FileReader fileR = null;
        BufferedReader file2 = null;

        try {
            fileR = new FileReader(file);
            file2 = new BufferedReader(fileR);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo "+file.getName());
        }
        try {
            String lines = "";
            String result = "";
            while( ( lines = file2.readLine()) != null) {
                System.out.println(lines);
                result += lines;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
    public String IronMan(){
        File file = new File("C:\\Users\\Sofi\\Documents\\GitHub\\JavaProject\\ProjectCinemaCaro\\Data\\IronMan.txt");
        FileReader fileR = null;
        BufferedReader file2 = null;

        try {
            fileR = new FileReader(file);
            file2 = new BufferedReader(fileR);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo "+file.getName());
        }
        try {
            String lines = "";
            String result = "";
            while( ( lines = file2.readLine()) != null) {
                System.out.println(lines);
                result += lines;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }   
    public String Batman(){
        File file = new File("C:\\Users\\Sofi\\Documents\\GitHub\\JavaProject\\ProjectCinemaCaro\\Data\\Batman.txt");
        FileReader fileR = null;
        BufferedReader file2 = null;

        try {
            fileR = new FileReader(file);
            file2 = new BufferedReader(fileR);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo "+file.getName());
        }
        try {
            String lines = "";
            String result = "";
            while( ( lines = file2.readLine()) != null) {
                System.out.println(lines);
                result += lines;
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}

