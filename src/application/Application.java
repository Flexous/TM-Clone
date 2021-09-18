package application;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Application 
{
    private Logger logger;

    public Application()
    {

    }
    
    public static void main(String[] args) 
    {
        new Application().init();    
    }

    private void init()
    {
        File tmCloneFolder = new File(getAppDataPath()+"/TM-Clone");

        if (!tmCloneFolder.exists())
        {
            tmCloneFolder.mkdir();
        }

        getLogger().info("Application TM-Clone started...");

        DbConnection dbConnection = new DbConnection();
        dbConnection.open();
    }

    public Logger getLogger()
    {
        logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        File logFolder = new File(getAppDataPath()+"/TM-Clone/log");

        if (!logFolder.exists())
        {
            logFolder.mkdir();
        }
        
        try 
        {
            FileHandler fh = new FileHandler(logFolder+"/TM-Clone_" + System.currentTimeMillis() +".log");
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);   
            logger.addHandler(fh);
        } 
        catch (SecurityException | IOException e) 
        {
            e.printStackTrace();
        }

        return logger;
    }

    public String getAppDataPath()
    {
        return System.getenv("APPDATA").replace("\\", "/");
    }
}
