package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class SetupFromConfigFile {

    public Properties retrieveProperties(){
        Properties prop = new Properties();
        try {
            FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/config.properties");
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
