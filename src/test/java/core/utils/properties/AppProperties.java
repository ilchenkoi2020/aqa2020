package core.utils.properties;

import core.utils.secret.SecretKeyGeneration;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class AppProperties{
    private static final String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final String appConfigPath = rootPath + "app.properties";
    private static final String environment = System.getProperty("environment");
    public static final String secretKey = getAppProperty("weatherstackApiAccessKey");

    public static String getAppProperty(String key) {
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
            return SecretKeyGeneration.decrypt(appProps.getProperty(key));
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getEnvUrl() {
        Properties appProps = new Properties();
        try {
            appProps.load(new FileInputStream(appConfigPath));
            return appProps.getProperty(environment + ".url");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
