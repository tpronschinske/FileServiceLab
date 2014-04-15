/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classlab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Celeste
 */
public class HyphenFileFormat implements FormatStrategy{
    private static final String NEW_LINE = "\n";
    private static final String HYPHEN = "-";
    private FileReaderStrategy fileReaderStrategy;

    public HyphenFileFormat(FileReaderStrategy file) {
        setFileReaderStrategy(file);
    }

    public FileReaderStrategy getFileReaderStrategy() {
        return fileReaderStrategy;
    }

    public final void setFileReaderStrategy(FileReaderStrategy file) {
        this.fileReaderStrategy = fileReaderStrategy;
    }

    public List<String> convertToHyphenFormat() {
        List<String> hyphenFormattedList = new ArrayList<>();
        int counter = 0;
        String format = "";
        for (String record : getFileReaderStrategy().getFileInformation()) {
            counter++;
            record = record.trim();
            format += record + HYPHEN;
        }
        return hyphenFormattedList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.fileReaderStrategy);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HyphenFileFormat other = (HyphenFileFormat) obj;
        if (!Objects.equals(this.fileReaderStrategy, other.fileReaderStrategy)) {
            return false;
        }
        return true;
    }



    // not sure if this is proper still working on it
    @Override
    public final List<Map<String, List<String>>> getAsMapList() {
        List<Map<String,List<String>>> info = new ArrayList<Map<String,List<String>>>();
        Map<String,List<String>> recordList = new HashMap<String, List<String>>();
        List<String> recordListArray = new ArrayList<String>();
        for (String record : convertToHyphenFormat()) {
            String[] recordInArray = record.split(HYPHEN);   
            for (int index = 0; index < getFileReaderStrategy().getFileSize(); index++) {
                recordListArray.add(recordInArray[index]);
                recordList.put(record, recordListArray);
            }
            info.add(recordList);
        }
        return info;
    }
}


