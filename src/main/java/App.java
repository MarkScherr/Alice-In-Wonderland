
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrsch
 */
public class App {
    public static void main(String[] args) {
        String bookName = "alice-in-wonderland.txt";
        Scanner scanner = null;
        int aliceCount = 0;
        int madHatterCount = 0;
        String stringLine = "";
        String nextWord = "";
 try {
            Scanner inputFile = new Scanner(new BufferedReader(new FileReader(bookName)));
            while (inputFile.hasNextLine()) {
                    stringLine = inputFile.nextLine();
                    
                    if (stringLine.toLowerCase().contains("alice")) {
                        aliceCount++;
                    }
                    if (stringLine.toLowerCase().contains("mad") ) {
                        madHatterCount++;
                 }
                
                    
             }
        } catch (IOException  ex) {
            System.out.println("Could not locate that file!");
        }
        
           
            System.out.println(aliceCount);
            System.out.println(madHatterCount);
        }
        
    
}
