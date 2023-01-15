package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public Properties prop;
    String path = System.getProperty("user.dir") + File.separator + "src" +
            File.separator + File.separator + "main" + File.separator +
            "resources" + File.separator + "prop.properties";


    public Config(){

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);

        }catch (IOException e){

            e.printStackTrace();

        }

    }

}
