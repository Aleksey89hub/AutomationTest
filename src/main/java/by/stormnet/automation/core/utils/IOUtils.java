package by.stormnet.automation.core.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class IOUtils {public static String loadGenericProperties(String key, String fileName) {
    Properties props = new Properties();
    FileInputStream filePath;

    try {
        String filePathString = "src/main/resources/" + fileName + ".properties";
        filePath = new FileInputStream(filePathString);
        props.load(filePath);
        filePath.close();
    }  catch (IOException e) {
        e.printStackTrace();
    }

    return props.getProperty(key);
}
}
