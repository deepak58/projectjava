package configs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/env/env.properties");
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("File not Found");
        }
    }
    public static String getprop(String key){
        return prop.getProperty(key);
    }

}
