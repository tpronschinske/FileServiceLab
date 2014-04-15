/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Celeste
 */
public interface FormatStrategy {
    
//    public abstract List<String> getFormattedList();
    
    public abstract List<Map<String,List<String>>> getAsMapList();
    
    
}
