package me.superbiebel;

import java.io.File;
import java.net.URL;

public class Utils {
    
    public static File getResourceAsFile(String fileName) {
        URL url = Utils.class
                .getClassLoader()
                .getResource(fileName);
    
        if(url == null) {
            throw new IllegalArgumentException(fileName + " is not found 1");
        }
    
        return new File(url.getFile());
    }
}
