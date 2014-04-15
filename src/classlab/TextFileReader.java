/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tpronschinske
 */
public class TextFileReader implements FileReaderStrategy{

    private int fileSize;
    private List<String> fileInformation;
    private File file;

    public TextFileReader() {
        setFile("C:\\ContactTest.txt");
        setFileInformation(new ArrayList<String>());
        convertFile();
    }
    
    public TextFileReader(int fileSize) {
        setFile("C:\\ContactTest.txt");
        setFileInformation(new ArrayList<String>());
        convertFile();
    }

    @Override
    public final void setFile(String file) {
        File data = new File(file);
        this.file = data;
    }

    @Override
    public final void convertFile() {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new java.io.FileReader(getFile()));
            String line = in.readLine();
            while (line != null) {
                getFileInformation().add(line);
                line = in.readLine();  // strips out any carriage return chars    
            }
        } catch (IOException ioe) {
            System.out.println("Error reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception exception) {
            }
        }
    }

    @Override
    public final List<String> getFileInformation() {
        return fileInformation;
    }

    public final void setFileInformation(List<String> fileInformation) {
        this.fileInformation = fileInformation;
    }

    @Override
    public int getFileSize() {
        return fileSize;
    }

    @Override
    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public File getFile() {
        return file;
    }

    public int fileSize(){
        return getFileInformation().size()/ getFileSize();
    }

  
  
}
