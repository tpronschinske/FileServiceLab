/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Celeste
 */
public class TextFileWriter implements FileWriterStrategy {
    
    private boolean appendToFile;
    private PrintWriter file;
 
    private TextFileWriter(){
        setAppendToFile(true);
    }
    
    public TextFileWriter(String file) throws IOException{
        setAppendToFile(true);
        setPrintWriter(new PrintWriter(new BufferedWriter(new FileWriter(file, isAppendToFile()))));
    }
    
    public final boolean isAppendToFile() {
        return appendToFile;
    }

    public final void setAppendToFile(boolean appendToFile) {
        this.appendToFile = appendToFile;
    }

    public PrintWriter getPrintWriter() {
        return file;
    }

    public final void setPrintWriter(PrintWriter file) {
        this.file = file;
    }
    
    
    public void writeToFile(FormatStrategy fileFormat){
        ///
    }
    
}
