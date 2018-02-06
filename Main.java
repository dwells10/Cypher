package edu.dwells10;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Dillon Wells
 */

public class Main {

    private final static FileOutput outFile = new FileOutput("decrypt.txt");
    private final static FileInput inFile = new FileInput("encrypt.txt");

    public static void main(String[] args) {


        String line;
        while ((line = inFile.fileReadLine()) != null){
            
             char letters[] = line.toCharArray();
             for (int i = 0; i< letters.length; i++){
                 letters[i] = (char)((int)letters[i]+5);
             }

             outFile.fileWrite(new String(letters));

        }

        inFile.fileClose();
        outFile.fileClose();

        FileInput indata = new FileInput("decrypt.txt");
        FileOutput outdata = new FileOutput("test.txt");
        
        while ((line = indata.fileReadLine()) != null){
            
            char letters[] = line.toCharArray();
            
            for (int i = 0; i< letters.length; i++){
                letters[i] = (char)((int)letters[i]-5);
            }

            outdata.fileWrite(new String(letters));

        }



        /*test commit*/

    }



}
