/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.util.List;



/**
 *
 * @author tpronschinske
 */
public interface FileReaderStrategy {
    
    
    
    public abstract void setFile(String file);
    
    public abstract void convertFile();
    
    public abstract void setFileSize(int fileSize);
    
    public abstract int getFileSize();
    
    public abstract List<String> getFileInformation();
    
}
