/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.io.File;

/**
 *
 * @author tpronschinske
 */
public class ClassLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        FileReaderStrategy one = new TextFileReader();
        one.setFile("C:\\ContactTest.txt");
        
    }
    
}
