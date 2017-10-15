package Strategy.configStrategy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigStrategy
{
    //implement siglenton pattenr
    private Properties properties;
    private static ConfigStrategy ourInstance;

    //get the instace of the config
    public static ConfigStrategy getInstance()
    {
        return ourInstance == null ? ourInstance = new ConfigStrategy() : ourInstance;

    }

    //getting the config file (necesary for the strategy)
    private ConfigStrategy()
    {
        properties = new Properties();
        try
        {
            properties.load(new FileInputStream("config.properties"));
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //setting the properties (search the specific strategy to use)
    public String getProperties(String genderBooks)
    {
        return properties.getProperty(genderBooks);
    }
}
